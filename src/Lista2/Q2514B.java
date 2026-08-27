package Lista2;

import java.util.Scanner;

public class Q2514B {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                boolean alinhados = false;
                int delay = scanner.nextInt();
                int worldA = scanner.nextInt();
                int worldB = scanner.nextInt();
                int worldC = scanner.nextInt();
                int posA = 0;
                int posB = 0;
                int posC = 0;
                boolean alinhadoA = false;
                boolean alinhadoB = false;
                boolean alinhadoC = false;
                int counter = 0;
                while (!alinhados) {
                    counter++;
                    posA = posA == worldA ? 1 : posA + 1;
                    posB = posB == worldB ? 1 : posB + 1;
                    posC = posC == worldC ? 1 : posC + 1;
                    alinhadoA = posA == worldA;
                    alinhadoB = posB == worldB;
                    alinhadoC = posC == worldC;
                    if (alinhadoA && alinhadoB && alinhadoC) alinhados = true;
                }
                System.out.println(counter - delay);
            }
        }
    }


