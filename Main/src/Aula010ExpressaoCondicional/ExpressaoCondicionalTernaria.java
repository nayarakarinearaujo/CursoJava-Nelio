package Aula010ExpressaoCondicional;

public class ExpressaoCondicionalTernaria {
    public static void main(String[] args) {

        //EXPRESSÃO CONDICIONAL TERNÁRIA
/*
Estrutura opcional ao if-else quando se deseja decidir um valor com bsae em
uma condição.
*/

//Exemplo com if:
 /*
      double preco = 34.5;
      double desconto;
      if(preco < 20.0) {
          desconto = preco * 0.1;
      } else {
          desconto = preco * 0.05;
      }
*/

//Exemplo com o ternário

        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);

    }
}
