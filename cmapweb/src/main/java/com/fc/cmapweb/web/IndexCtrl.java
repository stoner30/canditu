package com.fc.cmapweb.web;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fc.cmapweb.mgr.IDistrictMgr;
import com.fc.cmapweb.vo.District;

@Controller
@RequestMapping("/")
public class IndexCtrl {

	@Autowired
	private IDistrictMgr districtMgr;


	private static final String TIANJINDISTCODE = "30000000";

	@RequestMapping
	public String index(HttpServletRequest request, Model model) {

		try {
			//Cookie c = new Cookie("canditu.distcode", "30000301");
			//response.addCookie(c);
			Cookie[] cookies = request.getCookies();
			
			String cookieDistCode = "";
			if(cookies != null) {
				for(Cookie cookie : cookies) {
					if(cookie.getName().equals("canditu.distcode")) {
						cookieDistCode = cookie.getValue();
					}
				}
			}

			List<District> areaList = districtMgr.queryAreaByDistCode(TIANJINDISTCODE);
			boolean hasCookie = false;
			
			if(!cookieDistCode.equals("")) {
				District district = districtMgr.queryDistrictByDistCode(cookieDistCode);
				model.addAttribute("cookieArea", district);
				hasCookie = true;
			}

			model.addAttribute("areaList", areaList);
			model.addAttribute("hasCookie",hasCookie);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/index";

	}
	
}
