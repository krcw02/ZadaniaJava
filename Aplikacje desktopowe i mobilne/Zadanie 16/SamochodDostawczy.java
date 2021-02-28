public class SamochodDostawczy extends Pojazd {

    // Zastap x parametrem unikatowym dla klasy np liczba dzwi
    int x;
    

    public SamochodDostawczy(int x, String numerRejestracyjny, String vin, String kolor, int cena,
            double spalanie, double stanZbiornika, int licznikKilometrow, int pojemnoscZbiornika, Silnik silnik) {
        super(numerRejestracyjny, vin, kolor, cena, spalanie, stanZbiornika, licznikKilometrow, pojemnoscZbiornika,
                silnik);
                this.x = x;

    }


}
