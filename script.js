let operation = 1;

window.onload = () => {
  document.querySelectorAll(".operator").forEach((item) => {
    item.addEventListener("click", (e) => {
      e.preventDefault();
      let currOperator = e.target;
      if (currOperator.textContent == "+") operation = 1;
      if (currOperator.textContent == "-") operation = 2;
      if (currOperator.textContent == "x") operation = 3;
      if (currOperator.textContent == "/") operation = 4;
      document.querySelectorAll(".operator").forEach((element) => {
        element.classList.remove("selected");
      });
      item.classList.add("selected");
    });
  });

  document.querySelector(".form").addEventListener("submit", (e) => {
    e.preventDefault();
    let num1 = parseInt(document.getElementById("num1").value);
    let num2 = parseInt(document.getElementById("num2").value);
    let result = 0;
    if (isNaN(num1) || isNaN(num2)) {
      document.querySelector(".answer").innerHTML = "Enter both the numbers";
      return;
    }
    if (operation == 1) result = num1 + num2;
    if (operation == 2) result = num1 - num2;
    if (operation == 3) result = num1 * num2;
    if (operation == 4) {
      if (num2 == 0) {
        document.querySelector(".answer").innerHTML = "Invalid input";
        return;
      }
      result = num1 / num2;
    }
    document.querySelector(".answer").innerHTML = "The result is " + result;
  });
};
