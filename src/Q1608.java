import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1608 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();


        for (int i = 0; i < t; i++) {

            int dinheiro = scanner.nextInt();
            int totalIngredientes = scanner.nextInt();
            int totalReceitas = scanner.nextInt();

            List<Integer> listaIngredientes = new ArrayList<>();

            for (int ingredientesAnotados = 0; ingredientesAnotados < totalIngredientes; ingredientesAnotados++) {
                listaIngredientes.add(scanner.nextInt());
            }

            int menorValorReceita = 999999999;
            for (int receitas = 0; receitas < totalReceitas; receitas++) {
                int valorTotalDaReceita = 0;

                int qtdeIngredientes = scanner.nextInt();

                for (int ordemIngrediente = 0; ordemIngrediente < qtdeIngredientes; ordemIngrediente++) {

                    int preco = listaIngredientes.get(scanner.nextInt());
                    int quantidade = scanner.nextInt();

                    int valorIngrediente = preco * quantidade;
                    valorTotalDaReceita = valorTotalDaReceita + valorIngrediente;
                }

                menorValorReceita = Math.min(menorValorReceita, valorTotalDaReceita);

            }

            System.out.println(dinheiro / menorValorReceita);

        }
    }
}

