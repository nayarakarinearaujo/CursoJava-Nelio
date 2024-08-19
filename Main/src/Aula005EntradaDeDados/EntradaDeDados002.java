package Aula005EntradaDeDados;

import java.util.Scanner;

public class EntradaDeDados002 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x = scanner.nextInt();
        System.out.println(x);

        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        s3 = scanner.nextLine();

        System.out.println("Dados Digitados:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
