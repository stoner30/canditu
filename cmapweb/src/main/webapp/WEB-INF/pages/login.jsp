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
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/user.css" type="text/css"/>
	
	<style type="text/css">
		#error-container label {
			height:27px; 
			margin-right:10px;
			background:#eb3535;
			padding: 5px 10px;
			color:#FFFFFF;
			font-family:"宋体";
			font-size:14px;
			line-height:180%;
		}
		/* .error_msg {
			height:27px; 
			margin-right:10px;
			background:#eb3535;
			padding: 5px 10px;
			color:#FFFFFF;
			font-family:"宋体";
			font-size:14px;
			line-height:180%;
		} */
		
		label.error {
			width: 100%;
		}
	</style>
</head>
	
<body>
	<div class="main-container">
		<jsp:include page="${pageContext.request.contextPath}/common/header" />

		<!--Main-->
		<div class="ym-container">
			<!--location and customer service bar-->
			<div class="ym-location-cs">
				<div class="ym-cs">
					<div><p>在线客服</p></div>
				</div>
			</div>
			<!--location and customer service bar-->

     	   	<!--here-->
     	   	<!--login part-->
     	   	<div class="login-title"><div id="login-title-text">登录</div></div>

     	   	<div class="login-details">
     	   		<div id="error-container" style="margin-bottom: 10px;">
     	   		<c:choose>
     	   			<c:when test="${retCode == 1}">
     	   				<label>该账号不存在</label>
     	   			</c:when>
     	   			<c:when test="${retCode == 2}">
     	   				<label>密码错误</label>
     	   			</c:when>
     	   			<c:when test="${retCode == 3}">
     	   				<label>该账户已被锁定，请联系客服人员进行解锁</label>
     	   			</c:when>
     	   		</c:choose>
     	   		</div>

				<form id="loginForm" method="post" action="${pageContext.request.contextPath}/login">	   
					<div class="loginForm-div">
				        <label for="account">账号</label>
				        <input id="account" name="account" class="required" value="${account}" />
				    </div>
				    
					<div class="loginForm-div">
					  	<label for="password">密码</label>
						<input id="password" name="password" type="password" class="{required:true,minlength:5}" />
						<div id="loginForm-forget"><a href="password_forgot.html">忘记密码？</a></div>
					</div>
					
					<div>
						<c:choose>
							<c:when test="${rememberme}">
								<div id="check-container1" class="clicked">
									<div class="black-space"></div><div id="login-text1">记住账号</div>
								</div>
							</c:when>
							<c:otherwise>
								<div id="check-container1">
									<div class="black-space"></div><div id="login-text1">记住账号</div>
								</div>
							</c:otherwise>
						</c:choose>
						<div style="float: left; height: 24px; margin-right: 30px; margin-top: 15px; width: 120px;"></div>
						<!-- <div id="check-container2"><div class="black-space"></div><div id="login-text2">两周内自动登录</div></div> -->
					</div>
					
					<c:choose>
						<c:when test="${rememberme}">
							<input type="hidden" name="rememberme" id="rememberme" value="true" />
						</c:when>
						<c:otherwise>
							<input type="hidden" name="rememberme" id="rememberme" value="false" />
						</c:otherwise>
					</c:choose>
					
					<input class="login-button ie6-hover" type="submit" value="登录"/>
				</form>
     	   	</div>

     	   	<div class="login-sidebar">
     	   		<div id="login-sidebar1">
     	   			<div id="login-sidebar1-a">还不是餐地图用户？</div>
     	   			<div id="login-sidebar1-b">现在免费注册成为餐地图用户，立即享受便捷的订餐服务。</div>
     	   		</div>
     	   		<div id="login-sidebar2"><a href="${pageContext.request.contextPath}/register">快速注册</a></div>
     	   	</div>

     	   	<div class="login-QQs"><div id="login-QQs-text">用合作网站账号登录</div></div>
     	   	<div class="login-QQs-ul">
     	   		<ul>
					<li class="ie6-hover">QQ</li>
					<li class="ie6-hover">新浪微博</li>
     	   		</ul>	
     	   	</div>	 	
		</div>
		<!--Main-->
		<div class="push"><!-- not put anything here --></div>
	</div>

	<jsp:include page="${pageContext.request.contextPath}/common/footer" />
	
	<!--[if lt IE 9]><script src="${pageContext.request.contextPath}/js/ie9.js"></script><![endif]-->
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-migrate-1.1.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.qtip.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.validate.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/main.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			$('#check-container1, #check-container2').click(function() {
				$(this).children('.black-space').removeClass('hovered');
				$(this).toggleClass('clicked');
			});
			$('#check-container1, #check-container2').mouseenter(function() {
				$(this).children('.black-space').addClass('hovered');
			});
			$('#check-container1, #check-container2').mouseleave(function() {
				$(this).children('.black-space').removeClass('hovered');
			});
			
			$("#loginForm").validate({
				rules: {
					account: { required: true },
					password: {
						required: true,
						rangelength: [4, 20]
					}
				},
				messages: {
					account: "请输入账号",
					password: {
						required: "请输入密码",
						rangelength: "密码长度最短4位，最长20位"
					}
				},
				onkeyup: false,
				errorLabelContainer: "#error-container",
				submitHandler: function(form) {
					if ($("#check-container1").hasClass("clicked")) {
						$("#rememberme").val("true");
					} else {
						$("#rememberme").val("false");
					}
					
					form.submit();
				}
			});
		});
	</script>
</body>
</html> 