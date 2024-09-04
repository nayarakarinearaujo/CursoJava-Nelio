package EstruturaRepetitiva;

import java.util.Scanner;

public class EstruturaRepetitivaFor {
    public static void main(String[] args) {

        //ESTRUTURA REPETITIVA FOR(PARA)
/*
É uma estrutura de controle que repete um bloco de comandos para um certo intervalo
de valores.
Quando usar: quando se sabe previamente a quantidade de repetições,
ou o intervalo de valores.
*/

        //Problema exemplo:
/*
Fazer um programa que lê um valor inteiro N e depois N números inteiros. Ao final,
mostra a soma dos N números lidos
 */

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);

        scanner.close();

        /* Contagem regressiva:
        for (int i=0; i<5; i++) {
        System.out.println("Valor de i: " + i);
}
        */
    }
}
