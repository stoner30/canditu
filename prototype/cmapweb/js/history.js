$(document).ready(function(){
	/*history page*/
	service_raty_history();

});

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