import static java.lang.System.*;
import static java.util.Collections.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        var valores = validaEntrada();
        out.println();
        for (Integer valor : separaEOrdenaValores(valores)) 
            out.println(valor);
    }

    private static List<Integer> validaEntrada() throws Exception {
        List<Integer> valoresInteiros = new ArrayList<Integer>();
        Scanner sc = new Scanner(in);

        Integer total = Integer.parseUnsignedInt(sc.nextLine());
        
        while (valoresInteiros.size() < total) 
            valoresInteiros.add(Integer.parseUnsignedInt(sc.nextLine()));
        
        sc.close();
        return valoresInteiros;
    }

    private static List<Integer> separaEOrdenaValores(List<Integer> valores) throws Exception {
        List<Integer> valoresPar = new ArrayList<>();
        List<Integer> valoresImpar = new ArrayList<>();
        List<Integer> retorno = new ArrayList<>();

        for (Integer valor : valores) 
            if ((valor % 2) == 0)
                valoresPar.add(valor);
            else
                valoresImpar.add(valor);

        sort(valoresPar);
        sort(valoresImpar, reverseOrder());

        retorno.addAll(valoresPar);
        retorno.addAll(valoresImpar);

        return retorno;
    }
}