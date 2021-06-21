
package sintaxe;

import java.util.Scanner;

public class Exerc7 {
    
    public static void main (String[ ] args){
     
    double [] avs;
    Scanner teclado = new Scanner(System.in);
         
    System.out.println("Avaliação de Qualidade de Refeição");
    System.out.println("Quantos Funcionarios Avaliarão?");
    int func=teclado.nextInt();
    avs= new double[func];
    for (int i=0; i<avs.length; i++){
        
    System.out.println("Digite sua nota Funcionário nº%d"+i);
    int av=teclado.nextInt();
    if ((av<0) || (av>100))
        i=avs.length-1;
    else
    avs[i]=av;
     }
    
    
    double somaNotasPessimas=0, somaNotasRuins=0,somaNotasBoas=0, somaNotasOtimas=0;
    for (int x=0; x<avs.length; x++){
        if ((avs[x]>0)&&(avs[x]<=25)){
        somaNotasPessimas+=1;
        }else if ((avs[x]>=26)&&(avs[x]<=50)){
          somaNotasRuins+=1;  
    }else if ((avs[x]>=51)&&(avs[x]<=75)){
          somaNotasBoas+=1;  
    }else if ((avs[x]>=76)&&(avs[x]<=100)){
          somaNotasOtimas+=1;  
    }}
    
    double percSomaNotasPessimas =(somaNotasPessimas/func)*100;
    double percSomaNotasRuins =(somaNotasRuins/func)*100;
    double percSomaNotasBoas =(somaNotasBoas/func)*100;
    double percSomaNotasOtimas =(somaNotasOtimas/func)*100;
    
    System.out.println("O percentual de notas péssimas foi de "+ percSomaNotasPessimas+"%");
    System.out.println("O percentual de notas ruins foi de "+ percSomaNotasRuins+"%");
    System.out.println("O percentual de notas boas foi de "+ percSomaNotasBoas+"%");
    System.out.println("O percentual de notas ótimas foi de "+ percSomaNotasOtimas+"%");
    
    }}
    

