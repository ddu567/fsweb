// section2: tabs
const tabBtn = document.querySelectorAll('#tabs li');
const tabCont = document.querySelectorAll('#tabs div');

for (let i = 0; i < tabBtn.length; i++) {
    tabBtn[i].onclick = (e) => {
        e.preventDefault();
        // tabs div의 "on" 클래스를 모두 제거
        for (let j = 0; j < tabBtn.length; j++) {
            tabCont[j].classList.remove('on');
        }
        // tabs div의 "on" 클래스를 버튼 누를 것만 추가
        tabCont[i].classList.add('on');
    };
};



// section3: text scroll motion

const tit1 = document.querySelector('#sec3 .tit1');
const tit2 = document.querySelector('#sec3 .tit2');
const proBtn = document.querySelector('#sec3 .proBtn');

window.onscroll = () => {
    // console.log(document.documentElement.scrollTop);
    let st = document.documentElement.scrollTop;
    if (st > 1700) {
        tit1.style.transform = 'translateX(0)';
        tit2.style.transform = 'translateX(0)';
        tit1.style.opacity = '1';
        tit2.style.opacity = '1';
        proBtn.style.opacity = '1';

    } else {
        tit1.style.transform = 'translateX(-400px)';
        tit2.style.transform = 'translateX(-400px)';
        tit1.style.opacity = '0';
        tit2.style.opacity = '0';
        proBtn.style.opacity = '0';

    }
;}


//section4: video player
const vidBtn = document.querySelector('.vid .btn');
const vidBtnSpan = vidBtn.querySelector('span');
const vidWrap = document.querySelector('.vid');
const vid =vidWrap.querySelector('video');
let vidState = 0;

// 비디오 위에 마우스를 올리면
vidWrap.onmouseenter = () => {
    // 비디오 플레이 버튼(삼각형)이 보인다.
    vidBtn.style.display = 'block';
};
// 비디오 영역 밖으로 벗어나면
vidWrap.onmouseleave = () => {
    // 비디오 플레이 버튼(삼각형)을 숨긴다.
    vidBtn.style.display = 'none';
};

// 버튼(play/pause)을 클릭하면
vidBtn.onclick = () => {
    // 플레이 되면서
    if (vidState === 0){
        // 비디오 실행
        vid.play();
        vidState = 1;
    } else {
        // 비디오 일시정지
        vid.pause();
        vidState = 0;
    }
    // span에 on 클래스 제거 비디오 플레이 버튼의 모양이 일시정지 버튼으로 바뀐다.
    // span에 on 클래스 추가 버튼 모양을 삼각형으로 바꾼다.
    // toggle은 add와 remove를 번갈아 적용시킨다.
    vidBtnSpan.classList.toggle('on');
    
};