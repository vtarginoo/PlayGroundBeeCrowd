package Lista2;

import java.util.Scanner;

public class Q1144 {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 1; i<=n; i++){

            long elevadoADois = (long) i *i;
            long elevadoATres = elevadoADois * i;

            System.out.println(i + " " + elevadoADois + " " + elevadoATres);
            System.out.println(i + " " + (elevadoADois+1) + " " + (elevadoATres + 1));


        }



    }



}
