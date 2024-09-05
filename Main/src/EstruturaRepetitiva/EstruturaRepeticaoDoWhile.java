package EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepeticaoDoWhile {
    public static void main(String[] args) {

    /*
    Fazer um programa para ler uma temperatura em celsius e mostrar
    o equivalente em Fahrenheit. Perguntar se o usuário deseja repetir
    (s/n). Caso o usuário digite 's', repetir o programa.
    */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double c = scanner.nextDouble();
        double f = 9.0 * c / 5.0 + 32.0;
        System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
        System.out.println("Deseja repetir (s/n)? ");
        char resp = scanner.next().charAt(0);
        scanner.close();

    }
}
