package Lista1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1178 {


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        List<Double> doubleList = new ArrayList<>();
        String principalStr = scanner.next();
        double principal = Double.parseDouble(principalStr);

        doubleList.add(principal);

        System.out.printf("N[0] = %.4f%n", principal);

        double variavel = principal;
        for (int i = 1; i < 100; i++) {

            variavel = variavel / 2;

            System.out.printf("N[%d] = %.4f%n", i, variavel);

        }
    }
}
