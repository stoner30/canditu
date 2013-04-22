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
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/place.css" type="text/css"/>
</head>

<body>
	<!--[if lt IE 9]><script src="js/ie9.js"></script><![endif]-->
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-migrate-1.1.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.qtip.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/main.js"></script>

	<div class="main-container">
		<jsp:include page="${pageContext.request.contextPath}/common/header" />
	
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
				<img src="${pageContext.request.contextPath}/images/tianjin.png">  
			</div>
			<!--Left-->

			<!--Right-->
			<div class="ym-right-district">
				<ul id="index-district">
				    <c:if test="${hasCookie}">
				    	<li id="last"><a href="${pageContext.request.contextPath}/rest/${cookieBldg.bldgId}"><span id="last-text1">上次选择</span><span id="last-text2">${cookieBldg.bldgName}</span></a></li>
				    </c:if>
				    <c:forEach items="${areaList}" var="area">
				   		<li><a href="${pageContext.request.contextPath}/area/${area.distCode}">${area.distName}</a></li>
				    </c:forEach>
				</ul>
			</div>
			<!--Right-->
		</div>
		<!--Main-->

		<div class="push"><!-- not put anything here --></div>
	</div>

	<jsp:include page="${pageContext.request.contextPath}/common/footer" />
</body>
</html> 