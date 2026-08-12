package Lista1;

import java.util.Scanner;

public class Q2419 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lines = scanner.nextInt();
        int slots = scanner.nextInt();


        char[][] board = new char[lines][slots];

        for (int i = 0; i < lines; i++) {
            board[i] = scanner.next().toCharArray();
        }

        int result = 0;

        for (int i = 0; i < lines; i++) {

            for (int j = 0; j < slots; j++) {

                if (board[i][j] == '.') continue;

                char left = j == 0 ? 'b' : board[i][j - 1];
                int leftPoint = left == '#' ? 1 : 0;
                char right = j == slots-1 ? 'b' : board[i][j + 1];
                int rightPoint = right == '#' ? 1 : 0;
                char upper = i == 0 ? 'b' : board[i - 1][j];
                int upPoint = upper == '#' ? 1 : 0;
                char downer = i == slots-1 ? 'b' : board[i + 1][j];
                int downPoint = downer == '#' ? 1 : 0;
                int soma = leftPoint + rightPoint + upPoint + downPoint;

                if (soma < 4) result++;

            }
        }
        System.out.println(result);
    }
}
