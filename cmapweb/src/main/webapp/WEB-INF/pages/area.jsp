<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/main.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.listnav-2.1.ie6.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/building.js"></script>

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
				<img src="${pageContext.request.contextPath}/images/tianjin.png">  
			</div>
			<!--Left-->

			<!--Right-->
			<div class="ym-right-building">
				
				<!--按字母排序楼宇-->
				<!--显示字母序的层。注：此层id必需是ul的id+"-nav"-->
				<div class="building-return">
				    <h3><a href="${pageContext.request.contextPath}/"><img src="${pageContext.request.contextPath}/images/left_s.png"></a></h3>
				    <h2>${area.distName }</h2>
				</div>

				<div id="buildingList-nav">
				</div>

				<div class="building-col">
					<!-- 兼容IE6 加clear:both;-->
				    <ul id="buildingList" style="clear:both;">
						<!--To IE 6, should input first letter manually;-->
				         <c:forEach items="${bldgList}" var="bldg">
				         	  <li><a href="${pageContext.request.contextPath}/rest/${bldg.bldgId }" name="${bldg.pinYin}">${bldg.bldgName }</a></li>
				         </c:forEach>	          
				    </ul>
				</div>
				<!--按字母排序楼宇-->

			</div>
			<!--Right-->
		</div>
		<!--Main-->

		<div class="push"><!-- not put anything here --></div>
	</div>

	<jsp:include page="common/footer.jsp" />
</body>
</html> 