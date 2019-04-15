import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class MaiorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor[] = new int[4];
        for (int i = 0; i < valor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valor[i] = sc.nextInt();
        }
        Arrays.sort(valor);
        System.out.println("Maior valor = " + valor[valor.length - 1]);
        System.out.println("Menor valor = " + valor[0]);
    }
}
