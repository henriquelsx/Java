package ex03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Locadora {
    private Map<Integer, Cd> mapCd = new HashMap<>();
    private Map<Integer, Dvd> mapDvd = new HashMap<>();

    public void addCd(Cd cd) {
        mapCd.put(mapCd.size() + 1, cd);
    }

    public void addDvd(Dvd dvd) {
        mapDvd.put(mapDvd.size() + 1, dvd);
    }

    public Dvd getDvdPorNome(String name) {
        for (Dvd aux : mapDvd.values()) {
            if (aux.getTitle().equals(name))
                return aux;
        }
        return null;
    }

    public Cd getCdPorNome(String nome) {
        for (Cd aux : mapCd.values()) {
            if (aux.getTitle().equals(nome)) {
                return aux;
            }
        }
        return null;
    }

    public List<Cd> getCdPorArtista(String artista) {
        List<Cd> listaCd = new ArrayList<>();
        for (Cd aux : mapCd.values()) {
            if (aux.getArtist().equals(artista)) {
                listaCd.add(aux);
            }
        }
        return listaCd;
    }

    public List<Dvd> getDvdPorDiretor(String diretor) {
        List<Dvd> listaDvd = new ArrayList<>();
        for (Dvd aux : mapDvd.values()) {
            if (aux.getDiretor().equals(diretor)) {
                listaDvd.add(aux);
            }
        }
        return listaDvd;
    }

    public void listaCd() {
        for (Cd aux : mapCd.values()) {
            System.out.println(aux.toString());
        }
    }

    public void listaDvd() {
        for (Dvd aux : mapDvd.values()) {
            System.out.println(aux.toString());
        }
    }
}
