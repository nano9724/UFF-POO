
package br.UFF.Lista1.Baralho;


public class Carta {
   private int valor;
   private Naipe naipe;
   
   public static final int AS = 1;
   public static final int VALETE = 11;
   public static final int DAMA = 12;
   public static final int REI = 13;
   /*
   public static final int PAUS = 0;
   public static final int OUROS = 1;
   public static final int COPAS = 2;
   public static final int ESPADAS = 3;*/

    public int getValor() {
        return valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }
   
   int printValor(){
   return getValor();
   }

   Naipe printNaipe(){
   return getNaipe();
     }

    Carta(int v, Naipe n) {
            
      if(v==AS){
      this.valor=AS;
      }else if(v==VALETE){
      this.valor=VALETE;
      }else if(v==DAMA){
      this.valor=DAMA;
      }else if(v==REI){
      this.valor=REI;
      } else{ this.valor = v;}
      
      
      
      if(n==Naipe.COPAS){
      this.naipe=Naipe.COPAS;
      }else if(n==Naipe.ESPADAS){
      this.naipe=Naipe.ESPADAS;
      }else if(n==Naipe.OUROS){
      this.naipe=Naipe.OUROS;
      }else if(n==Naipe.PAUS){
      this.naipe=Naipe.PAUS;
      }
      
      System.out.println(this.valor);
      
   }
    
}
