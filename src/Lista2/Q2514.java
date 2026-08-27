package Lista2;

import java.util.Scanner;

public class Q2514 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNext()) {

            boolean alinhados = false;
            int delay = scanner.nextInt();
            int worldA = scanner.nextInt();
            int worldB = scanner.nextInt();
            int worldC = scanner.nextInt();

            int posA = delay % worldA;
            int posB = delay % worldB;
            int posC = delay % worldC;

            int counter = 0;

            while (!alinhados) {
                counter++;
                // Se já tiver batido o ciclo, reinicia o ciclo, senão anda uma casa
                posA = (posA + 1) % worldA;
                posB = (posB + 1) % worldB;
                posC = (posC + 1) % worldC;

                if (posA == 0 && posB == 0 && posC == 0) {
                    alinhados = true;
                }

            }

            System.out.println(counter);

        }
    }
}



