document.addEventListener("DOMContentLoaded", () => {
  const day_select = document.querySelector("button.join");

  day_select?.addEventListener("change", (e) => {
    // 이벤트 핸들링이 설정된 자신
    const current = e.currentTarget;
    const sc_num = current.dataset.sc_num;
    const sc_id = current.value;

    document.location.href = `${rootPath}/detail?seq=${ADDR.a_seq}`;
  });
});
