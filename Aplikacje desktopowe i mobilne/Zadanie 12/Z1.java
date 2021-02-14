import java.io.*;

class Z1 {
    public static void main(String[] args) {
        emerytura("dane.txt");
    }

    public static void emerytura(String nazwaPliku) {
        int wartosc = 0;
        String imie, nazwisko, plec;
        int wiek;
        try {
            FileReader fr = new FileReader("dane.txt");
            StreamTokenizer st = new StreamTokenizer(fr);
            Writer printK = new BufferedWriter(new FileWriter("kobiety.txt", true));
            Writer printM = new BufferedWriter(new FileWriter("mezczyzni.txt", true));

            while ((wartosc = st.nextToken()) != StreamTokenizer.TT_EOF) {

                imie = st.sval;
                st.nextToken();
                nazwisko = st.sval;
                st.nextToken();
                plec = st.sval;
                st.nextToken();
                wiek =  (int) st.nval;
                System.out.println(imie + " " + nazwisko + " " + plec + " " + wiek);
                String out;
                if (plec.equals("M")) {
                    out = imie + " " + nazwisko + " " + (65 - wiek) + "\n";
                    printM.append(out);
                } else {
                    out = imie + " " + nazwisko + " " + (60 - wiek) + "\n";
                    printK.append(out);
                }

            }
            printK.close();
            printM.close();
        } catch (Exception ex) {
            System.out.println("Blad: " + ex);
        }

    }
}