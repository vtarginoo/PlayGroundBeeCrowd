package Lista1;

import java.util.Scanner;

public class Q2544 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNext()) {

            int clones = scanner.nextInt();
            int mutations = -1;

            while (clones > 0) {

                clones = clones / 2;
                mutations++;
            }

            System.out.println(mutations);
        }


    }


}
