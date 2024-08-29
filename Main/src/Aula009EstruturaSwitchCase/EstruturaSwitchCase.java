package Aula009EstruturaSwitchCase;

import java.util.Scanner;

public class EstruturaSwitchCase {
    public static void main(String[] args) {

        //ESTRUTURA SWITCH-CASE
/*
Quando se tem várias opções de fluxo a serem tratadas com base no valor
de uma variável, ao invés de variável estruturas if-else encadeadas,
alguns preferem utilizar a estrutura switch-case.
*/
        //PROBLEMA EXEMPLO
/*
Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia
da semana (sendo 1 = domingo, 2 = segunda...).
Escrever na tela o dia da semana correspondente, conforme exemplos

1 = Dia da Semana: Domingo
*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7: ");
        int dia = sc.nextInt();
        String diaSemana;

        switch (dia) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda";
                break;
            case 3:
                diaSemana = "Terça";
                break;
            case 4:
                diaSemana = "Quarta";
                break;
            case 5:
                diaSemana = "Quinta";
                break;
            case 6:
                diaSemana = "Sexta";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Valor Inválido";
                break;
        }

        System.out.println("Dia da semana: " + diaSemana);

        sc.close();
    }
}
