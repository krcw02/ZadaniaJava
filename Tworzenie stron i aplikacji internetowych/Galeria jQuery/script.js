window.onload = () => {
    let galeria = document.querySelectorAll(".galery_IMG");
    for (let i = 0; i < galeria.length; i++) {
        galeria[i].addEventListener("click", () => {
            $(".main_IMG").fadeOut(300, () => {
                document.querySelector(".main_IMG").src = galeria[i].src
            }).fadeIn(300);
        })
    }
}