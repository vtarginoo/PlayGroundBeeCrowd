package Lista2;

import java.util.Scanner;

public class Q2927 {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        int students = scan.nextInt();;
        int pc = scan.nextInt();;
        int burned = scan.nextInt();
        int noCompiler = scan.nextInt();

        int pcsDisponives = pc - burned - noCompiler;



        if (pcsDisponives >= students +1) {
            System.out.println("Igor feliz!");
        return;
        }

        if(burned > (noCompiler/2)) {
            System.out.println("Caio, a culpa eh sua!");
        return;
        }

        System.out.println("Igor bolado!");

    }


}
