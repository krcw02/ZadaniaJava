public class MaszynaRobocza extends Pojazd{
    
    boolean plugSniezny;


    public MaszynaRobocza(Boolean plugSniezny, String numerRejestracyjny, String vin, String kolor, int cena, double spalanie, double stanZbiornika, int licznikKilometrow, int pojemnoscZbiornika, Silnik silnik) {
        super(numerRejestracyjny, vin, kolor, cena, spalanie, stanZbiornika, licznikKilometrow, pojemnoscZbiornika, silnik);
        this.plugSniezny = plugSniezny;
    }
  
 
    public String toString() {
        return super.toString() +
            " plugSniezny='" + plugSniezny + "'";
    }
}
