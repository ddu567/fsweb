$(function () {
  setTimeout(function () {
    $('.slider li .text0').addClass('on');
    $('.slider li .atext0').addClass('on');
  }, 1000); // 1초후 최초 한 번만 실행

  var bx = $('.slider').bxSlider({
    auto: true,
    controls: false,
    pager: false,
    mode: 'fade',
    pause: 5000, // 실제 슬라이드 속도 - setInterval과 비슷
    autoHover: true,
    onSlideAfter: function () {
      $('.slider li').find('h2').removeClass('on');
      $('.slider li').find('p').removeClass('on');
      var k = bx.getCurrentSlide();
      $('.slider li .text' + k).addClass('on');
      $('.slider li .atext' + k).addClass('on');
    }

  });

});