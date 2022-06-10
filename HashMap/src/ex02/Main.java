package ex02;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Pessoa> mapa = new HashMap<>();
        Pessoa pessoa1 = new Pessoa("11111111111", "Seu zé", LocalDate.parse("2000-12-27"), 70);
        Pessoa pessoa2 = new Pessoa("22222222222", "Bacate", LocalDate.parse("2003-12-27"), 60);
        Pessoa pessoa3 = new Pessoa("33333333333", "Luiz", LocalDate.parse("1992-12-27"), 60);
        Pessoa pessoa4 = new Pessoa("44444444444", "Theo", LocalDate.parse("2005-12-27"), 80);

        Rh rh = new Rh(mapa);
        rh.add(pessoa1);
        rh.add(pessoa2);
        rh.add(pessoa3);
        rh.add(pessoa4);

        rh.getList();
        rh.remove("11111111111");
        rh.getList();

        rh.printIdade();
        System.out.print("Media dos pesos: ");
        System.out.println(rh.mediaPeso());

        System.out.println("Update Pessoa com cpf 22222222222");
        rh.update("22222222222", new Pessoa("22222222222", "Zeca", LocalDate.parse("2005-12-27"), 87));
        rh.getList();
    }
}
