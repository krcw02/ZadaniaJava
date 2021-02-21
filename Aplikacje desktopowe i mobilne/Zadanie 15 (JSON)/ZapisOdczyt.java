import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;

import JSON.JSONArray;
import JSON.JSONObject;
import JSON.parser.JSONParser;

public class ZapisOdczyt {

    static public void zapis(String nazwaPliku, ListaZamowien lista) {

        int ileDodanych = lista.ileDodanych;
        int maksRozmiar = lista.maksRozmiar;

        JSONArray zamowienia = new JSONArray();

        for (int j = 0; j < ileDodanych; j++) {
            JSONObject zamowienie = new JSONObject();
            JSONArray list = new JSONArray();

            for (int i = 0; i < lista.zamowienie[j].ileDodanych; i++) {
                JSONObject pozycja = new JSONObject();
                pozycja.put("nazwaTowaru", lista.zamowienie[j].pozycja[i].nazwaTowaru);
                pozycja.put("ileSztuk", lista.zamowienie[j].pozycja[i].ileSztuk);
                pozycja.put("cena", lista.zamowienie[j].pozycja[i].cena);

                list.add(pozycja);

            }

            zamowienie.put("pozycja", list);
            zamowienie.put("ileDodanych", lista.zamowienie[j].ileDodanych);
            zamowienie.put("maksRozmiar", lista.zamowienie[j].maksRozmiar);

            zamowienia.add(zamowienie);

        }

        JSONObject wynik = new JSONObject();

        wynik.put("ileDodanych", ileDodanych);
        wynik.put("maksRozmiar", maksRozmiar);
        wynik.put("zamowienia", zamowienia);

        try (FileWriter file = new FileWriter(nazwaPliku)) {
            file.write(wynik.toString());
            file.flush();

        } catch (Exception e) {
            System.err.println("Bład przy odczycie: " + e);
        }
        
    }

    static public ListaZamowien odczyt(String nazwaPliku) {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = new JSONObject();

        try {
            Object obj = parser.parse(new FileReader(nazwaPliku));
            jsonObject = (JSONObject) obj;
            
        } catch (Exception e) {
            System.err.println("blad: " + e);
            
        }
        return jsonToListaZamowien(jsonObject);
    }

    private static ListaZamowien jsonToListaZamowien(JSONObject db) {
        ListaZamowien listaZamowien = new ListaZamowien(((Number) db.get("maksRozmiar")).intValue());

        JSONArray lista = (JSONArray) db.get("zamowienia");
        Iterator<JSONObject> iterator = lista.iterator();
        while (iterator.hasNext()) {
            listaZamowien.dodajZamowienie(jsonToZamowienie(iterator.next()));
        }
        return listaZamowien;

    }

    private static Zamowienie jsonToZamowienie(JSONObject jsonZamowienie) {

        Zamowienie zamowienie = new Zamowienie(((Number) jsonZamowienie.get("maksRozmiar")).intValue());

        JSONArray lista = (JSONArray) jsonZamowienie.get("pozycja");
        Iterator<JSONObject> iterator = lista.iterator();
        while (iterator.hasNext()) {
            zamowienie.dodajPozycje(jsonToPozycja(iterator.next()));
        }
        return zamowienie;

    }

    private static Pozycja jsonToPozycja(JSONObject jsonPozycja) {

        Pozycja p = new Pozycja((String) jsonPozycja.get("nazwaTowaru"), ((Number) jsonPozycja.get("ileSztuk")).intValue(), ((Number) jsonPozycja.get("cena")).doubleValue());
        return p;
    }

}
