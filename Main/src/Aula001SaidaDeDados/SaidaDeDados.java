package Aula001SaidaDeDados;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SaidaDeDados {
    public static void main(String[] args) {

        //Saida de dados em Java

        //Com quebra de linha
        System.out.println("Olá, mundo!");
        System.out.println("Conhecendo o Java");

        //Sem quebra de linha
        System.out.print("Entendendo Java. ");
        System.out.print("Aprendendo POO");
        System.out.println("\n------------------------");

        //Para escrever o conteúdo de uma variável com ponto flutuante
        /*
        %f = ponto flutuante
        %d = inteiro
        %s = texto
        %n = quebra de linha
        */
        double x = 10.35784;

        System.out.println(x);
        System.out.printf("%.2f%n", x); //Delimitar 2 casas decimais
        System.out.printf("%.4f%n", x); //Delimitar 4 casas decimais

        /* Para o resultado aparecer com ponto ao invés de vírgula,
        utilizar o Locale, importando a classe */
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x); //Delimitar 4 casas decimais


        /*Concatenação: Concatenação é o processo de unir ou combinar duas ou mais
         cadeias de texto (strings) em uma única cadeia. */

        System.out.println("RESULTADO = " + x + " METROS.");

        System.out.printf("RESULTADO = %.2f metros%n ", x);

        /*Concatenar varios elementos em um mesmo comando de escrita */

        String nome = "Nayara";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}