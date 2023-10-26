$(function () {

  // 팝업창 드래그
  $('.popup').draggable();

  // pop이라는 쿠키가 존재하고 그 값이 no와 같으면 .popup을 숨김
  if ($.cookie('pop') == "no") {
    $('.popup').hide();
  }
  // btn2 클릭시 숨김
  $('.btn2').click(function () {
    $('.popup').fadeOut('fast');
  });
  // btn1 클릭시 pop쿠키 생성하고 .popup 숨김
  $('.btn1').click(function () {
    // pop이라는 이름의 쿠키의 값이  no이고 기한은 1일이라는 쿠키 생성
    $.cookie('pop', 'no', { expires: 1 });
    $('.popup').fadeOut('fast');
  });


  // fixBox
  $(document).ready(function () {
    const currentPosition = parseInt($(".fixBox").css("top"));
    $(window).scroll(function () {
      const sct = $(window).scrollTop();
      $(".fixBox").stop().animate({ "top": sct + currentPosition + "px" }, 700);
    });
  });


  // .slider
  setTimeout(function () {
    $('.slider li h2').addClass('on');
    $('.slider li p').addClass('on');
  }, 1000); // 1초후 최초 한 번만 실행

  setTimeout(function () {
    $('.slider li h2').removeClass('on');
    $('.slider li p').removeClass('on');
  }, 5000); // 5초후 최초 한 번만 실행

  const bx = $('.slider').bxSlider({
    auto: true,
    stopAutoOnClick: true,
    pager: false,
    controls: false,
    mode: 'fade',
    pause: 5000, // 실제 슬라이드 속도 - setInterval과 비슷

    onSlideAfter: function () {
      $('.slider li').find('h2').removeClass('on');
      $('.slider li').find('p').removeClass('on');

      var k = bx.getCurrentSlide();
      $('.slider li .t1txt' + k).addClass('on');
      $('.slider li .t2txt' + k).addClass('on');
    }
  });

  $('.slider li .t1txt' + 2).addClass('on');



  $(window).scroll(function () {
    const sct = $(window).scrollTop();
    console.log(sct);

    // effect
    // section1
    if (sct >= 400) {
      $('#sec1 .secTitle').find('img').addClass('slide');
      setTimeout(function () {
        $('#sec1 .secTitle').find('h2').addClass('slide');
      }, 200);
      setTimeout(function () {
        $('#sec1 .secTitle').find('p').addClass('slide');
      }, 400);
    };
    if (sct >= 600) {
      $('#sec1 .effect li').eq(0).addClass('slide');
      setTimeout(function () {
        $('#sec1 .effect li').eq(1).addClass('slide');
      }, 200);
      setTimeout(function () {
        $('#sec1 .effect li').eq(2).addClass('slide');
      }, 400);
      setTimeout(function () {
        $('#sec1 .effect li').eq(3).addClass('slide');
      }, 600);
    };

    // section2
    if (sct >= 1000) {
      $('#sec2 .secTitle').find('img').addClass('slide');
      setTimeout(function () {
        $('#sec2 .secTitle').find('h2').addClass('slide');
      }, 200);
      setTimeout(function () {
        $('#sec2 .secTitle').find('p').addClass('slide');
      }, 400);
    };
    if (sct >= 1200) {
      $('#sec2 .effect li').eq(0).addClass('slide');
      setTimeout(function () {
        $('#sec2 .effect li').eq(1).addClass('slide');
      }, 200);
      setTimeout(function () {
        $('#sec2 .effect li').eq(2).addClass('slide');
      }, 400);
      setTimeout(function () {
        $('#sec2 .effect li').eq(3).addClass('slide');
      }, 600);
      setTimeout(function () {
        $('#sec2 .effect li').eq(4).addClass('slide');
      }, 800);
    };

    // section3
    if (sct >= 1700) {
      $('#sec3 .secTitle').find('img').addClass('slide');
      setTimeout(function () {
        $('#sec3 .secTitle').find('h2').addClass('slide');
      }, 200);
      setTimeout(function () {
        $('#sec3 .secTitle').find('p').addClass('slide');
      }, 400);
    };
    if (sct >= 2000) {
      $('#sec3 .effect li').eq(0).addClass('slide');
      setTimeout(function () {
        $('#sec3 .effect li').eq(1).addClass('slide');
      }, 200);
      setTimeout(function () {
        $('#sec3 .effect li').eq(2).addClass('slide');
      }, 400);
      setTimeout(function () {
        $('#sec3 .effect li').eq(3).addClass('slide');
      }, 600);
    };

    // section4
    if (sct >= 2400) {
      $('#sec4 .effect2').addClass('slide2');
    }

    // section5
    if (sct >= 2800) {
      $('#sec5 .effect2').addClass('slide2');
    }


  });
});