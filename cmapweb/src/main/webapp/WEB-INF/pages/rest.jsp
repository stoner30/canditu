<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="zh">
<head>
	<meta charset="utf-8"/>
	<title>餐地图！叫外卖，就上餐地图</title> 
	
	<!-- stylesheets -->  
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/base.css" type="text/css"/>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.qtip.min.css" type="text/css"/>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/food.css" type="text/css"/>
</head>

<body>
	<!--[if lt IE 9]><script src="js/ie9.js"></script><![endif]-->
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-migrate-1.1.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.qtip.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/main.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/restinfo.js"></script>

	<div class="main-container">
		<jsp:include page="${pageContext.request.contextPath}/common/header" />
	
		<!--Main-->
		<div class="ym-container">
			<!--location and customer service bar-->
			<div class="ym-location-cs">
				<div class="ym-location">
					<p>${bldg.bldgName }</p>
					<img id="ym-location-logo1" src="${pageContext.request.contextPath}/images/arrow_left.png">
					<p id="ym-location-others"><a href="${pageContext.request.contextPath}/area/${bldg.district.distCode}">看看其他地点</a></p>
					<img id="ym-location-logo2" src="${pageContext.request.contextPath}/images/arrow_right.png">
				</div>

				<div class="ym-cs">
					<div><p>在线客服</p></div>
				</div>
			</div>
			<!--location and customer service bar-->

			<!--Left-->
			<div class="ym-left-catalog">
				<p id="announcement-title">公告</p>
				<ol id="announcement">
					<c:forEach items="${noticeBldgList}" var="noticeBldg">
						<li>${noticeBldg.notice.noticeContent }</li>
					</c:forEach>
				</ol>
				<p class="catalog-title">分类</p>
				<ul class="catalog">
					<li><a href="#/-1" id="catafirst">推荐-收藏-畅销-最新</a></li>
					<c:forEach items="${restCatTypeList}" var="restCatType">
						<li><a href="#/${restCatType.rctId }">${restCatType.rctName}</a></li>
					</c:forEach>
				</ul>	
			</div>
			<!--Left-->


			<!--Right-->
			<div class="ym-right-restaurant">
				<!--ad part-->
			    <div class="ad">			
					<ul id="crossfade">
						<c:forEach items="${adBldgList}" varStatus="vs" var="adBldg">
							<li class="ad-no${vs.count }"><a href="#"><img src="${pageContext.request.contextPath}/images/${adBldg.ad.adId }.png" title="${adBldg.ad.adDesc }"/></a></li>
						</c:forEach>
					</ul>
					<ul id="adselector">
						<li class="ad-no1 active"><span>1</span></li>
						<li class="ad-no2"><span>2</span></li>
						<li class="ad-no3"><span>3</span></li>
						<li class="ad-no4"><span>4</span></li>
					</ul>
				</div>
				<!--ad part-->

			
				<!--recommend part-->
				<div class="recommend">
					<p>网站推荐</p>
					<div class="recommend-detail">
						<c:forEach items="${recommendBldgList}" var="recommendBldg">
							<a href="#"><img src="${pageContext.request.contextPath}/${picFileName }/${recommendBldg.recommend.recommendId }.png"></a>
						</c:forEach>
					</div>	
				</div>
				<!--recommend part-->

				<c:if test="${myFavorList != null}">
					<!--favor part-->
					<div class="favor">
						<ul>
							<li id="favor_first"><a href="">我的</br>收藏</a></li>
							
							<c:forEach items="${myFavorList}" var="myFavor">
								<li class="haspic-s">
									<a href="#" class="fg-s"><img src="${pageContext.request.contextPath}/${picFileName}/rest${myFavor.restaurant.restId}.jpg"></a>
									<a href="#" class="s-favor"><div class="haspic-s-rest">${myFavor.restaurant.restName}</div></a>
								</li>
							</c:forEach>
							
						</ul>
					</div>
					<!--favor part-->
				</c:if>
				
				<!--opennew part-->
				<div class="opennew">
					<ul>
						<li id="opennew_first"><a href="">新开张</a></li>
						
						<c:forEach items="${newlyOpenedList}" var="newlyOpened">
							<li class="haspic">
								<a href="" class="fg"><img src="${pageContext.request.contextPath}/${picFileName}/rest${newlyOpened.restId}.jpg"></a>
								<a href="" class="bg"><img src="${pageContext.request.contextPath}/${picFileName}/food${newlyOpened.restId}.png"></a>
								<a href="#" class="restaurant-open"><span class="haspic-rest">${newlyOpened.restName}</span></a>
							</li>
						</c:forEach>
						
					</ul>
				</div>
				<!--opennew part-->


				<!--goodsales part-->
				<div class="goodsales">
					<ul>
						<!--first cell-->
						<li id="goodsales_first"><a href="">销量</br>不错的</a></li>
						<c:forEach items="${salesOfGoodList}" var="salesOfGood">
							<li class="haspic">
								<a href="" class="fg"><img src="${pageContext.request.contextPath}/${picFileName}/rest${salesOfGood.restId}.jpg"></a>
								<a href="" class="bg"><img src="${pageContext.request.contextPath}/${picFileName}/food${salesOfGood.restId}.png"></a>
								<a href="menu.html" class="restaurant-sales"><span class="haspic-rest">${salesOfGood.restName}</span><span class="haspic-sales">月销&nbsp;&nbsp;${salesOfGood.salesVolume}&nbsp;&nbsp;单</span></a>
							</li>
						</c:forEach>
						<!--last-->
					</ul>
				</div>
				<!--goodsales part-->
	
			</div>
			<!--Right-->

		</div>
		<!--Main-->

		<div class="push"><!-- not put anything here --></div>
	</div>

	<jsp:include page="${pageContext.request.contextPath}/common/footer" />
</body>
</html> 