<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">
<head>
	<meta charset="utf-8"/>
	<title>餐地图！叫外卖，就上餐地图</title> 

	<!-- stylesheets -->  
	<link rel="stylesheet" href="css/base.css" type="text/css"/>
	<link rel="stylesheet" href="css/jquery.qtip.min.css" type="text/css"/>
	<link rel="stylesheet" href="css/user.css" type="text/css"/>
</head>
	
<body>
	<!--[if lt IE 9]><script src="js/ie9.js"></script><![endif]-->
	<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="js/jquery-migrate-1.1.1.min.js"></script>
	<script type="text/javascript" src="js/jquery.qtip.min.js"></script>
	<script type="text/javascript" src="js/jquery.validate.min.js"></script>
	<script type="text/javascript" src="js/jquery.metadata.js"></script>
	<script type="text/javascript" src="js/register.js"></script>

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
     	   	<!--register part-->
     	   	<div class="register-title"><div id="register-title-text">邮箱注册</div></div>

     	   	<div class="register-details">
				<form id="signupForm" method="post" action="${pageContext.request.contextPath}/register">
					<div>
						<label for="email">你的邮箱</label>
						<input id="email" name="email" />
					</div>
					<p class="login-hint">用于登录和找回密码，不会公开<p>

					<div>
				        <label for="nickname">你的昵称</label>
				        <input id="nickname" name="nickname" />
				    </div>
				    <p class="login-hint">4-20个字符，字母/中文/数字/下划线<p>

					<div>
					  	<label for="password">创建密码</label>
						<input id="password" name="password" type="password" />
					</div>
					<p class="login-hint">4-20个字符，区分大小写<p>

					<div>
						<label for="confirm_password">确认密码</label>
						<input id="confirm_password" name="confirm_password" type="password" />
					</div>
					<p class="login-hint">请再次输入密码，区分大小写<p>
					
					<div>
						<label for="captcha">验证码</label>
						<input id="captcha" name="captcha" type="text" />
					</div>
					<p class="login-hint">请输入下方验证码</p>
					
					<div>
						<label for="captcha" style="background-color: #FFFFFF;"></label>
						<a href="javascript:void(0)" class="link-captcha">
							<img id="imgCaptcha" alt="验证码" />
						</a>
						<span style="font-size: 12px; color: #EB3535; height: 42px; line-height: 42px;">
							看不清？<a href="javascript:void(0)" class="link-captcha" style="">[换一张]</a>
						</span>
					</div>
			
					<input class="submit submit-button" type="submit" value="同意以下协议并注册"/>
				</form>
     	   	</div>

     	   	<div class="register-sidebar">
     	   		<div id="register-sidebar1">已有餐地图账号？</div>

     	   		<div id="register-sidebar2"><a href="login.html">登录</a></div>

     	   	</div>

     	   	<div class="register-terms-title"><div id="term-details">《餐地图用户协议》</div></div>
     	   	<div class="register-terms"><div>协议
				本服务协议双方为上海拉扎斯信息科技有限公司旗下网站“餐地图”（下称“餐地图”）与餐地图网站用户，本服务协议具有合同效力。
				本服务协议内容包括协议正文及所有餐地图已经发布的或将来可能发布的各类规则。所有规则为协议不可分割的一部分，与协议正文具有同等法律效力。
				在本服务协议中没有以“规则”字样表示的链接文字所指示的文件不属于本服务协议的组成部分，而是其他内容的协议或有关参考资料，与本协议没有法律上的直接关系。
				用户在使用餐地图提供的各项服务的同时，承诺接受并遵守各项相关规则的规定。餐地图有权根据需要不时地制定、修改本协议或各类规则，如本协议有任何变更，餐地图将在网站上刊载公告，通知予用户。如用户不同意相关变更，必须停止使用“服务”。经修订的协议一经在餐地图网站公布后，立即自动生效。各类规则会在发布后生效，亦成为本协议的一部分。登录或继续使用“服务”将表示用户接受经修订的协议。除另行明确声明外，任何使“服务”范围扩大或功能增强的新内容均受本协议约束。
				用户确认本服务协议后，本服务协议即在用户和餐地图之间产生法律效力。请用户务必在注册之前认真阅读全部服务协议内容，如有任何疑问，可向餐地图咨询。
				无论用户事实上是否在注册之前认真阅读了本服务协议，只要用户点击协议正本下方的“确认”按钮并按照餐地图注册程序成功注册为用户，用户的行为仍然表示其同意并签署了本服务协议。
				本协议不涉及用户与餐地图其它用户之间因网站上交易而产生的法律关系及法律纠纷。
				定义
				餐地图网站上订餐、订外卖交易平台
				有关餐地图网站上订餐、订外卖交易平台上的术语或图标的含义，详见餐地图帮助。
				餐地图的用户：
				用户为具备完全民事行为能力的自然人，或者是具有合法经营资格的实体组织。
				无民事行为能力人、限制民事行为能力人以及无经营或特定经营资格的组织不当注册为餐地图用户或超过其民事权利或行为能力范围从事交易的，其与餐地图之间的服务协议自始无效，餐地图一经发现，有权立即注销该用户，并追究其使用餐地图“服务”的一切法律责任。
			</div></div>
	
		</div>
		<!--Main-->
		<div class="push"><!-- not put anything here --></div>	
	</div>
	
	<jsp:include page="${pageContext.request.contextPath}/common/footer" />
</body>
</html> 