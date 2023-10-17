$(function () {
    $('.bxslider').bxSlider({
        mode: 'fade',
    });
});


$(function () {
    setTimeout(function () {
        $('.bxslider li .mtext').addClass('on');
        $('.bxslider li .stext').addClass('on');
    }, 1000); // 1초후 최초 한 번만 실행

    var bx = $('.bxslider').bxSlider({
        auto: true,
        controls: false,
        pager: false,
        mode: 'fade',
        pause: 5000, // 실제 슬라이드 속도 - setInterval과 비슷
        autoHover: true,
        onSlideBefore: function () { },
        onSlideAfter: function () {
            var k = bx.getCurrentSlide();
            $('.bxslider li').find('h2').removeClass('on');
            $('.bxslider li').find('p').removeClass('on');
            $('.bxslider li .text' + k).addClass('on');
            $('.bxslider li .atext' + k).addClass('on');
        }

    });

});