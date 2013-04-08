$(document).ready(function(){
	/*login page*/
	login_page();
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