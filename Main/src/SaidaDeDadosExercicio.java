import java.util.Locale;

public class SaidaDeDadosExercicio {
    public static void main(String[] args) {
        /* Exercicio
        Saida de dados:
        Products:
        Computer, which price is $ 2100,00
        Office desk, which price is $ 650,00

        Record: 30 years old, code 5290 and gender: F

        Measue with eight decimal places: 53,23456700
        Rouded (three decimal places): 53,235
        US decimal point: 53.235
        */

        /*String nome = "Nayara";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
        */
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products: ");
        System.out.printf("%s, which price is $ %.2f ", product1, price1 );
        System.out.printf("%n%s, which price is $ %.2f ", product2, price2);
        System.out.printf("%nRecord: %d years old, code %d and gender: %s", age, code, gender);

        //Falta resolver o último
        Locale.setDefault(Locale.US);
        System.out.printf("%nMeasue with eight decimal places: %8.f ", measure);

    }
}
