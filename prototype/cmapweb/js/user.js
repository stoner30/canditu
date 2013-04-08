$(document).ready(function(){
	
	/*login page*/
	login_page();
	/*register page*/
	register_page();
	/*history page*/
	service_raty_history();
	/*user account page*/
	user_account_modify();

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

/*rate service such as delivery and each meal in history dialog page*/
function service_raty_history() {
	
	//call dialog
	$('#raty-done').click(function () {
		$('#raty-modal-content').modal();
		return false;
	});
	//global cancel
	$('.dialog-cancel').click(function () {
		$.modal.close();
		return false;
	});


	//service raty details
	$.fn.raty.defaults.path = 'img';
	$('#star0').raty({
		noRatedMsg: "I'am readOnly and I haven't rated yet!", 
		width: 100,
		space: false,
		score: function() {
	    	return $(this).attr('data-score');
	 	 }
	});
	$('#star1').raty({
		noRatedMsg: "I'am readOnly and I haven't rated yet!", 
		width: 100,
		space: false,
		score: function() {
	    	return $(this).attr('data-score');
	 	 }
	});
	$('#star2').raty({
		noRatedMsg: "I'am readOnly and I haven't rated yet!", 
		width: 100,
		space: false,
		score: function() {
	    	return $(this).attr('data-score');
	 	 }
	});
	$('#star3').raty({
		noRatedMsg: "I'am readOnly and I haven't rated yet!", 
		width: 100,
		space: false,
		score: function() {
	    	return $(this).attr('data-score');
	 	 }
	});
}

/*change user account details*/
function user_account_modify() {
	$("#accountForm").validate();
	jQuery.extend(jQuery.validator.messages, {
	  required: "请填写必要的信息",
	  equalTo: "两次密码不一样",
	  accept: "包含非法字符",
	  rangelength: jQuery.validator.format("长度只能在4-20个字符")
	});


	//global cancel
	$('.dialog-cancel').click(function () {
		$.modal.close();
		return false;
	});
	//dialog - user account
	$('#dialog-nickname').click(function () {
		$('#nickname-modal-content').modal();
		return false;
	});
	$('#dialog-password').click(function () {
		$('#password-modal-content').modal();
		return false;
	});
}