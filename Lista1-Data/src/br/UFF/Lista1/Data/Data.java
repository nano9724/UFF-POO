
package br.UFF.Lista1.Data;

public class Data {
   private int dia;
   private Mes mes;
   private int mesI;
   private int ano;
   
   Data(int dia,int mes, int ano ){
       this.dia=dia;
       this.mesI=mes;
       this.ano=ano;
   }
   
   Data(Mes mes, int dia ){
       this.dia=dia;
       this.mes=mes;
   }
   
   Data(int dia,int ano ){
       this.dia=dia;
       this.ano=ano;
   }
   
   void  printData(){
       if(mes!=null){
           System.out.println(this.dia+"/"+mes+"/"+ano);
       } else {
           System.out.println(this.dia+"/"+mesI+"/"+ano);
       }
       
   }
      
   public enum Mes{
   Janeiro("janeiro"), Fevereiro("fevereiro"), Março("março"), Abril("abril"), Maio("maio"), Junho("junho"), Julho("julho"), Agosto("agosto"), Setembro("setembro"), Outubro("outubro"), Novembro("novembro"), Dezembro("dezembro");
     
   String mes;
   
   Mes(String m){
       this.mes=m;
       }
  
   }
    
}
