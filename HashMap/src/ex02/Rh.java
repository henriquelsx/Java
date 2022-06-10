package ex02;

import java.util.Map;

public class Rh {
    private final Map<String, Pessoa> mapaPessoa;

    public Rh(Map<String, Pessoa> mapaPessoa) {
        this.mapaPessoa = mapaPessoa;
    }

    public void add(Pessoa pessoa) {
        if (mapaPessoa.containsKey(pessoa.getCpf()))
            System.out.println("Este Cpf já foi cadastrado!");
        else
            mapaPessoa.put(pessoa.getCpf(), pessoa);
    }

    public void getList() {
        System.out.println(mapaPessoa);
    }

    public void printIdade() {
        Map.Entry<String, Pessoa> entry = mapaPessoa.entrySet().iterator().next();
        String cpfIdoso, cpfJovem;
        cpfJovem = cpfIdoso = entry.getKey();

        for (Pessoa aux : mapaPessoa.values()) {

            if (aux.getNascimento().compareTo(mapaPessoa.get(cpfIdoso).getNascimento()) < 0) {
                cpfIdoso = aux.getCpf();
            }
            if (aux.getNascimento().compareTo(mapaPessoa.get(cpfJovem).getNascimento()) > 0) {
                cpfJovem = aux.getCpf();
            }
        }

        System.out.println("Pessoa mais idosa:");
        System.out.println(mapaPessoa.get(cpfIdoso));
        System.out.println("Pessoa mais Jovem:");
        System.out.println(mapaPessoa.get(cpfJovem));
    }

    public double mediaPeso() {
        double media = 0;

        for (Pessoa aux : mapaPessoa.values()) {
            media += aux.getPeso();
        }

        return media / mapaPessoa.size();
    }

    public void remove(String cpf) {
        mapaPessoa.remove(cpf);
    }

    public void update(String cpf, Pessoa pessoa) {
        if (!cpf.equals(pessoa.getCpf()))
            System.out.println("Erro!");
        else
            mapaPessoa.replace(cpf, pessoa);
    }
}
