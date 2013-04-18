package com.fc.cmapweb.web;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fc.cmapweb.constant.ValidationMessage;
import com.fc.cmapweb.mgr.ICustomerMgr;
import com.fc.cmapweb.utils.StrUtil;
import com.fc.cmapweb.vo.Customer;
import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;

@Controller
@RequestMapping("/")
public class IndexCtrl {
	
	@Autowired
	private ICustomerMgr customerMgr;
	
	@Autowired
	private Producer captchaProducer;

	@RequestMapping(method = RequestMethod.GET)
	public String index() {
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
	
}
