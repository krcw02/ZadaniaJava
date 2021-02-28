public class SamochodOsobowy extends Pojazd {

    // Zastap x parametrem unikatowym dla klasy np liczba dzwi
    int x;


    public SamochodOsobowy(int x, String numerRejestracyjny, String vin, String kolor, int cena, double spalanie, double stanZbiornika, int licznikKilometrow, int pojemnoscZbiornika, Silnik silnik) {
        super(numerRejestracyjny, vin, kolor, cena, spalanie, stanZbiornika, licznikKilometrow, pojemnoscZbiornika, silnik);
        this.x = x;
    }
  
 
}