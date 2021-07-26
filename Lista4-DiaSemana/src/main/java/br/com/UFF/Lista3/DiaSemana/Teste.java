
package br.com.UFF.Lista3.DiaSemana;


public class Teste {
    
    public static boolean ehDiaUtil(DiaDaSemana dia){
       if (dia == DiaDaSemana.SEGUNDA){ return true;}
       else if (dia == DiaDaSemana.TERCA){ System.out.println("Dia Útil");return true;}
       else if (dia == DiaDaSemana.QUARTA){ System.out.println("Dia Útil");return true;}
       else if (dia == DiaDaSemana.QUINTA){ System.out.println("Dia Útil");return true;}
       else if (dia == DiaDaSemana.SEXTA){ System.out.println("Dia Útil");return true;}
       else {System.out.println("Final de Semana");return false;}
       }
public static void main(String[] args){

    
    ehDiaUtil(DiaDaSemana.DOMINGO);
    ehDiaUtil(DiaDaSemana.SEXTA);
    
    
    
}

}
