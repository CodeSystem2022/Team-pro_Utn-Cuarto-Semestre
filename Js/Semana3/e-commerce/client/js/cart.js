const modalContainer = document.getElementById("modal-container");
const modalOverlay = document.getElementById("modal-overlay");


const displayCart = () => {
    modalContainer.innerHTML = "";

    modalContainer.style.display = "block";
    modalOverlay.style.display = "block";
  //modal Header
 const modalHeader = document.createElement("div");

 const modalClose = document.create("div");
 modalClose.innerText = "";
 modalClose.className = "modal-close";
 modalHeader.append(modalClose);

 modalClose.addEventListener("click", () => {
 modalContainer.style.display = "none";
 modalOverlay.style.display = "none";
 });

 const modalTitle = document.createElement("div");
 modalTitle.innerText = "Cart";
 modalTitle.className = "modal-title";
 modalHeader.append(modalTitle);

 modalContainer.append(modalHeader);

};

cartBtn.addEventListener("click", displayCart);