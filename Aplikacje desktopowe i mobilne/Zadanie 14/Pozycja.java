public class Pozycja {
    String nazwaTowaru;
    int ileSztuk = 0;
    double cena = 0;
    String ascii_KEY = "6175746f72204b616d696c204b727973746f77736b69";
    Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    public double obliczWartosc() {
        return ileSztuk * cena;
    }

    public String toString() {
        return nazwaTowaru + " " + cena + " zł " + ileSztuk + " szt. " + obliczWartosc() + " zł";
    }
    public double obliczWartoscZRabatem(){
        if(this.ileSztuk<5){
            return ileSztuk * cena;
        }
        else if(this.ileSztuk<=10){
            return (ileSztuk * cena)*0.95;
        }
        else if(this.ileSztuk<=20){
            return (ileSztuk * cena)*0.90;
        }
        else{
            return (ileSztuk * cena)*0.85;
        }
    }
}
