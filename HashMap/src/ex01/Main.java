package ex01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe uma frase: ");
        String[] palavras = input.nextLine().split("\s");

        Map<String, Integer> mapa = new HashMap<>();

        for (String word : palavras) {
            if (mapa.containsKey(word))
                mapa.replace(word, mapa.get(word) + 1);
            else
                mapa.put(word, 1);
        }

        System.out.println("Saida: ");
        System.out.println(mapa);
    }
}
