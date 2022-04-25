document.addEventListener("DOMContentLoaded", () => {
  const table = document.querySelector("TABLE");

  // 현재 dom 화면에 있는 모든 TD 들을 가져와서
  // 모든 td 들에세 click event 를 부착하기
  const tds = document.querySelectorAll("TD");
  //   for (let i = 0; i < tds.length; i++) {
  //     tds[i].addEventListener("click", () => {
  //       alert(tbs[i].innerText);
  //     });
  //   }

  /* 이 스크립트가 실행되는 dom 화면에 table tag 가 있으명
if()  코드를 건너 실행하고
없으면 건너 뛰어라

만약 이 스크립트가 실행되는 dom 화면에 table tag 가 없으면
변수 table 에 는 nudefind 가 담기게 된다
그러면 if() 조건문에서 false 가 발생한다*/

  if (table) {
    table.addEventListener("click", (e) => {
      const target = e.target;
      const text = target.innerText;

      const className = target.className;
      const stNum = target.dataset.num;
      if (className === "name") {
        document.location.href = "/app/student/detail?stNum=" + stNum;
      }
    });
  }
});
