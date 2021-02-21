import java.io.IOException;

class Z1 {
    public static void main(String[] args) throws IOException {

        ListaZamowien listaZamowien = new ListaZamowien();

        Pozycja p1 = new Pozycja("Chleb", 1, 3.5);
        Pozycja p2 = new Pozycja("Cukier", 2, 4);
        Pozycja p3 = new Pozycja("Ciasto", 5, 8);
        Pozycja p4 = new Pozycja("Baton", 2, 1.2);
        Pozycja p5 = new Pozycja("Banany", 4, 2);
        Pozycja p6 = new Pozycja("Mleko", 7, 2.2);

        Zamowienie z1 = new Zamowienie(10);
        z1.dodajPozycje(p1);
        z1.dodajPozycje(p2);
        listaZamowien.dodajZamowienie(z1);
       

        Zamowienie z2 = new Zamowienie(15);
        z2.dodajPozycje(p4);
        z2.dodajPozycje(p6);
        z2.dodajPozycje(p5);
        listaZamowien.dodajZamowienie(z2);
        

        Zamowienie z3 = new Zamowienie(5);
        z3.dodajPozycje(p3);
        listaZamowien.dodajZamowienie(z3);
       

        ZapisOdczyt.zapis("JSON_db.json", listaZamowien);

        ListaZamowien x = ZapisOdczyt.odczyt("JSON_db.json");
        System.out.println(x);

        
        


    }
}
