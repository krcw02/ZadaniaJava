public abstract class Pojazd {
    private String numerRejestracyjny;
    private String vin;
    private String kolor;
    private int cena;
    private double spalanie;
    private double stanZbiornika;
    private int licznikKilometrow;
    private int pojemnoscZbiornika;
    private Silnik silnik;

    public Pojazd(String numerRejestracyjny, String vin, String kolor, int cena, double spalanie, double stanZbiornika,
            int licznikKilometrow, int pojemnoscZbiornika, Silnik silnik) {
        this.numerRejestracyjny = numerRejestracyjny;
        this.vin = vin;
        this.kolor = kolor;
        this.cena = cena;
        this.spalanie = spalanie;
        this.stanZbiornika = stanZbiornika;
        this.licznikKilometrow = licznikKilometrow;
        this.pojemnoscZbiornika = pojemnoscZbiornika;
        this.silnik = silnik;
    }

    public void tankuj(double iloscPaliwa) {

        stanZbiornika += iloscPaliwa;

    }

    public void jedz(double dystans) {

        stanZbiornika -= (dystans / 100) * spalanie;
        this.licznikKilometrow += dystans;
    }

    // utworz metode toString wypisujaca wszystkie parametry obiektu np

    // public String toString() {
    // return nazwaTowaru + " " + String.format("%.2f", cena) + " zł " + ileSztuk +
    // " szt. " + String.format("%.2f", obliczWartosc()) + " zł";
    // }

}
