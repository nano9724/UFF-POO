package sintaxe;
import java.util.Scanner;
/**
 *[0.5 pontos]Escreva um programa que recebe como parâmetro 
 * um número inteiro n. A função deve ler n valores do teclado e 
 * retornar quantos destes valores são negativos.
 */
public class Exerc1 {

    public static void main ( String[] args){
        
        int [] vet; 
        int num; 
        int cont; 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a Quantidade de Número a ser Analisado:");
        cont = teclado.nextInt();
            vet= new int [cont];
            
    
        for (int i=0; i<vet.length; i++){
           System.out.println("Digite o Número");
            num = teclado.nextInt();
            vet[i]= num;}
            
            
        System.out.println("Números negativos inseridos:");   
         for (int j=0; j<=vet.length-1; j++){        
            if (vet[j] < 0){
            System.out.println(vet[j]);}
            
        }
            
        System.out.println("Números positivos inseridos:");   
         for (int k=0; k<=vet.length-1; k++){        
            if (vet[k] >= 0){
            System.out.println(vet[k]);
            
        }
         
        
       }
        
     
    }

}



