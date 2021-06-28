
package br.UFF.Casa;

public class Casa {
    
    String nome; 
    Porta p1, p2,p3;
    
    Casa(String nome){
        this.nome=nome;       
    }
    
        void addPorta(int num){
        switch (num) {
            case 1:
                Porta porta1=new Porta();
                p1=porta1;
                break;
            case 2:
                Porta porta2=new Porta();
                p2=porta2;
                break;
            case 3:
                Porta porta3=new Porta();
                p3=porta3;
                break;
            default:
                break;
        }
       }
        
        
        
      void  quantasPortasEstaoAbertas(){
         int count=0;
         if (p1!=null){count+= p1.estaAberta();}
         if (p2!=null){count+= p2.estaAberta();}
         if (p3!=null){count+= p3.estaAberta();}
         
         System.out.println("Há "+count+ " Porta(s) Aberta(s)");
                                                             
 }
      
       
    
    
    public static void main(String[] args){
        Casa c1=new Casa ("C1");
        c1.addPorta(1);
        c1.addPorta(2);
        c1.addPorta(3);
        c1.p1.abrirFechar();
        c1.p2.abrirFechar();
        c1.p2.abrirFechar();
        c1.p3.abrirFechar();
        c1.quantasPortasEstaoAbertas();
        
     
    }
}


