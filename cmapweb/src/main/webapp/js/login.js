$(document).ready(function(){
	/*login page*/
	login_page();
	
	$("#loginForm").validate({
		rules: {
			account: { required: true },
			password: {
				required: true,
				rangelength: [4, 20]
			}
		},
		messages: {
			account: "请填写账号",
			password: {
				required: "请填写密码",
				rangelength: "密码长度最短4位，最长20位"
			}
		},
		onkeyup: false,
		errorLabelContainer: "#error-container",
		/*errorPlacement: function(error, element) {
			$("#error-container").html("");
			error.wrap('<span class="error_msg"></span>').appendTo($("#error-container"));
			// error.appendTo($("#error-container"));
//			$("#error-container")
//			$("#login-wrong-password").html($(error).html());
//			$("#" + error.htmlFor).focus();
		},*/
		debug: true
	});
	
	jQuery.extend(jQuery.validator.messages, {
		required: "请填写必要的信息",
		rangelength: jQuery.validator.format("长度只能在4-20个字符")
	});
});

/*login page*/
function login_page() {
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
}