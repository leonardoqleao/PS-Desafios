import static java.lang.System.*;
import java.util.Scanner;

public class Main {
    final static Double[] notas = new Double[] { 100D, 50D, 20D, 10D, 5D, 2D };
    final static Double[] moedas = new Double[] { 1D, .50D, .25D, .10D, .05D, .01D };
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        calculaNotas(Double.parseDouble(sc.nextLine()));
        sc.close();
    }

    private static void calculaNotas(Double valor) {
        out.println("NOTAS:");
        for (Double nota : notas) {
            var totalNota = Math.floor(valor / nota);
            out.printf("%.0f nota(s) de R$ %.2f \n", totalNota, nota);
            valor -= totalNota * nota;
        }
        calculaMoedas(valor);
    }

    private static void calculaMoedas(Double valor) {
        out.println("MOEDAS:");
        for (Double moeda : moedas) {
            var totalMoeda = Math.floor(valor / moeda);
            out.printf("%.0f moeda(s) de R$ %.2f \n", totalMoeda, moeda);
            valor -= totalMoeda * moeda;
        }
    }
}
