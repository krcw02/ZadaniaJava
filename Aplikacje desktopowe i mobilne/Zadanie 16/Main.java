public class Main {
    //  https://github.com/krcw02/ZadaniaJava/tree/main/Aplikacje%20desktopowe%20i%20mobilne    
    public static void main(String[] args) {
        Pojazd auto1 = new SamochodOsobowy(5, "WSI R499", "MZA12345678901234", "czerwony", 25000, 5.5, 15, 80000, 55, new SilnikBenzynowy());
        Pojazd auto2 = new SamochodDostawczy(1000, "WS 5877", "MZA45678932012541", "zielony", 41000, 8.7, 20, 140000, 90, new SilnikDiesla());
        Pojazd auto3 = new Motocykl(true, "WS 8577", "MZA456789322852541", "czerwony", 40000, 20, 20, 30000, 20, new SilnikElektryczny());
        Pojazd auto4 = new MaszynaRobocza(false, "WSI 5874", "MXY487954546786541", "czarny", 50000, 10, 15, 75000, 125, new SilnikDiesla());

        auto1.jedz(300); // komunikat o niewystarczajacej ilosci paliwa
        auto1.tankuj(15); // tankowanie
        auto1.jedz(300); 

        System.out.println(auto1.getLicznikKilometrow());
        System.out.println(auto1.getStanZbiornika());

        auto2.tankuj(90); // komunikat o stanie zbiornika
        auto2.jedz(100);

        System.out.println(auto2);

        auto3.jedz(10);
        auto4.jedz(15);
    }
}
