
package br.UFF.Celular;

public class Mensagem {
    String texto;
    Celular destino;
    int tempo;
    
    Mensagem(Celular d, String tx, int t){
        this.texto=tx;
        this.destino=d;
        this.tempo=t;
    }
    
    void printMensagem(){
    System.out.println("Para: "+ destino.id_Cel );
    System.out.println("Mensagem:");
    System.out.println( this.texto );
    }
    
    
    
}
