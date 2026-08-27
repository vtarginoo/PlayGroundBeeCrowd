package Lista2;

import java.util.*;

public class Q2138 {

    public static void main (String[] args){

        Scanner scanner =new Scanner(System.in);

        while (scanner.hasNext()){
            Map<Character,Integer> tabelaContagem = new HashMap<>();
            char[] line = scanner.next().toCharArray();

            for(var c : line){
                tabelaContagem.put(c, tabelaContagem.getOrDefault(c , 0) + 1);
            }

            int maxValue = tabelaContagem.values().stream().max(Comparator.naturalOrder()).orElse(0);

            List<Character> resposta =tabelaContagem.entrySet().stream()
                    .filter(entry -> entry.getValue().equals(maxValue))
                    .map(Map.Entry::getKey)
                    .toList();

            System.out.println(resposta.get(resposta.size()-1));
        }


    }



}
