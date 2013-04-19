package com.fc.cmapweb.web;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fc.cmapweb.mgr.IBldgMgr;
import com.fc.cmapweb.mgr.IDistrictMgr;
import com.fc.cmapweb.vo.Bldg;
import com.fc.cmapweb.vo.District;

@Controller
@RequestMapping("/")
public class IndexCtrl {

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
	
}
