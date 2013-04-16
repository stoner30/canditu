package com.fc.cmapweb.web;

import java.util.List;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.fc.cmapweb.mgr.IADMgr;
import com.fc.cmapweb.mgr.IBldgMgr;
import com.fc.cmapweb.mgr.IMyFavorMgr;
import com.fc.cmapweb.mgr.INoticeBldgMgr;
import com.fc.cmapweb.mgr.IRecommendBldgMgr;
import com.fc.cmapweb.mgr.IRestCatTypeMgr;
import com.fc.cmapweb.mgr.IRestaurantMgr;
import com.fc.cmapweb.utils.PropUtil;
import com.fc.cmapweb.vo.AdBldg;
import com.fc.cmapweb.vo.Bldg;
import com.fc.cmapweb.vo.Customer;
import com.fc.cmapweb.vo.MyFavor;
import com.fc.cmapweb.vo.NoticeBldg;
import com.fc.cmapweb.vo.RecommendBldg;
import com.fc.cmapweb.vo.RestCatType;
import com.fc.cmapweb.vo.Restaurant;

@Controller
@RequestMapping("/rest")
public class RestCtrl {
	
	@Autowired
	private IBldgMgr bldgMgr;
	
	@Autowired
	private IADMgr aDMgr;
	
	@Autowired
	private IRestCatTypeMgr restCatTypeMgr;
	
	@Autowired
	private INoticeBldgMgr noticeBldgMgr;

	@Autowired
	private IRecommendBldgMgr recommendBldgMgr;

	@Autowired
	private IRestaurantMgr restaurantMgr;

	@Autowired IMyFavorMgr myFavorMgr;

	@RequestMapping(value = "/{bldgId}",method = RequestMethod.GET)
	public String getRestListByBldgMgr(@PathVariable String bldgId, HttpServletRequest request, 
			HttpServletResponse response, Model model) {
		
		try {
			
			//将本次选择的bldgId放入cookie
			Cookie cookie = new Cookie("canditu.distcode", bldgId);
			response.addCookie(cookie);
			
			Bldg bldg = bldgMgr.queryBldgByBldgId(Integer.valueOf(bldgId));
			model.addAttribute("bldg", bldg);
			
			List<AdBldg> adBldgList = aDMgr.getADBldgByBldgId(Integer.valueOf(bldgId));
			model.addAttribute("adBldgList", adBldgList);

			List<RestCatType> restCatTypeList = restCatTypeMgr.queryAllRestCatType();
			model.addAttribute("restCatTypeList", restCatTypeList);
			
			List<NoticeBldg> noticeBldgList = noticeBldgMgr.queryNoticeBldgByBldgId(Integer.valueOf(bldgId));
			model.addAttribute("noticeBldgList", noticeBldgList);

			List<RecommendBldg> recommendBldgList = recommendBldgMgr.queryRecommendBldgByBldgId(Integer.valueOf(bldgId));
			model.addAttribute("recommendBldgList", recommendBldgList);
			
			//新开张的
			List<Restaurant> newlyOpenedList = restaurantMgr.queryNewlyOpenedRestaurantByBldgId(Integer.valueOf(bldgId));
			model.addAttribute("newlyOpenedList",newlyOpenedList);
			
			//销量不错的
			List<Restaurant> salesOfGoodList = restaurantMgr.querySalesOfGoodListByBldgId(Integer.valueOf(bldgId));
			model.addAttribute("salesOfGoodList", salesOfGoodList);
			
			//我的收藏
			Customer customer = (Customer) request.getSession().getAttribute("customer");
			if(customer != null) {
				List<MyFavor> myFavorList = myFavorMgr.queryMyFavorByCustomerId(customer.getCustomerId());
				model.addAttribute("myFavorList", myFavorList);
			}
			
			//保存图片文件夹名字
			String picFileName = PropUtil.getPropVal("pic.file.name");
			model.addAttribute("picFileName", picFileName);

		} catch (Exception e) {
			e.printStackTrace();
			return "/error404";
		}
		return "/rest";
		
	}
}
