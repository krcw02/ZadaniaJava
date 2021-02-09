import java.io.*;

class Z1 {
    public static void main(String[] args) throws IOException {

        int number = 0;
        String line;
        BufferedReader fr = null;

        Writer out = new BufferedWriter(new FileWriter("zad_5.txt", true));
        try {
            fr = new BufferedReader(new FileReader("liczby.txt"));
            while ((line = fr.readLine()) != null) {
                number = Integer.parseInt(line);
                if (Math.sqrt(number) % 1 == 0) {
                    if (liczbaPierwsza((int) Math.sqrt(number))) {
                        System.out.println(number);
                        out.append(number + "\n");
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("Bład wczytywania pliku: " + e);
        } finally {

            fr.close();
            out.close();
        }
        
    }

    static boolean liczbaPierwsza(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;

    }
}