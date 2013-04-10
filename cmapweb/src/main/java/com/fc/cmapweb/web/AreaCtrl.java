package com.fc.cmapweb.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fc.cmapweb.mgr.IBldgMgr;
import com.fc.cmapweb.mgr.IDistrictMgr;
import com.fc.cmapweb.vo.Bldg;
import com.fc.cmapweb.vo.District;

@Controller
@RequestMapping("/area")
public class AreaCtrl {

	@Autowired
	private IDistrictMgr districtMgr;
	
	@Autowired
	private IBldgMgr bldgMgr;

	@RequestMapping(value = "/{distCode}",method = RequestMethod.GET)
	public String init(@PathVariable String distCode, Model model) {
		
		try {
			
			List<Bldg> list = bldgMgr.queryBldgByDistCode(distCode);
			
			District district = districtMgr.queryDistrictByDistCode(distCode);

			model.addAttribute("bldgList", list);
			model.addAttribute("area", district);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "/area";
	}
	

}
