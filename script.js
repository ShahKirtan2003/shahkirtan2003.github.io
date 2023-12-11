document.querySelector(".plus").addEventListener("click", function () {
  console.log("Plus clicked");
  document.querySelector(".value").innerHTML =
    parseInt(document.querySelector(".value").innerHTML) + 1;
});

document.querySelector(".minus").addEventListener("click", function () {
  console.log("Minus clicked");
  document.querySelector(".value").innerHTML =
    parseInt(document.querySelector(".value").innerHTML) - 1;
});
