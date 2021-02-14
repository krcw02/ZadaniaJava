
//Fragety kodu które wypisują zawartość tablic zostały zakomentowane, aby zwiększysz przejrzystość wyników.
public class Z1 {
    public static void main(String[] args) {
        PomiarCzasu czas = new PomiarCzasu();
        AlgorytmySortujace sort = new AlgorytmySortujace();
        int[] tab = generatorTab();
        int[] tabWynik = new int[1000];
        // for (int i =0;i<tab.length;i++) System.out.print(tab[i]+" ");System.out.println("");

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
        for (int i =0;i<tabWynik.length;i++) System.out.print(tabWynik[i]+" ");System.out.println("");

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

    public int[] sortowaniePrzerzScalanie(int[] tab) {

        return mergeSort(tab, 0, 0, 0);

    }

    private int[] mergeSort(int[] tab, int l, int m, int r1) {
        int lSize = m - l + 1;
        int rSize = r1 - m;
        int[] tabL = new int[lSize];
        int[] tabR = new int[rSize];
        for (int x = 0; x < lSize; x++)
            tabL[x] = tab[l + x];
        for (int y = 0; y < rSize; y++)
            tabR[y] = tab[m + 1 + y];
        int indexL = 0;
        int indexR = 0;
        int currIndex;
        for (currIndex = l; indexL < lSize && indexR < rSize; currIndex++) {
            if (tabL[indexL] <= tabR[indexR])
                tab[currIndex] = tabL[indexL++];
            else
                tab[currIndex] = tabR[indexR++];
        }

        while (indexL < lSize)
            tab[currIndex++] = tabL[indexL++];

        while (indexR < rSize)
            tab[currIndex++] = tabR[indexR++];

        return tab;
    }

    public int[] sortowanieSzybkie(int[] tab) {

        return quickSort(tab, 0, tab.length-1);
    }

    private int[] quickSort(int[] tab, int lo, int hi) {
        int i = lo, j = hi, h;
        int x = tab[(lo + hi) / 2];

        do {
            while (tab[i] < x)
                i++;
            while (tab[j] > x)
                j--;
            if (i <= j) {
                h = tab[i];
                tab[i] = tab[j];
                tab[j] = h;
                i++;
                j--;
            }
        } while (i <= j);

        if (lo < j)
            quickSort(tab, lo, j);
        if (i < hi)
            quickSort(tab, i, hi);
        return tab;
    }

}
