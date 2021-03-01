public class Motocykl extends Pojazd{
    
    boolean bagaznik;

    public Motocykl(Boolean bagaznik, String numerRejestracyjny, String vin, String kolor, int cena, double spalanie, double stanZbiornika, int licznikKilometrow, int pojemnoscZbiornika, Silnik silnik) {
        super(numerRejestracyjny, vin, kolor, cena, spalanie, stanZbiornika, licznikKilometrow, pojemnoscZbiornika, silnik);
        this.bagaznik = bagaznik;
    }
  
 
    public String toString() {
        return super.toString() +
            " bagaznik='" + bagaznik + "'";
    }
}
