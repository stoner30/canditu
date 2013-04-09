<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">
<head>
	<meta charset="utf-8"/>
	<title>餐地图！叫外卖，就上餐地图</title> 
	
	<!-- stylesheets -->  
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/base.css" type="text/css"/>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.qtip.min.css" type="text/css"/>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/place.css" type="text/css"/>
</head>

<body>
	<!--[if lt IE 9]><script src="js/ie9.js"></script><![endif]-->
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-migrate-1.1.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.qtip.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/main.js"></script>

	<div class="main-container">
		<jsp:include page="common/header.jsp" />
	
		<!--Main-->
		<div class="ym-container">
			<!--location and customer service bar-->
			<div class="ym-location-cs">
				<div class="ym-location">
				</div>

				<div class="ym-cs">
					<div><p>在线客服</p></div>
				</div>
			</div>
			<!--location and customer service bar-->

			<!--Left-->
			<div class="ym-left-city">
				<img src="images/tianjin.png">  
			</div>
			<!--Left-->

			<!--Right-->
			<div class="ym-right-district">
				<ul id="index-district">
				    <li id="last"><a href="building.html"><span id="last-text1">上次选择</span><span id="last-text2">新天地大厦</span></a></li>
				    <li><a href="building.html">南开区</a></li>
				    <li><a href="#">和平区</a></li>
				    <li><a href="#">河西区</a></li>
				    <li><a href="#">河东区</a></li>
				    <li><a href="#">河北区</a></li>
				    <li><a href="#">红桥区</a></li>
				</ul>
			</div>
			<!--Right-->
		</div>
		<!--Main-->

		<div class="push"><!-- not put anything here --></div>
	
		<jsp:include page="common/footer.jsp" />
	</div>
	
</body>
</html> 