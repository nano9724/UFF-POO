
package br.UFF.Celular;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Celular {
    String id_Cel;
    Bateria bateria;
    Mensagem [] mensagens;
    int numM,numRegistros;
    Ligacao [] ligacoes;
    
   Celular(String n){
       this.id_Cel=n;
       this.bateria= new Bateria(1000);
       this.ligacoes=new Ligacao[100];
       this.numM=0;
       this.numRegistros=0;
       this.mensagens=new Mensagem[1000];
       
   }
   
   
  /* 
   Instant startTime = Instant.now();
metodoDemorado();
Instant endTime = Instant.now();
Duration totalTime = Duration.between(startTime, endTime);
   
   */
   
    void efetuarLigacao(Celular d){
    Instant startTime = Instant.now();
   
    Scanner teclado=new Scanner(System.in);
    System.out.println(d.id_Cel);
    System.out.println("Em Chamada");
    System.out.println("");
    System.out.println("");
    System.out.println("Tecle enter para finalizar a ligação ");
    teclado.nextLine();
    Instant endTime = Instant.now();
    Duration totalTime = Duration.between(startTime, endTime);
 
    long tempo= totalTime.getSeconds();
   
    System.out.println("Duração: "+ tempo);
   
    ligacoes[numRegistros]= new Ligacao((int)tempo,d);
    numRegistros++;
    d.ligacoes[d.numRegistros]= new Ligacao((int)tempo, d);
    d.numRegistros++;
    int dbattery= (int)tempo/5;
    bateria.downBateria(dbattery);
    }
   
      
   void mensagem(Celular d){
       System.out.println("Digite sua mensagem para "+d.id_Cel);
       Instant startTime = Instant.now();
       String texto;
       Scanner teclado=new Scanner(System.in);
       texto=teclado.nextLine();
       Instant endTime = Instant.now();
       Duration totalTime = Duration.between(startTime, endTime);
 
       long tempo= totalTime.getSeconds();
       mensagens[numM]= new Mensagem(d, texto,(int)tempo); numM++;
       d.mensagens[d.numM]=new Mensagem(d,texto, (int)tempo); d.numM++;
       
       int dbattery=(int)tempo/5;
      
       bateria.downBateria(dbattery);
   }
   
   
   
   
   
}
