package Lista2;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q2588 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String x = scan.next();
            String reverse = new StringBuilder(x).reverse().toString();
            Map<Character, Integer> contagemLetras = new HashMap<>();

            for (char c : x.toCharArray()) {
                contagemLetras.put(c, contagemLetras.getOrDefault(c, 0) + 1);
            }

            boolean pares = contagemLetras.values().stream().anyMatch(contagem -> contagem % 2 != 0);
            long impares = contagemLetras.values()
                    .stream()
                    .filter(contagem -> contagem % 2 != 0)
                    .count();

            if (!pares) {
                System.out.println(0);
                continue;
            }

            System.out.println(Math.max(0, impares - 1));
        }

    }


}
