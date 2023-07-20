package desafio3;

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafio3 {
    static Integer alvo;
    public static void main(String[] args) {
        Integer totalPares = 0;
        var valores = validaEntrada();

        for (Integer valor1 : valores) 
            for (Integer valor2 : valores) 
                if ((valor1 - valor2) == alvo)
                    totalPares++;

        out.println(totalPares);
    }

    static List<Integer> validaEntrada() {
        List<Integer> valoresInteiros = new ArrayList<Integer>();
        Scanner sc = new Scanner(in);

        Integer total = sc.nextInt();
        alvo = sc.nextInt();

        while (valoresInteiros.size() < total)
            valoresInteiros.add(sc.nextInt());

        sc.close();
        return valoresInteiros;
    }
}
