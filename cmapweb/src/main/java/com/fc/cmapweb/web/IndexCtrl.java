package com.fc.cmapweb.web;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import javax.servlet.http.Cookie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fc.cmapweb.mgr.IBldgMgr;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fc.cmapweb.constant.ValidationMessage;
import com.fc.cmapweb.mgr.ICustomerMgr;
import com.fc.cmapweb.utils.StrUtil;
import com.fc.cmapweb.vo.Customer;
import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.fc.cmapweb.mgr.IDistrictMgr;
import com.fc.cmapweb.vo.Bldg;
import com.fc.cmapweb.vo.District;

@Controller
@RequestMapping("/")
public class IndexCtrl {
	
	@Autowired
	private ICustomerMgr customerMgr;
	
	@Autowired
	private Producer captchaProducer;
	
	@Autowired
	private IDistrictMgr districtMgr;

	@Autowired
	private IBldgMgr bldgMgr;

	private static final String TIANJINDISTCODE = "30000000";

	@RequestMapping
	public String index(HttpServletRequest request, Model model) {

		try {
			
			Cookie[] cookies = request.getCookies();
			
			String cookieBldgId = "";
			if(cookies != null) {
				for(Cookie cookie : cookies) {
					if(cookie.getName().equals("canditubldgid")) {
						cookieBldgId = cookie.getValue();
					}
				}
			}

			List<District> areaList = districtMgr.queryAreaByDistCode(TIANJINDISTCODE);
			boolean hasCookie = false;
			
			if(!cookieBldgId.equals("")) {
				Bldg bldg = bldgMgr.queryBldgByBldgId(Integer.valueOf(cookieBldgId));
				model.addAttribute("cookieBldg", bldg);
				hasCookie = true;
			}

			model.addAttribute("areaList", areaList);
			model.addAttribute("hasCookie",hasCookie);

		} catch (Exception e) {
			e.printStackTrace();
			return "/error404";
		}

		return "/index";

	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegistation() {
		return "/register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(HttpServletRequest request) {
		Customer customer = new Customer();
		
		String email = request.getParameter("email");
		String nickname = request.getParameter("nickname");
		String password = request.getParameter("password");
		
		customer.setEmail(email);
		customer.setEnabled(true);
		customer.setFirstOrder(true);
		customer.setNickname(nickname);
		customer.setPasswd(StrUtil.getMD5Str(password));
		customer.setRegTime(new Date());

		customerMgr.saveCustomer(customer);
		
		HttpSession session = request.getSession();
		session.setAttribute("customer", 
				customerMgr.queryCustomer(customer.getCustomerId()));
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/captcha", method = RequestMethod.GET)
	public String getCaptcha(HttpServletRequest request, HttpServletResponse response) {
		response.setDateHeader("Expires", 0);
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.addHeader("Cache-Control", "post-check=0, pre-check=0");
		response.setHeader("Pragma", "no-cache");
		response.setContentType("image/jpeg");
		
		String capText = captchaProducer.createText();
		request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);
		
		BufferedImage bi = captchaProducer.createImage(capText);
		ServletOutputStream out = null;
		try {
			out = response.getOutputStream();
			ImageIO.write(bi, "jpg", out);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(out!=null)
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		return null;
	}
	
	@RequestMapping(value = "/check/email", method = RequestMethod.GET)
	@ResponseBody
	public String checkEmail(HttpServletRequest request) {
		String email = request.getParameter("email");
		
		Customer customer = customerMgr.queryCustomerByEmail(email);
		if (customer == null) {
			return Boolean.TRUE.toString();
		}
		return ValidationMessage.MSG_ERROR_EXIST_EMAIL;
	}
	
	@RequestMapping(value = "/check/captcha", method = RequestMethod.GET)
	@ResponseBody
	public String checkCaptcha(HttpServletRequest request) {
		String captcha = request.getParameter("captcha");
		String expect = (String) request.getSession()
				.getAttribute(Constants.KAPTCHA_SESSION_KEY);
		
		if (captcha.equalsIgnoreCase(expect)) {
			return Boolean.TRUE.toString();
		} else {
			return ValidationMessage.MSG_ERROR_INCORRECT_CAPTCHA;
		}
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String toLogin() {
		return "/login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, Model model) {
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		
		Customer customer = customerMgr.queryCustomerByEmail(account);
		model.addAttribute("account", account);
		if (customer == null) {
			model.addAttribute("retCode", 1);
			return "/login";
		}
		
		if (!StrUtil.getMD5Str(password).equals(customer.getPasswd())) {
			model.addAttribute("retCode", 2);
			return "/login";
		}
		
		if (!customer.isEnabled()) {
			model.addAttribute("retCode", 3);
			return "/login";
		}
		
		customer.setLastLoginIp(request.getRemoteAddr());
		customer.setLastLoginTime(new Date());
		customerMgr.updateCustomer(customer);
		
		request.getSession().setAttribute("customer", customer);
		
		return "/";
	}
	
}
