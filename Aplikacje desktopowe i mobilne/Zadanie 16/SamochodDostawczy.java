public class SamochodDostawczy extends Pojazd {
    int ladownosc;

    public SamochodDostawczy(int ladownosc, String numerRejestracyjny, String vin, String kolor, int cena,
            double spalanie, double stanZbiornika, int licznikKilometrow, int pojemnoscZbiornika, Silnik silnik) {
        super(numerRejestracyjny, vin, kolor, cena, spalanie, stanZbiornika, licznikKilometrow, pojemnoscZbiornika,
                silnik);
                this.ladownosc = ladownosc;

    }

    public String toString() {
        return super.toString() +
            " ladownosc='" + ladownosc + " KM'";
    }


}
