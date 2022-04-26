document.addEventListener("DOMContentLoaded", () => {
  const table = document.querySelector("TABLE");

  // 현재 DOM화면에 있는 모든 TD들을 가져와서 모든 TD들을 click event를 부착하기
  // 모든 TD마다 클릭이벤트를 부여하면 렉이 심해질 것
  //   const tds = document.querySelectorAll("TD");
  //   for (let i = 0; i < tds.length; i++) {
  //     tds[i].addEventListener("click", () => {
  //       alert(tds[i].innertext);
  //     });
  //   }

  /*
  이 스크립트가 실행되는 DOM 화면에 tablet tag가 있으면
  if() {} 코드를 실행하고 없으면 건너뛰어라
  
  만약 이 스크립트가 실행되는 DOM화면에 table tag가 없으면 변수 tavle에는 undefined가 담기게 된다.
  그러면 if() 조건문에서 false가 발생한다( = if(){}를 건너뛴다)
  */
  if (table) {
    table.addEventListener("click", (e) => {
      // table에 클릭이 되지만, 가장 위에 있는 td에 이벤트를 발생시킨다.
      // 이벤트 버블링을 이용한 것
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
