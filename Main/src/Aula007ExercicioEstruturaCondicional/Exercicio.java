package Aula007ExercicioEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        //EXERCÍCIO
/*
PROBLEMA EXEMPLO:
Uma operadora de telefonia cobra R$ 50,00 po um plano básico
que dá direito a 100 minutos de telefone. Cada minuto que exeder
a franquia de 100 minutos custa R$ 2,00. Faxer um programa
para ler a quantidade de minutos que uma pessoa consumiu ,
dái mostrar o valor a ser pago.
*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos minutos foi consumido: ");

        int minutos = sc.nextInt();

        double conta = 50.0;

        //Não acumulativo
//        if(minutos > 100) {
//            conta = conta + (minutos - 100) * 2.0;
//        }

        //Acumulativo
        if(minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta: R$ %.2f%n", conta);

        sc. close();
    }
}
