/* 
    https://ddu567.github.io/fsweb/70_project/index.html -> userAgent
    https://ddu567.github.io/fsweb/70_project/main.html -> 데스크탑
    https://ddu567.github.io/fsweb/70_project/m/index.html -> 모바일
*/

const ua = navigator.userAgent.toLowerCase();

if (ua.indexOf('window') > 0) {
    // ua에 window 문자열이 있으면 true -> 데스크탑
    location.href = 'https://ddu567.github.io/fsweb/70_project/index.html';
} else {
    location.href = 'https://ddu567.github.io/fsweb/70_project/m/index.html';
}
