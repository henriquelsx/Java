package ex04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            DataFiles df = new DataFiles("./src/ex04/dados/estados.txt", "./src/ex04/dados/municipios.txt");
            Map<Integer, Estado> mapEstados = df.lerAquivoEstado();
            Map<Integer, Municipio> mapMunicipio = df.lerAquivoMunicipio();

            System.out.println("====[Menu]====");
            System.out.println("""
                    [1] - Listar todos os Estados agrupados por SIGLA.
                    [2] - Listar todos os municípios agrupados por Código do Estado.
                    [3] - Listar municípios por SIGLA de Estado.
                    [4] - Buscar Município por Código Municipal.
                    [5] - Ranking decrescente de Estados.
                    """);
            System.out.print("Informe a Opção: ");
            int op = input.nextInt();

            switch (op) {
                case 1 -> {
                    for (Estado aux : mapEstados.values()) {
                        System.out.println(
                                "SIGLA: " + aux.getSigla() +
                                        " | Estado: " + aux.getNome()
                        );
                    }
                }
                case 2 -> {
                    List<Municipio> sort = new ArrayList<>(mapMunicipio.values());
                    sort.sort(Comparator.comparingInt(Municipio::getUF));
                    for (Municipio aux : sort) {
                        System.out.println(aux.toString());
                    }
                }
                case 3 -> {
                    List<Municipio> sort = new ArrayList<>(mapMunicipio.values());
                    sort.sort(Comparator.comparingInt(Municipio::getUF));
                    for (Municipio aux : sort) {
                        System.out.println(
                                "Nome: " + aux.getNome() +
                                        " | UF: " + mapEstados.get(aux.getUF()).getNome()
                        );
                    }
                }
                case 4 -> {
                    System.out.print("Informe um codigo municipal: ");
                    int codigo = input.nextInt();
                    System.out.println(mapMunicipio.get(codigo).toString());
                }
                case 5 -> {
                    ArrayList<Estado> aux = new ArrayList<>(mapEstados.values());
                    aux.sort(Comparator.comparingInt(Estado::getCodigo));
                    Collections.reverse(aux);
                    for (Estado mun : aux) {
                        System.out.println(mun.toString());
                    }
                }
            }

        } catch (Exception error) {
            System.out.println("Error: " + error);
        }

    }
}
