import java.util.*;

public class Q2906 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        Set<String> setEmails = new HashSet<>();
        Map<String, Set<String>> mapProvedor = new HashMap<>();

        for (int i = 0; i < t; i++) {

            String email = scanner.next();
            String[] splitted = email.split("@");
            mapProvedor.putIfAbsent(splitted[1], new HashSet<>());
            String value = "";

            for (char c : splitted[0].toCharArray()){
                if(c == '.') continue;
                else if (c== '+') break;
                else  value = value + c;
            }

            mapProvedor.get(splitted[1]).add(value);
        }

        //System.out.println("Map Provedor :" + mapProvedor);

        Set<String> setProvedor = mapProvedor.keySet();
       int resultado = 0;
        for (String provedor : setProvedor ) {
            Set<String> sets = mapProvedor.get(provedor);
            resultado = resultado + sets.size();

        }
        System.out.println(resultado);

    }

}
