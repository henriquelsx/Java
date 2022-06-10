package ex04;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class DataFiles {

    private File estado = null;
    private File municipio = null;

    public DataFiles(String estado, String municipio) {
        this.estado = new File(estado);
        this.municipio = new File(municipio);
    }

    public Map<Integer, Estado> lerAquivoEstado() throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(estado))) {
            Map<Integer, Estado> mapEstado = new HashMap<>();
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] array =  linha.split(",");
                mapEstado.put(Integer.parseInt(array[0]), new Estado(Integer.parseInt(array[0]), array[1], array[2].replace("\s", "")));
            }
            return mapEstado;
        }
    }

    public Map<Integer, Municipio> lerAquivoMunicipio() throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(municipio))) {
            Map<Integer, Municipio> mapMunicipio = new HashMap<>();
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] array =  linha.split(",");
                mapMunicipio.put(Integer.parseInt(array[1]), new Municipio(Integer.parseInt(array[1]), Integer.parseInt(array[0]), array[2].replace("\s", "")));
            }
            return mapMunicipio;
        }
    }
}
