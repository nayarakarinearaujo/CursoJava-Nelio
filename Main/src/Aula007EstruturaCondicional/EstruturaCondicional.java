package Aula007EstruturaCondicional;

import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {

        //ESTRUTURA CONDICIONAL:
/*
É uma estrutrura de controle que permite definir que um certo bloco de
comandos somente será executado dependendo de uma condição.

*/

//Condição simples
// if

//Condição composta
// if else

//Encadeamento de estruturas condicionaius
//if else   else if

        Scanner sc = new Scanner(System.in);

        int time;

        System.out.println("Que horas são: ");
        time = sc.nextInt();

        if (time < 12){
            System.out.println("Bom dia!");
        } else if (time <= 12 && time <= 18 ){
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }

        sc.close();

    }
}
