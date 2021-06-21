
package sintaxe;
import java.util.Scanner;

public class Exerc2 {
    
    public static void main(String[] args){
        
        float r,s,t; 
         
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um valor para R");
        r = teclado.nextFloat();
        System.out.println("Digite um valor para S");
        s = teclado.nextFloat();
        System.out.println("Digite um valor para T");
        t = teclado.nextFloat();
        
        if (r>s && r>t){
            System.out.println("O maior valor é:"+ r );
        } else if (s>r && s>t){
            System.out.println("O maior valor é:"+ s );
        }else{
            System.out.println("O maior valor é T:"+ t );
    
    }}}
        