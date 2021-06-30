
package br.UFF.Lista1.Baralho;

        
        
public class Baralho {
    Carta [] cartas;
    int qtde;
        
  Baralho(){
  cartas =new Carta[52];
  this.qtde=0;
  }  
  
  
  void criarCarta(int valor, Naipe naipe){
  
      
      Carta carta=new Carta(valor, naipe);
      cartas[qtde]=carta;
      qtde++;
  }
  
  
  
  
  void printCartas(){
  
      for (int i=0; i<this.qtde; i++){
      
      System.out.println("_______________________");
      System.out.println("|_________________"+cartas[i].printValor()+"|");
      System.out.println("|                     |");
      System.out.println("|                     |");
      System.out.println("|         "+cartas[i].printNaipe()+"        |");
      System.out.println("|                     |");
      System.out.println("|                     |");
      System.out.println("|                     |");
      System.out.println("|"+cartas[i].printValor()+"                   |");
      System.out.println("_______________________");
  }
  
  }
  
  
    void iniciarBaralho(){
        if(cartas.length<52){
            int vcarta=1;
            for (int j=1; j<=13; j++){
                
                for(int i=0; i<=3;i++){
                    Naipe naipe;
                    switch (i) {
                        case 0 :
                            {
                                
                                naipe=Naipe.COPAS;
                                Carta carta=new Carta(vcarta, naipe);
                                cartas[qtde]=carta;
                                qtde++;
                                
                                break;
                            }
                        case 1:
                            {
                                naipe=Naipe.ESPADAS;
                                Carta carta=new Carta(vcarta, naipe);
                                cartas[qtde]=carta;
                                qtde++;
                                break;
                            }
                        case 2:
                            {
                                naipe=Naipe.OUROS;
                                Carta carta=new Carta(vcarta, naipe);   
                                cartas[qtde]=carta;
                                qtde++;
                                break;
                            }
                        case 3:
                            {
                                naipe=Naipe.PAUS;
                                Carta carta=new Carta(vcarta, naipe);
                                cartas[qtde]=carta;
                                qtde++;
                                break;
                            }
                        default:
                            break;
                    }
                    vcarta++;}
            }
                }
            }
    
    
    
        
}
