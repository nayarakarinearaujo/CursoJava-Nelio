package EstruturaRepetitiva;

import java.awt.*;
import java.util.Scanner;

public class EstruturaRepetitivaWhile {
    public static void main(String[] args) {

        //ESTRUTURA REPETITIVA WHILE(ENQUANTO)
/*
É uma etrutura de controle que repete um bloco de comandos enquanto
uma condição for verdadeira.
Quando usar: quando não se sabe previamente a quantidade de repetições
que será realizada.

PROBLEMA EXEMPLO
Fazer um programa que lê números inteiros até que um zero
seja lido. Ao final mostra a soma dos números lidos.

*/

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        int soma = 0;
        while( x != 0) {
            soma = soma + x;
            //ou soma += x
            x = scanner.nextInt();
        }
        System.out.println("A soma dos números digitados é: " + soma);
        scanner.close();
    }
}
