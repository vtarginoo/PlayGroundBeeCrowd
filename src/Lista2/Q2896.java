package Lista2;

import java.util.Scanner;

public class Q2896 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i =0; i<t; i++){

            int bottles = scanner.nextInt();
            int promotion = scanner.nextInt();

            int trocasFeitas = bottles/promotion;
            int oQueSobrou = bottles%promotion;

            bottles =  trocasFeitas + oQueSobrou;
            System.out.println( bottles);

        }




    }


}


