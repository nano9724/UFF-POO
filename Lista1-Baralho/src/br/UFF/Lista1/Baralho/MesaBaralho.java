package br.UFF.Lista1.Baralho;


public class MesaBaralho {
    
    public static void main(String[] args){
    
        Baralho Baralho =new Baralho();
        Baralho.iniciarBaralho();
        //Baralho.printCartas();
        
        Baralho.criarCarta(11, Naipe.ESPADAS);
        
        Baralho.cartas[0].printNaipe();
        
    
    }
    
    
    
    
}
