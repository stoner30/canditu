$(document).ready(function(){
	//all pages
    opening_soon();
    contact_us();

    //select location
	location_cs();
	/*To fix ie6 hover*/
	ie6_hover();
});

/*opening soon hints*/
/*for all pages*/
function opening_soon() {
	$('.cake-tip').qtip(
		{
			content: {
				text: '即将推出'
			},
			position: {
				at: 'top center', // Position the tooltip above the link
				my: 'bottom left',
				viewport: $(window), // Keep the tooltip on-screen at all times
				effect: false // Disable positioning animation
			},
			show: {
				event: 'click',
				solo: true // Only show one tooltip at a time
			},
			hide: {
				event: 'mouseleave'
			},
			style: {
				classes: 'qtip-shadow qtip-bootstrap qtip-ie6' /* qtip-ie6 to fix ie 6*/
			}
		});	
}

/*contact us*/
/*for all pages*/
function contact_us() {
	$('#contact-us').qtip(
		{
			content: {
				text: '022-87023212</br>hi@canditu.com'
			},
			position: {
				at: 'top center', // Position the tooltip above the link
				my: 'bottom left',
				viewport: $(window), // Keep the tooltip on-screen at all times
				effect: false // Disable positioning animation
			},
			show: {
				event: 'mouseenter',
				solo: true // Only show one tooltip at a time
			},
			hide: {
				event: 'mouseleave'
			},
			style: {
				classes: 'qtip-shadow qtip-bootstrap qtip-ie6' /* qtip-ie6 to fix ie 6*/
			}
		});	
}

/*select locaiton*/
function location_cs() {
	$('#ym-location-others').hide();
	$('#ym-location-logo2').hide();
	$('#ym-location-logo1').click(function() {
		$(this).hide();
		$('#ym-location-others').show();
		$('#ym-location-logo2').show();
	});
	$('#ym-location-logo2').click(function() {
		$(this).hide();
		$('#ym-location-others').hide();
		$('#ym-location-logo1').show();
	});
	$('#ym-location-others').click(function() {
		self.location="building.html";
	});
}

/*To fix ie6 hover*/
function ie6_hover() {
	$('.ie6-hover').hover(function() {
		$(this).toggleClass('ie6_hover');
	});	
}