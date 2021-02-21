public class ListaZamowien {
    
    Zamowienie[] zamowienie = null;
    int ileDodanych = 0;
    int maksRozmiar;

    ListaZamowien(int rozmiar){
        this.maksRozmiar = rozmiar;
        zamowienie = new Zamowienie[maksRozmiar];
    }
    ListaZamowien(){
        this.maksRozmiar = 10;
        zamowienie = new Zamowienie[maksRozmiar];
    }

    public void dodajZamowienie(Zamowienie z){
        zamowienie[ileDodanych] = z;
        this.ileDodanych++;
        

    }

    public void usunZamowienie(int index) {
        for (int i = index; i < this.ileDodanych; i++) {
            this.zamowienie[i] = this.zamowienie[i + 1];
        }
        this.ileDodanych--;
        
    }
    public Zamowienie pobierzPozycje(int index) {
        return this.zamowienie[index];
    }
    public String toString() {
        String rachunek = "\nLista Zamówienień:";
        for (int i = 0; i < this.ileDodanych; i++) {
            rachunek = rachunek + "\n" + this.zamowienie[i].toString(); 
        }
        return rachunek;
    }
}
