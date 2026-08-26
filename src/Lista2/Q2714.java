package Lista2;

import java.util.Scanner;

public class Q2714 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            String x = scanner.next();
            int len = x.length();
            if(!x.substring(0,2).equals("RA") || len != 20 ) {
                System.out.println("INVALID DATA");
                continue;
            }
            System.out.println(Long.parseLong(x.substring(2)));
        }


    }
}