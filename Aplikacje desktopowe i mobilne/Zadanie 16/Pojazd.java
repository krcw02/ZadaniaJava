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

    public Pojazd(String numerRejestracyjny, String vin, String kolor, int cena, double spalanie, double stanZbiornika, int licznikKilometrow, int pojemnoscZbiornika, Silnik silnik) {
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
   

    public void tankuj(double iloscPaliwa){
        if(pojemnoscZbiornika < iloscPaliwa + stanZbiornika){
            System.out.println("Ilosc paliwa wykracza poza pojemnosc zbiornika!\nStan zbiornika "+stanZbiornika+" / "+pojemnoscZbiornika);
        }else{
            stanZbiornika += iloscPaliwa;
        }
    }

    public void jedz(double dystans){
        if(stanZbiornika<(dystans/100)*spalanie){
            System.out.println("Niewystarczająca ilość paliwa do przejechania dystansu\nStan zbiornika pozwala przejechać: "+String.format("%.2f" ,stanZbiornika/spalanie*100)+"km");
        }else{
            stanZbiornika -= (dystans/100)*spalanie;
            this.licznikKilometrow += dystans; 
        }
    }

    public double getStanZbiornika() {
        return this.stanZbiornika;
    }

    public int getLicznikKilometrow() {
        return this.licznikKilometrow;
    }

    public String toString() {
        return 
            "numerRejestracyjny='" + numerRejestracyjny + "'\n" +
            "vin='" + vin + "'\n" +
            "kolor='" + kolor + "'\n" +
            "cena='" + cena + " Zł'\n" +
            "spalanie='" + spalanie + " l/100km'\n" +
            "stanZbiornika='" + stanZbiornika + "'\n" +
            "licznikKilometrow='" + licznikKilometrow + " km'\n" +
            "pojemnoscZbiornika='" + pojemnoscZbiornika + "'\n" +
            "silnik='" + silnik.getSilnik() + "'\n";
    }

  
}

    
