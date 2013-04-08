$(document).ready(function(){
	/*switch among three tag*/
    menu_info_comment();
	/*make order dynamic*/
	make_order();
	/*pop up when user click menu - show more such as ingredient*/
	menu_popup();
	/*control each menu*/
	menu_control();
	/*delivery service by raty*/
	service_raty();
	/*show the delivery fees when user hover*/
	service_hints() 
	/*dialog to show for more details to submit by user*/
	menu_dialog();
});

/*switch among three tag*/
function menu_info_comment()
{
	$('#menu-part').show();
	$('#restinfo-part').hide();
	$('#comment-part').hide();
	$('#menu-tab1').click(function() {
		$('#menu-tab1 a').addClass('menu-tab-active');
		$('#menu-tab2 a').removeClass('menu-tab-active');
		$('#menu-tab3 a').removeClass('menu-tab-active');
		$('#menu-part').show();
		$('#restinfo-part').hide();
		$('#comment-part').hide();
	});
	$('#menu-tab2').click(function() {
		$('#menu-tab1 a').removeClass('menu-tab-active');
		$('#menu-tab2 a').addClass('menu-tab-active');
		$('#menu-tab3 a').removeClass('menu-tab-active');

		$('#menu-part').hide();
		$('#restinfo-part').show();
		$('#comment-part').hide();
	});
	$('#menu-tab3').click(function() {
		$('#menu-tab1 a').removeClass('menu-tab-active');
		$('#menu-tab2 a').removeClass('menu-tab-active');
		$('#menu-tab3 a').addClass('menu-tab-active');
		$('#menu-part').hide();
		$('#restinfo-part').hide();
		$('#comment-part').show();
	});
}

/*make order dynamic*/
function make_order() {
	$('.menu-menu ul li').click(function() {
		$('.menu-order-go').show();
		$('.menu-order div').show();
		var elem = '<div class="menu-order-dynamic"><div class="menu-order-dynamic-left"><div class="each-order-no"><img id="minus-pic" src="images/minus.png"><div class="each-order-no-digit">1</div><img id="plus-pic" src="images/plus.png"></div></div><div class="menu-order-dynamic-right"><div class="each-order-nameprice"><div class="each-order-name">石锅拌饭</div><div class="each-order-yuan">元</div><div class="each-order-price">26</div></div><div class="each-order-details">中号，鸡蛋，芝麻酱</div><div class="each-order-showopen"><div class="each-order-showopen-text"><div id="show-toggle">展开详情</div></div><img id="cross-pic" src="images/cross.png"></div></div></div>';
		$('.menu-order-go').before(elem);
		//change bgcolora
		$(".menu-order-dynamic").each(function(){
			$('.menu-order-dynamic:odd').removeClass('even-type').addClass('odd-type');
			$('.menu-order-dynamic:even').removeClass('odd-type').addClass('even-type');
		});

		$('.each-order-details').hide();
	});
}

/*menu ingredient*/
function menu_popup() {
	// Make sure to only match links to wikipedia with a rel tag
	$('.qtip-food').each(function()
	{
		// We make use of the .each() loop to gain access to each element via the "this" keyword...
		$(this).qtip(
		{
			content: {
				// Set the text to an image HTML string with the correct src URL to the loading image you want to use
				text: '<img class="throbber" src="images/d.png" alt="Loading..." />' + '<div class="qtip-ingred">牛肉110g,南瓜1/4个 贝壳4-6个，豆腐半块 辣椒2个</div>'
				/*
				ajax: {
					url: $(this).attr('rel') // Use the rel attribute of each element for the url to load
				},
				title: {
					text: 'Wikipedia - ' + $(this).text(), // Give the tooltip a title using each elements text
					button: true
				}*/
			},
			position: {
				at: 'top center', // Position the tooltip above the link
				my: 'bottom left',
				viewport: $(window), // Keep the tooltip on-screen at all times
				effect: false // Disable positioning animation
			},
			show: {
				event: 'mouseover',
				solo: true // Only show one tooltip at a time
			},
			hide: {
				event: 'mouseleave'
			},
			style: {
				classes: 'qtip-menu qtip-tipped'
			}
		})
	})
}

/*control each menu*/
function menu_control() {
	//menu delete button
	$('#cross-pic').live('click', function() {
        $(this).parents('.menu-order-dynamic').remove();
       	$('.menu-order-dynamic:odd').removeClass('even-type').addClass('odd-type');
		$('.menu-order-dynamic:even').removeClass('odd-type').addClass('even-type');
		if($('.menu-order-dynamic').size()==0) {
			$('.menu-order-go').hide();
			$('.menu-order div').hide();
		}
	});

	//menu content(details) control
	$('.each-order-showopen-text').live('click', function() {	         
	    $(this).parent().parent().children('.each-order-details').toggle('');
	    if($(this).children('#show-toggle').text()=='展开详情'){
	    	$(this).children('#show-toggle').text('收起详情');
	    }else{
	    	$(this).children('#show-toggle').text('展开详情');
	    }	    
	});
}

/*delivery service by raty*/
function service_raty() {
	$('#raty-done').click(function () {
		$('#raty-modal-content').modal();
		return false;
	});
	$.fn.raty.defaults.path = 'img';
	$('#star').raty({
		readOnly: true, 
		noRatedMsg: "I'am readOnly and I haven't rated yet!", 
		width: 100,
		space: false,
		score: function() {
	    	return $(this).attr('data-score');
	 	 }
	});
}

/*show the delivery fees when user hover*/
function service_hints() {
	$('.not-enough').qtip(
		{
			content: {
				// Set the text to an image HTML string with the correct src URL to the loading image you want to use
				text: '<div class="not-enough-div">选择12:00点收餐，并11:30之前下单，无起送金额限制！</div>'
			},
			position: {
				at: 'top center', // Position the tooltip above the link
				my: 'bottom left',
				viewport: $(window), // Keep the tooltip on-screen at all times
				effect: false // Disable positioning animation
			},
			show: {
				event: 'mouseover',
				solo: true // Only show one tooltip at a time
			},
			hide: {
				event: 'mouseleave'
			},
			style: {
				classes: 'qtip-not-enough qtip-tipped'
			}
		})
}

/*dialog to show for more details to submit by user*/
function menu_dialog() {
	//dialog - menu open
	$('#dialog').click(function () {
		$('#menu-modal-content').modal();
		return false;
	});
    //dialog global cancel
	$('.dialog-cancel').click(function () {
		$.modal.close();
		return false;
	});	
}