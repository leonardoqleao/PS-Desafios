import static java.lang.System.*;
import static java.util.Collections.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) throws Exception {
        var valores = validaEntrada();
        List<Integer> valoresPar = new ArrayList<>();
        List<Integer> valoresImpar = new ArrayList<>();

        for (Integer valor : valores)
            if ((valor % 2) == 0)
                valoresPar.add(valor);
            else
                valoresImpar.add(valor);

        sort(valoresPar);
        sort(valoresImpar, reverseOrder());
        
        for (Integer valor : valoresPar)
            out.println(valor);

        for (Integer valor : valoresImpar)
            out.println(valor);
    }

    private static List<Integer> validaEntrada() throws Exception {
        List<Integer> valoresInteiros = new ArrayList<Integer>();
        Scanner sc = new Scanner(in);

        Integer total = sc.nextInt();

        while (valoresInteiros.size() < total)
            valoresInteiros.add(sc.nextInt());

        sc.close();
        return valoresInteiros;
    }
}