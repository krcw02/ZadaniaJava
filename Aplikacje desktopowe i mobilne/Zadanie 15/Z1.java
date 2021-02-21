import java.io.IOException;

class Z1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ListaZamowien lista = new ListaZamowien();
        // (nazwa, ilosc, cena)
        Pozycja p1 = new Pozycja("Chleb", 1, 3.5);
        
        Zamowienie z1 = new Zamowienie(10);
        z1.dodajPozycje(p1);
        lista.dodajZamowienie(z1);


        // // // // // // // // // // // //
        // ZAPIS
        ZapisOdczyt.zapis("jaks_nazwa.dat", lista);

        // // // // // // // // // // // //
        // ODCZYT

        ListaZamowien x = ZapisOdczyt.odczyt("jaks_nazwa.dat");
        System.out.println(x);

    }
}
