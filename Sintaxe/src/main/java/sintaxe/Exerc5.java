
package sintaxe;

import java.util.Scanner;


public class Exerc5 {
    
    public static long Fat (int valor){
      int fat = 1;
      if ( valor== 1  || valor==2){
          System.out.println( " O fatorial do número " + valor+" é ele mesmo");
          return -1;
      } else if (valor>2) {
    for( int i = 2; i <= valor; i++ ){
          fat *= i;}
        }
      System.out.println( "O fatorial de " + valor + " é: " + fat );
    return 0;
    }

  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite um valor inteiro para calcularmos o fatorial:");

      int valor=teclado.nextInt();

        Fat(valor);
      
  
}
}
