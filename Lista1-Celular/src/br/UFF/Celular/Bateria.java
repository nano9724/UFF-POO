
package br.UFF.Celular;

public class Bateria {
  int [] carga;
  int nivel;
  int capacidade;
  
  Bateria(int cap){
  this.capacidade=cap;
  carga=new int[capacidade];
  this.nivel=0;//upBateria(capacidade);
  upBateria(capacidade);
  }
  
  int upBateria(int i){
      for (int x=nivel;x<=(nivel+i);x++){
        if (nivel<this.capacidade){
          this.carga[x]=1;
            nivel++;}
      }
      return this.nivel;
  }
  
  int downBateria(int i){
      int dbattery=i/5;
      for (int x=0; i<(carga.length)-dbattery;i++){
            this.carga[x]=0;
            this.nivel--;
      }return this.nivel;}
      
    }
