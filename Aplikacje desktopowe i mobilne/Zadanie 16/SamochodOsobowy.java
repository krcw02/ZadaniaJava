public class SamochodOsobowy extends Pojazd {

    int liczbaDrzwi;


    public SamochodOsobowy(int liczbaDzwi, String numerRejestracyjny, String vin, String kolor, int cena, double spalanie, double stanZbiornika, int licznikKilometrow, int pojemnoscZbiornika, Silnik silnik) {
        super(numerRejestracyjny, vin, kolor, cena, spalanie, stanZbiornika, licznikKilometrow, pojemnoscZbiornika, silnik);
        this.liczbaDrzwi = liczbaDrzwi;
    }
  
 
    public String toString() {
        return super.toString() +
            " liczbaDrzwi='" + liczbaDrzwi + "'";
    }
}