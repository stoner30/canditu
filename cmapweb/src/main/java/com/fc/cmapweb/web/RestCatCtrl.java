package com.fc.cmapweb.web;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.fc.cmapweb.mgr.IBldgMgr;
import com.fc.cmapweb.mgr.IRestCatTypeMgr;
import com.fc.cmapweb.mgr.IRestaurantMgr;
import com.fc.cmapweb.utils.PropUtil;
import com.fc.cmapweb.vo.Bldg;
import com.fc.cmapweb.vo.RestCatType;
import com.fc.cmapweb.vo.view.RestViewVo;

@Controller
@RequestMapping("/restcat")
public class RestCatCtrl {

	@Autowired
	private IBldgMgr bldgMgr;
	
	@Autowired
	private IRestCatTypeMgr restCatTypeMgr;
	
	@Autowired
	private IRestaurantMgr restaurantMgr;

	@RequestMapping(value = "/{bldgId}/{restCatTypeId}",method = RequestMethod.GET)
	public String RestList(@PathVariable String bldgId, @PathVariable String restCatTypeId,
			HttpServletRequest request, HttpServletResponse response, Model model) {
		
		try {
			
			//保存图片文件夹名字
			String picFileName = PropUtil.getPropVal("pic.file.name");
			model.addAttribute("picFileName", picFileName);
			
			Bldg bldg = bldgMgr.queryBldgByBldgId(Integer.valueOf(bldgId));
			model.addAttribute("bldg", bldg);
			
			List<RestCatType> restCatTypeList = restCatTypeMgr.queryAllRestCatType();
			model.addAttribute("restCatTypeList", restCatTypeList);

			RestCatType selectRestCatType = restCatTypeMgr.queryRestCatTypeById(Integer.valueOf(restCatTypeId));
			model.addAttribute("selectRestCatType", selectRestCatType);
			
			List<RestViewVo> restViewList = restaurantMgr.queryRestaurantByRestCatTypeId(
					Integer.valueOf(restCatTypeId), Integer.valueOf(bldgId));
			model.addAttribute("restViewList", restViewList);

		} catch (Exception e) {
			e.printStackTrace();
			return "/4xx";
		}

		return "/restcat";

	}
	
}
