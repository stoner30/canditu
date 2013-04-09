$(document).ready(function(){
	/*user account page*/
	user_account_modify();

});

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