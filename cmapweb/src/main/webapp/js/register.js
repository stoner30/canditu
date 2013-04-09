$(document).ready(function(){
	/*register page*/
	register_page();
});

/*register page*/
function register_page() {
	$("#signupForm").validate();
	jQuery.extend(jQuery.validator.messages, {
	  required: "请填写必要的信息",
	  email: "请输入有效的邮箱地址",
	  equalTo: "两次密码不一样",
	  accept: "包含非法字符",
	  rangelength: jQuery.validator.format("长度只能在4-20个字符")
	});

	$('#term-details').click(function() {
		$('.register-terms').show();
	});
}