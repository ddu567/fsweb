/* fullpage.js - layout */
const docEle = document.documentElement;
const sec = document.querySelectorAll('.sec');
const wh = window.innerHeight;


for (let i = 0; i < sec.length; i++){
    sec[i].onwheel = (e) => {
        // 기본 이벤트 방지
        e.preventDefault();
        if (e.deltaY > 0) {
            // 마우스휠 내림
            // sec[0]~sec[3]
            if (docEle.scrollTop > wh * (sec.length - 2) + 100) return;
            let next = e.currentTarget.nextElementSibling.offsetTop;
            
            docEle.scrollTop = next;
        }    else {
            // 마우스휠 올림
            // html의 스크롤 값이 창의 높이보다 작으면 wheel 이벤트 멈춤
            if (docEle.scrollTop < wh) return;
            /*
                try ~ catch 예외 처리

                try {
                    정상 코드;
                } catch(err){
                    에러일 때 코드;
                } finally {
                    무조건 실행할 코드;
                }
            */
            /* try {
                let prev = e.currentTarget.previousElementSibling.offsetTop;
                docEle.scrollTop = prev; 
            } catch(err) {
                alert('끝까지 올라왔습니다.');
            } */
            let prev = e.currentTarget.previousElementSibling.offsetTop;
            docEle.scrollTop = prev; 
        }
        console.log(wrap.offsetHeight);
    };
}