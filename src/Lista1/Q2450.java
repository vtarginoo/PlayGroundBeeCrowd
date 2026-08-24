package Lista1;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Q2450 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int linhas = scanner.nextInt();
        int members = scanner.nextInt();
        scanner.nextLine();


        int[] zeroPositions = new int[linhas];
        boolean soZero = true;
        for (int i = 0; i < linhas; i++) {

            String[] line = scanner.nextLine().split(" ");
            int positionDoZero = 300;

            for (int j = 0; j < members; j++) {
                String daVez = line[j];
                if (!Objects.equals(daVez, "0")) {
                    soZero = false;
                    positionDoZero = j;
                    break;
                }
            }
            zeroPositions[i] = positionDoZero;
        }

        if (soZero) {
            System.out.println("S");
            return; };

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
