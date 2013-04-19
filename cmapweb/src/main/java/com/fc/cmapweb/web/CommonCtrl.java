package com.fc.cmapweb.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fc.cmapweb.vo.Customer;

@Controller
@RequestMapping("/common")
public class CommonCtrl {

	@RequestMapping("/header")
	public String header(HttpServletRequest request, Model model) {
		if (request.getSession(false) != null 
				&& request.getSession(false).getAttribute("customer") != null) {
			model.addAttribute("isLogin", true);
			
			Customer currentUsr = (Customer) request.getSession(false).getAttribute("customer");
			model.addAttribute("customer", currentUsr);
		}
		
		return "/common/header";
	}
	
	@RequestMapping("/footer")
	public String footer() {
		return "/common/footer";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request) {
		request.getSession(false).removeAttribute("customer");
		return "redirect:/";
	}
	
}
