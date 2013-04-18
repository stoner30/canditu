$(document).ready(function() {
	/*register page*/
	register_page();
	
	$(".link-captcha").click(function() {
		$("#imgCaptcha").hide().attr("src", "http://localhost:9090/captcha?" + Math.floor(Math.random() * 100)).fadeIn();
	});
	
	$(".link-captcha").click();
});



/*register page*/
function register_page() {
	$("#signupForm").validate({
		rules: {
			email: {
				required: true,
				email: true,
				remote: {
					url: "http://localhost:9090/check/email",
					type: "get",
					dataType: "text"
				}
			},
			nickname: {
				required: true,
				rangelength: [4, 20]
			},
			password: {
				required: true,
				rangelength: [4, 20]
			},
			confirm_password: {
				required: true,
				rangelength: [4, 20],
				equalTo: "#password"
			},
			captcha: {
				required: true,
				remote: {
					url: "http://localhost:9090/check/captcha",
					type: "get",
					dataType: "text"
				}
			}
		},
		onkeyup: false
	});
	
	jQuery.extend(jQuery.validator.messages, {
		required: "请填写必要的信息",
		email: "请输入有效的邮箱地址",
		equalTo: "两次密码不一样",
		accept: "包含非法字符",
		rangelength: jQuery.validator.format("长度只能在4-20个字符"),
		remote: "请填写正确的验证码"
	});

	$('#term-details').click(function() {
		$('.register-terms').show();
	});
}