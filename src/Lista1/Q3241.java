package Lista1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q3241 {

    public static void main (String[] args) {


            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();


            for (int i =0; i<t; i++){

                String line = scanner.next();

                if (line.equals("P=NP")) {
                    System.out.println("skipped");
                    continue;
                }

                String[] operation  = line.split("\\+");
                int resultado = 0;

                for(String num : operation) {

                    resultado = resultado + Integer.parseInt(num);

                }

                System.out.println(resultado);
            }



    }


}
