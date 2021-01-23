
public class Z1 {
    public static void main(String[] args) {
        PomiarCzasu czas = new PomiarCzasu();
        AlgorytmySortujace sort = new AlgorytmySortujace();
        int[] tab = generatorTab();
        int[] tabWynik = new int[1000];


        System.out.print("Sortowanie babelkowe: ");
        czas.start();
        tabWynik = sort.babelkowe(tab);
        System.out.println(czas.stop());
        // for (int i =0;i<tabWynik.length;i++) System.out.print(tabWynik[i]+" ");System.out.println("");

        System.out.print("Sortowanie Przez Wybor: ");
        czas.start();
        tabWynik = sort.sortowaniePrzezWybor(tab);
        System.out.println(czas.stop());
        // for (int i =0;i<tabWynik.length;i++) System.out.print(tabWynik[i]+" ");System.out.println("");

        System.out.print("Sortowanie przez wstawianie: ");
        czas.start();
        tabWynik = sort.sortowaniePrzezWstawianie(tab);
        System.out.println(czas.stop());
        // for (int i =0;i<tabWynik.length;i++) System.out.print(tabWynik[i]+" ");System.out.println("");

        System.out.print("Sortowanie przez scalanie: ");
        czas.start();
        tabWynik = sort.sortowaniePrzerzScalanie(tab);
        System.out.println(czas.stop());
        // for (int i =0;i<tabWynik.length;i++) System.out.print(tabWynik[i]+" ");System.out.println("");

        System.out.print("Sortowanie szybkie: ");
        czas.start();
        tabWynik = sort.sortowanieSzybkie(tab);
        System.out.println(czas.stop());
        // for (int i =0;i<tabWynik.length;i++) System.out.print(tabWynik[i]+" ");System.out.println("");

    }

    static int[] generatorTab() {
        int ilosc = 1000;

        int[] tab = new int[ilosc];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 100000);
        }
        return tab;
    }

}

class PomiarCzasu {
    long first = 0L;

    public void start() {
        first = System.nanoTime();
    }

    public int stop() {
        long end = System.nanoTime();
        return (int) (end - first);
    }
}

class AlgorytmySortujace {

    // tablice pomocnicze
    int[] d;
    int[] p;

    public int[] babelkowe(int[] tab) {

        int x;
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    x = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = x;
                }
            }
        }

        return tab;
    }

    public int[] sortowaniePrzezWybor(int[] tab) {
        int N = tab.length;
        for (int j = 0; j < N - 1; j++) {
            int p = j;
            for (int i = j + 1; i < N; i++)
                if (tab[i] < tab[p])
                    p = i;
            int x = tab[p];
            tab[p] = tab[j];
            tab[j] = x;
        }
        return tab;

    }

    public int[] sortowaniePrzezWstawianie(int[] tab) {
        for (int j = tab.length - 2; j >= 0; j--) {
            int x = tab[j];
            int i = j + 1;
            while ((i < tab.length) && (x > tab[i])) {
                tab[i - 1] = tab[i];
                i++;
            }
            tab[i - 1] = x;
        }
        return tab;
    }

    // Aby odblokowac dostep do algorytmow rekurecyjnych wyslij blik na 537848165 10zl w tytule email.

}
