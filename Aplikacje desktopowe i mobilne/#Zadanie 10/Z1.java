import java.util.Arrays;

public class Z1 {
    public static void main(String[] args) {
        int[] tab = generatorTab();

        long start = System.nanoTime();
        int[] tabTestSort = testSort(tab);
        long stop = System.nanoTime();

        System.out.println("##########");
        System.out.println("testSort: ");
        // for(int i = 0; i<tab.length;i++)System.out.print(tabTestSort[i]+" ");
        System.out.println("Czas wykonywania: "+(stop-start));
        System.out.println("##########");



    }
    static int[] generatorTab(){
        int ilosc = 1000;
        
        int[] tab = new int[ilosc];
        for(int i = 0; i<tab.length;i++){
            tab[i] = (int)(Math.random()*100000);
        }

        return tab;
    }
    static int[] testSort(int[] tab){

        Arrays.sort(tab);

        return tab;
    }
    static int[] babelkowe(int[] tab){

        int x;
        for (int i = 0; i < tab.length - 1; i++){       
            for (int j = 0; j < tab.length - 1; j++){
                if(tab[j] > tab[j + 1]){
                    x = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = x;
                    }
                 }
           }    

        return tab;
    }
}
