<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style type="text/css">
	.msg_tip {
		position: relative; 
		bottom: 8px;
		left: -2px; 
		width: 16px;
		height: 16px; 
		display: inline-block;
		line-height: 16px; 
		text-align: center; 
		font-weight: bolder;
		font-size: 11px; 
		color: #FFFFFF; 
		background-repeat: no-repeat; 
		background-image: url(${pageContext.request.contextPath}/images/tip.png);
	}
</style>

<!--Nav-head-->
<div class="ym-hlist">
  	<div class="ym-navleft">
  		<ul>
			<li><a class="active" href="#">订外卖</a></li>
			<li class="cake-tip"><a href="#">订蛋糕</a></li>
 		</ul>
  	</div>

	<div class="ym-navcenter">
		<a href="${pageContext.request.contextPath}">
			<img src="${pageContext.request.contextPath}/images/canditu_logo.jpg">
		</a>
	</div>

	<div class="ym-navright" style="text-align: right;">
		<c:choose>
			<c:when test="${isLogin}">
				<ul>
					<li><a href="${pageContext.request.contextPath}/common/logout">退出</a></li>
					<li><a href="#">${customer.nickname}</a></li>
		 		</ul>
			</c:when>
			<c:otherwise>
				<ul>
					<li><a href="login.html">登录</a></li>
					<li><a href="${pageContext.request.contextPath}/register">注册</a></li>
			 	</ul>
			</c:otherwise>
		</c:choose>
		<%-- <c:choose>
			<c:when test="${isLogin}">
				<ul class="topnav">
					<li style="margin-right: 80px;">
						<a id="msg" href="#" style="color: #FFFFFF; line-height: 38px; width: 150px;">
							<span style="position: relative; top: -13px;">你好，${customer.nickname}！</span>
							<!-- <span class="msg_tip">1</span> -->
						</a>
						
						<ul class="subnav">
							<li><a href="#">新订单</a></li>
							<li><a href="#">历史订单</a></li>
							<li><a href="#">管理账户信息</a></li>
							<li><a href="#">我的收藏</a></li>
						</ul>
					</li>
				</ul>
			</c:when>
			<c:otherwise>
				<ul>
					<li><a href="login.html">登录</a></li>
					<li><a href="${pageContext.request.contextPath}/register">注册</a></li>
			 	</ul>
			</c:otherwise>
		</c:choose> --%>
 	</div>
</div>