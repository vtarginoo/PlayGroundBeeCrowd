package Lista1;

import java.util.Arrays;
import java.util.Scanner;

public class Q2450 {


    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int linhas = scanner.nextInt();
        int members = scanner.nextInt();
        scanner.nextLine();


        int[] zeroPositions = new int[linhas];

        for (int i = 0; i < linhas; i++) {

            String line = scanner.nextLine();

            System.out.println(line);
            int positionDoZero=-1;

            for (int j =0; j< members; j++) {

                int daVez = scanner.nextInt();
                if (daVez !=0) {
                    positionDoZero = j;
                    break;
                };
            }
            zeroPositions[i] = positionDoZero;


            System.out.println(Arrays.toString(zeroPositions));

        }






    }



}
