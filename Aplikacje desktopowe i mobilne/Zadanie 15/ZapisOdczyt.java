import java.io.*;

public class ZapisOdczyt {
    public static void zapis(String nazwaPliku, ListaZamowien z) throws IOException {
        ObjectOutputStream pl = null;
        try {
            pl = new ObjectOutputStream(new FileOutputStream(nazwaPliku));
            pl.writeObject(z);
            pl.flush();
        } finally {
            if (pl != null)
                pl.close();
        }
    }

    public static ListaZamowien odczyt(String nazwaPliku) throws IOException, ClassNotFoundException {
        ObjectInputStream pl = null;
        ListaZamowien z = new ListaZamowien();
        try {
            pl = new ObjectInputStream(new FileInputStream(nazwaPliku));

            while (true) {
                z = (ListaZamowien) pl.readObject();
            }

        } catch (Exception e) {
            System.out.println("Blad przy odczycie pliku");
        } finally {
            if (pl != null)
                pl.close();

        }
        return z;

    }
}
