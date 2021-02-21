import java.io.Serializable;

public class Pozycja implements Serializable {
    String nazwaTowaru;
    int ileSztuk = 0;
    double cena = 0;
   
    Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    public double obliczWartosc() {
        return ileSztuk * cena;
    }

    public String toString() {
        return nazwaTowaru + " " + String.format("%.2f", cena) + " zł " + ileSztuk + " szt. " + String.format("%.2f", obliczWartosc()) + " zł";
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
