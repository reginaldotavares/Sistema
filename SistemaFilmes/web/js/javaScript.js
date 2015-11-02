// JavaScript Document
$(function() {
    $(".slides").responsiveSlides({
        manualControls: '.slides',
        nav: true,
		pager: false,
		pause: true,
        speed: 500,
        namespace: "callbacks",
        before: function () {
          $('.events').append("<li>before event fired.</li>");
        },
        after: function () {
          $('.events').append("<li>after event fired.</li>");
        }
		
      });
  });
  
  