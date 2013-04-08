//AD auto flag
var ADButtonFog = true;
$(document).ready(function(){
	//control Ad show
	Ad_control();
	/*turn over effect when hover the restarrant*/
    restaurant_overout();
});

/*Ad show control*/
function Ad_control(){
	//ad slideshow
	$('#crossfade li').hide().filter(':first').show();
	setInterval(slideshow, 3000);

    //AD Button
    $('#adselector li').bind('click', function () {
        $('#crossfade li.active').fadeOut('slow');
        //remove all active
        $('#crossfade li.active').removeClass('active');
        $('#adselector li.active').removeClass('active');
        //get Class
        var CurrentClass = $(this).attr('class');
        //append active
        $('.' + CurrentClass.toString()).addClass('active');
        $('#crossfade li.active').fadeIn('slow').end();   
        //disable AD auto
        ADButtonFog = false;
    });
}
function slideshow() {
    if (ADButtonFog) {
        $('#crossfade li:first').fadeOut('slow').next().fadeIn('slow').end().appendTo('#crossfade');
        $('#adselector li.active').removeClass('active').next().addClass('active');
        if (!$('#adselector li').hasClass("active")) { $('#adselector li:first').addClass('active'); }
    }
}

/*turn over effect when hover the restarrant*/
function restaurant_overout(){
	$('a.fg-s').show();
	$('a.fg').show();
	$('a.bg').show();
	
	$('a.s-favor').hide();
	$('a.restaurant-open').hide();
	$('a.restaurant-sales').hide();
	//favor
	$('.haspic-s').bind('mouseover', function() {
		$(this).children('a.s-favor').show();
		$(this).children('a.fg-s').hide();		
	});
	$('.haspic-s').bind('mouseout', function() {
		$(this).children('a.fg-s').show();
		$(this).children('a.s-favor').hide();
	});
	//open
	$('.haspic').bind('mouseover', function() {
		$(this).children('a.restaurant-open').show();
		$(this).children('a.bg').hide();
		$(this).children('a.fg').hide();
	});
	$('.haspic').bind('mouseout', function() {
		$(this).children('a.bg').show();
		$(this).children('a.fg').show();
		$(this).children('a.restaurant-open').hide();
	});
	//sales
	$('.haspic').bind('mouseover', function() {
		$(this).children('a.restaurant-sales').show();
		$(this).children('a.bg').hide();
		$(this).children('a.fg').hide();			
	});
	$('.haspic').bind('mouseout', function() {
		$(this).children('a.bg').show();
		$(this).children('a.fg').show();
		$(this).children('a.restaurant-sales').hide();
	});
}
