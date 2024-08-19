package Aula005EntradaDeDados;

import java.util.Scanner;

public class EntradaDeDados001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char sexo;
        System.out.println("Digite F (Feminino) ou M (Masculino) para espeficificar o seu sexo: ");
        sexo = scanner.next().charAt(0);

        if (sexo == 'f' || sexo == 'F') {
            System.out.println("O sexo é feminino");
        } else if (sexo == 'm' || sexo == 'M') {
            System.out.println("O sexo é masculino");
        } else {
            System.out.println("Entrada inválida. Por favor, digite 'F' ou 'M'.");
        }

        String nome;
        System.out.println("Qual seu nome: ");
        nome = scanner.next();
        System.out.println("Prazer " + nome + "!");

        int x;
        System.out.println("Qual a sua idade: ");
        x = scanner.nextInt();
        System.out.println("Você tem " + x + " anos.");

        double peso;
        System.out.println("Qual seu peso: ");
        peso = scanner.nextDouble();
        System.out.println("Seu peso é: " + peso + "Kg");

        scanner.close();

    }
}
