package Lista2;


import java.util.Scanner;

public class Q1222 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNext()) {

            int n = scanner.nextInt();
            int l = scanner.nextInt(); // Lines per Page
            int c = scanner.nextInt(); //Character per line

            int linhas = 1;
            int atual = 0;

            for (int i = 0; i < n; i++) {
                String palavra = scanner.next();

                if (atual == 0) {
                    atual = palavra.length();
                } else if (atual + 1 + palavra.length() <= c) {
                    atual += 1 + palavra.length();
                } else {
                    linhas++;
                    atual = palavra.length();
                }
            }

            System.out.println((linhas + l - 1) / l);
        }
    }
}