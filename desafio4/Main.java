package desafio4;

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var valores = validaEntrada();
        out.println();
        for (String valor : valores) {
           var valorEsquerda =  valor.substring(0, (valor.length() / 2)).toCharArray();
           var valorDireita =  valor.substring((valor.length() / 2), valor.length()).toCharArray();

           for (int i = valorEsquerda.length - 1 ; i >= 0; i--) 
                out.print(valorEsquerda[i]);

           for (int i = valorDireita.length - 1; i >= 0; i--) 
                out.print(valorDireita[i]);

            out.println();
        }
    }
    private static List<String> validaEntrada(){
        List<String> valoresInteiros = new ArrayList<String>();
        Scanner sc = new Scanner(in);

        Integer total = Integer.parseUnsignedInt(sc.nextLine());
        
        while (valoresInteiros.size() < total) 
            valoresInteiros.add(sc.nextLine());
        
        sc.close();
        return valoresInteiros;
    } 
}
