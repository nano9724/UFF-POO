package br.UFF.Lista2.Carro;




public class Locadora {
    private Carro carro;
    private boolean status; //  false para carro na locadora
    
   
    
    Locadora (){
        this.carro=new Carro();
        this.status=false;
        }
    
    
    void infoCarro(String cor,String marca,String combustivel, String categoria){
        this.carro.setCor(cor);
        this.carro.setMarca(marca);
        this.carro.setCombustivel(combustivel);
        this.carro.setCategoria(categoria);
        this.carro.setVelocidade(0);
        this.carro.setTranca_portas(false);
        this.carro.setTranca_portaMalas(false);
    }
    
    
 public  void  acelerar (){
     this.carro.setVelocidade(+1);
           
 }
   
 public  void  freiar (){
    this.carro.setVelocidade(-1);
     } 
 
 public  void travarPortas(){
              if(this.carro.isTranca_portaMalas()==false)
                this.carro.setTranca_portaMalas(true);
     }
 
 
 public  void destravarPortas(){
             if(this.carro.isTranca_portas()==true)
                this.carro.setTranca_portas(false);
}
 
 public void destravarPortaMalas(){
     if(this.carro.isTranca_portaMalas()==true)
                this.carro.setTranca_portas(false);
 }
 
 public void travarPortaMalas(){
          if(this.carro.isTranca_portaMalas()==false)
                this.carro.setTranca_portas(true);
 }
    
 public void  emprestar (){
      
         
     if(this.status=false){
           System.out.println("Carro Alugado");
           this.status=true;}
       else {
       System.out.println("Carro já está alugado");
       } 
       }
   
   void  devolver (){
        if(this.status=true){
           System.out.println("Carro Devolvido");
           this.status=false;}
       else {
       System.out.println("Carro já está na Locadora");
       } }

    
}
