
package br.UFF.Celular;


public class TesteCelular {
    
    public static void main(String[] args){
    
        Celular Celular1 = new Celular("Adriano");
        Celular Celular2 = new Celular("Joao");
       
        Celular2.mensagem(Celular1);
        Celular1.efetuarLigacao(Celular2);
        
        
        int mensagens1 =Celular1.numM;
        System.out.println("Número de Mensagens"+mensagens1);
        int mensagens2 =Celular2.numM;
        System.out.println("Número de Mensagens"+mensagens2);
        int ligacoes1 =Celular1.numRegistros;
        System.out.println("Número de Ligações"+ligacoes1);
        int ligacoes2 =Celular2.numRegistros;
        System.out.println("Número de Ligações"+ligacoes2);
        
             System.out.println(Celular1.bateria.nivel);
    }
    
    
    
}
