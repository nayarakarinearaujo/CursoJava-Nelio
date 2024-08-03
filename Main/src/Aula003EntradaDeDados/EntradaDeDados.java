package Aula003EntradaDeDados;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá ");

        //String x;
        //x = sc.next(); //Entrada de texto

//        double x;
//        x = sc.nextDouble(); //Entrada de número flutuante

        char x;
        x = sc.next().charAt(0);
        System.out.println("Você digitou: " + x);

        sc.close();

    }
}
