import java.io.IOException;
import java.util.Scanner;

public class Q1074 {


    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();


        for (int i = 0; i < t; i++) {

            int value = scanner.nextInt();

            if (value == 0) {
                System.out.println("NULL");
            } else if (value % 2 == 0) {
                if (value < 0) System.out.println("EVEN NEGATIVE");
                else System.out.println("EVEN POSITIVE");
            } else {
                if (value < 0) System.out.println("ODD NEGATIVE");
                else System.out.println("ODD POSITIVE");
            }


        }


    }


}
