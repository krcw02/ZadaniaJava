document.querySelector(".wyslij").addEventListener("click", () => {
    let form = document.querySelector(".formularz");
    wzory = {
        "imie" :  /^[A-Z][a-z]{2,}$/,
        "nazwisko" :  /^[A-Z][a-z]{2,}$/,
        "email" : /^[0-9a-zA-Z_.-]+@[0-9a-zA-Z.-]+.[a-zA-Z]{2,3}$/,
        "pesel" : /^[0-9]{11}$/,
        "telefon" : /^[+]+[0-9]{11}$/
    };
    for(let p in wzory){
        console.log(p)
        if(form[p]){
            if(!wzory[p].test(form[p].value)){
                alert(`Pole ${p} ma nieprawidłową wartość`);
                return false;
            }
        }
    }
    alert("Wszystkie pola poprawne");
    return true;
})