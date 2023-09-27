$(function () {

  //화면 가로로 넓힐 때 모바일 화면에서 열려있던 메뉴 닫힘
  var status
  $(window).resize(function () {
    var w = $(this).width(); // 화면의 가로 사이즈를 w에 대입

    if (w <= 850) {
      status = "mobile";
    } else {
      status = "pc";
      if ($('.mobile_nav').hasClass('active') == true) {
        $(".mobile_nav").removeClass('active');
        $(".mobile_nav .sub").hide();
        $(".transparency").removeClass('active');
        $(".container").removeClass('active');
      }
    }
  });

  // 모바일
  // 삼선 모양 클릭 시 메뉴 보임
  $(".mobile_tab").click(function () {
    $(".mobile_nav").addClass("active");
    $(".transparency").addClass("active");
    $(".container").addClass("active");
  });
  // 메뉴 열렸을 때 왼쪽 화면 어둡게
  $(".transparency").click(function () {
    $(".mobile_nav").removeClass("active");
    $(".mobile_nav .sub ").hide();
    $(".transparency").removeClass("active");
    $(".container").removeClass("active");
  })
  // 왼쪽 화면 클릭 시 메뉴 닫힘
  $(".mobile_nav > ul > li > a").click(function () {
    if ($(this).next('.sub').css('display') === 'none') {
      $(".mobile_nav .sub").slideUp(300);
      $(this).next('.sub').slideDown(300);
    } else {
      $(this).next('.sub').slideUp(300);
    }
    return false;
  });

  // 메인 메뉴 호버 시 서브 메뉴 보임
  $(".nav > ul").hover(function () {
    // over
    $(this).addClass('over')
  }, function () {
    // out
    $(this).removeClass('over')
  }
  );

});