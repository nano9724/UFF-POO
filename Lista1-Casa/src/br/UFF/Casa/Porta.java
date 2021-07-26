
package br.UFF.Casa;

public class Porta {
  String cor;
  double largura;
  double altura;
  boolean status;
  
  Porta(){
     this.cor="Marrom natural de madeira";
     this.altura=2.10;
    };
  
  Porta (String cor, double largura){
  this.cor=cor;this.largura=largura;this.altura=2.10;this.status=false;  
  }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
  
    // Aqui definimos que true=berta e false=fechada
  void abrirFechar(){ 
      if(status==false){
      status=true; System.out.println("Porta Aberta");
      }else {
          status=false; System.out.println("Porta Fechada");
      }
    }
  void pintar(String c){
      setCor(c); 
  }
  void mudarDimensao(double l){
      setLargura(l); 
  }
  
  int estaAberta(){
  if(status==false){
      //System.out.println("Porta Fechada");
      return 0;
      }else {
         //System.out.println("Porta Aberta");
         return 1;
      }
  }
  
 /* public static void main(String[] args){
  
      Porta Portinha=new Porta("Branca", 80);
      Portinha.pintar("Verde");
      Portinha.mudarDimensao(90.5);
      Portinha.abrirFechar();// abro a porta
       Portinha.abrirFechar();// fecho a porta
      Portinha.estaAberta();
      
  } */
  
  
  
  
}
