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
					<p>MODO新天地</p>
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
				<p class="catalog-title">分类</p>
				<ul class="catalog">
					<li><a href="${pageContext.request.contextPath}/rest/${bldg.bldgId}">推荐-收藏-畅销-最新</a></li>
					<c:forEach items="${restCatTypeList}" var="restCatType">
						<li><a href="${pageContext.request.contextPath}/restcat/${bldg.bldgId}/${restCatType.rctId}" <c:if test="${selectRestCatType.rctId == restCatType.rctId }">id="catafirst"</c:if>>${restCatType.rctName}</a></li>
					</c:forEach>
				</ul>	
			</div>
			<!--Left-->

			<!--Right-->
			<div class="ym-right-restaurant">		
				<!--delivery amount part-->		
				<p class="catalog-title-right">${selectRestCatType.rctName}</p>

				<div class="delivery-special">
					<ul>
						<div id="special-first">特色</br>标签</div>					
						<li>
							<input id="onePart" name="special" type="checkbox" value="isonepart" onclick="clickTagType('isonepart')"/>
							<label for="onePart">一份起送</label>
						</li>
						<li>
							<input id="ep" name="special" type="checkbox" value="isep" onclick="clickTagType('isep')"/>
							<label for="ep">环保餐盒</label>
						</li>
						<li>
							<input id="favorable" name="special" type="checkbox" value="isfavorable" onclick="clickTagType('isfavorable')"/>
							<label for="favorable">优惠活动</label>
						</li>
						<li>
							<input id="invoice" name="special" type="checkbox" value="isinvoice" onclick="clickTagType('isinvoice')"/>
							<label for="invoice">提供发票</label>
						</li>
					</ul>	
				</div>

				<div class="delivery-special">
					<ul>
						<div id="delivery-first">起送</br>金额</div>					
						<li><input id="lt10" name="delivery" type="radio" onclick="clickPriceRange('lt10')"/>
							<label for="lt10">小于10元</label>
						</li>
						<li><input id="10to15" name="delivery" type="radio" onclick="clickPriceRange('10to15')"/>
							<label for="10to15">10 - 15元</label>
						</li>
						<li><input id="15to20" name="delivery" type="radio" onclick="clickPriceRange('15to20')"/>
							<label for="15to20">15 - 20元</label>
						</li>
						<li><input id="20more" name="delivery" type="radio" onclick="clickPriceRange('20more')"/>
							<label for="20more">20元以上</label>
						</li>
						<li><input id="allAmount" name="delivery" type="radio" onclick="clickPriceRange('allAmount')"/>
							<label for="allAmount">全部</label>
						</li>
					</ul>	
				</div>
				<!--delivery amount part-->	

				<!--more restaurant catalog part-->
				<div class="rest-cata">
					<ul id="restUL">
						<c:forEach items="${restViewList}" var="restView">
							<li class="haspic" <c:if test="${restView.isOnePart}">isonepart="true"</c:if>
								<c:if test="${restView.isEP}">isep="true"</c:if>
								<c:if test="${restView.isFavorable}">isfavorable="true"</c:if>
								<c:if test="${restView.isInvoice}">isinvoice="true"</c:if>
								${restView.priceRange}="true" allAmount="true"
							>
									<a href="" class="fg"><img src="${pageContext.request.contextPath}/${picFileName}/rest${restView.restaurant.restId}.jpg"></a>
									<a href="" class="bg"><img src="${pageContext.request.contextPath}/${picFileName}/food${restView.restaurant.restId}.png"></a>
									<a href="menu.html" class="restaurant-sales"><span class="haspic-rest">${restView.restaurant.restName}</span><span class="haspic-sales">月销&nbsp;&nbsp;${restView.restaurant.salesVolume}&nbsp;&nbsp;单</span></a>
							</li>
						</c:forEach>
					</ul>
				</div>
				<!--more restaurant catalog part-->				
			</div>
			<!--Right-->

		</div>
		<!--Main-->

		<div class="push"><!-- not put anything here --></div>
	</div>

	<jsp:include page="${pageContext.request.contextPath}/common/footer" />
	
	<script type="text/javascript">
	
		
		function clickTagType() {
			var tagTypeSize = $(":checkbox[name=special]:checked").size();
			hideAll();
			if(tagTypeSize != 0) {
				$(":checkbox[name=special]:checked").each(function() {
					$("#restUL li[" + $(this).val() + "]").show();
				});
			} else {
				$("#restUL li").show();
			}
		}
		
		function hideAll() {
			$("#restUL li").hide();
		}
		
		function clickPriceRange(priceTag) {
			var tagTypeSize = $(":checkbox[name=special]:checked").size();
			hideAll();
			if(tagTypeSize != 0) {
				$(":checkbox[name=special]:checked").each(function() {
					$("#restUL li[" + $(this).val() + "][" + priceTag + "]").show();
				});
			} else {
				$("#restUL li[" + priceTag + "]").show();
			}
		}
		
	</script>

</body>
</html> 