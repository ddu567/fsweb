/* fullpage.js - layout */
const docEle = document.documentElement;
const sec = document.querySelectorAll('.sec');


for (let i = 0; i < sec.length; i++){
    sec[i].onwheel = (e) => {
        // 기본 이벤트 방지
        e.preventDefault();
        if (e.deltaY > 0) {
            // 마우스휠 내림
            // sec[0]~sec[3]
            // 이벤트 함수 안에서 사용한 this는 이벤트가 발생한 요소
            let next = e.currentTarget.nextElementSibling.offsetTop;
            console.log(this);
            docEle.scrollTop = next;
        }    else {
            // 마우스휠 올림
            let prev = e.currentTarget.previousElementSibling.offsetTop;
            docEle.scrollTop = prev; 
        }
        console.log(wrap.offsetHeight);
    };
}