package Lista2;

import java.util.Scanner;

public class Q2766 {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
       int count =1;

       while (count < 11) {

           String x = scan.next();
           if(count == 3 || count == 7 || count == 9) System.out.println(x);

           count ++;
       }
    }
}
