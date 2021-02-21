
public class Zamowienie {
    Pozycja[] pozycja;
    int ileDodanych = 0;
    int maksRozmiar;
    
    Zamowienie() {
        maksRozmiar = 10;
        pozycja = new Pozycja[maksRozmiar];
    }

    Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
        pozycja = new Pozycja[this.maksRozmiar];
    }

    public void dodajPozycje(Pozycja p) {
        for (int i = 0; i < this.ileDodanych; i++) {
            if (this.pozycja[i].nazwaTowaru.equals(p.nazwaTowaru)) {
                this.pozycja[i].ileSztuk = this.pozycja[i].ileSztuk + p.ileSztuk;
                return;
            }
        }

        this.pozycja[this.ileDodanych] = p;
        this.ileDodanych++;

    }

    public double obliczWartosc() {
        double sum = 0;
        for (int i = 0; i < this.ileDodanych; i++) {
            sum = sum + this.pozycja[i].obliczWartosc(); 
        }
        return sum;
    }

    public String toString() {
        String rachunek = "\nZamówienie:";
        for (int i = 0; i < this.ileDodanych; i++) {
            rachunek = rachunek + "\n" + this.pozycja[i].toString(); 
        }
        return rachunek + "\n\nRazem: " + String.format("%.2f",this.obliczWartosc()) + " zł";
    }

    public void usunPozycje(int index) {
        for (int i = index; i < this.ileDodanych; i++) {
            this.pozycja[i] = this.pozycja[i + 1];
        }
        this.ileDodanych--;
    }

    public Pozycja pobierzPozycje(int index) {
        return this.pozycja[index];
    }

    public void edytujPozycje(int index, Pozycja p) {
        this.pozycja[index] = p;
    }
}