package Lista2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2163 {





    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       int lines = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] board = new int[lines][column];
        List<int[]> targetPoints = new ArrayList<>();
        int soma = 0;


        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < column; j++) {
                board[i][j] = scanner.nextInt();
            }
        }


        for (int i = 1; i < lines - 1; i++) {
            for (int j = 1; j < column - 1; j++) {

                if (board[i][j] != 42) continue;

                // soma os 9 valores da janela 3x3
                if (verificaSeEhSabre(board, i, j)) {
                    System.out.println((i + 1) + " " + (j + 1));
                    return;
                }
            }
        }
        System.out.println("0 0");


    }

    static private boolean verificaSeEhSabre(int[][] board,int line, int col) {

            int fator0 = board[line + 1][col - 1];
            int fator1 = board[line + 1][col];
            int fator2 = board[line + 1][col + 1];

            int fator3 = board[line][col - 1];
            int fator4 = board[line][col];
            int fator5 = board[line][col + 1];

            int fator6 = board[line - 1][col - 1];
            int fator7 = board[line - 1][col];
            int fator8 = board[line - 1][col + 1];

            int soma = fator0 + fator1 + fator2 + fator3 + fator4 + fator5 + fator6 + fator7 + fator8;

            if (soma == 98) {
                return true;
            }

        return false;
    }


}
