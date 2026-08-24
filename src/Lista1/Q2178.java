package Lista1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q2178 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int passaros = scanner.nextInt();
        int positions = scanner.nextInt();

        ///Passa um \n
        scanner.nextLine();

        List<Integer> movements = new ArrayList<>();
        int lastPosition = 0;

        for (int i =0; i<passaros; i++) {

            String[] linha = scanner.nextLine().split(" ");
            int saltos = Integer.parseInt(linha[0]);
            for (int s =1; s<=saltos; s++) {
                movements.add(Integer.valueOf(linha[s]));
            }
        }







    }


}
