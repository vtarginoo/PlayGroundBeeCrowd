package Lista1;

import java.util.Arrays;
import java.util.Scanner;

public class Q2450 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int linhas = scanner.nextInt();
        int members = scanner.nextInt();
        scanner.nextLine();


        int[] zeroPositions = new int[linhas];

        for (int i = 0; i < linhas; i++) {

            char[] line = scanner.nextLine().replace(" ", "").toCharArray();
            int positionDoZero = 300;

            for (int j = 0; j < members; j++) {
                char daVez = line[j];
                if (daVez != '0') {
                    positionDoZero = j;
                    break;
                }
            }
            zeroPositions[i] = positionDoZero;
        }

        int tamanho = zeroPositions.length;
        String result = "S";

        for (int i = 1; i < tamanho; i++ ){

            int forwardPosition = zeroPositions[i];
            int backwardPosition = zeroPositions[i-1];

            int sub = forwardPosition - backwardPosition;

            if (sub <= 0 && (forwardPosition !=300 ||  backwardPosition != 300)) {
                result="N";
                break;
            }
        }

        boolean soTemZeroOu300 = Arrays.stream(zeroPositions)
                .allMatch(position -> position == 0 || position == 300);

        if (soTemZeroOu300) {
            result = "N";
        }

        System.out.println(result);




    }





}
