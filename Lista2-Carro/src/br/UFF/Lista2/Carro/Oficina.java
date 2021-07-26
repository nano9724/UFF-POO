package br.UFF.Lista2.Carro;




public class Oficina {
    private Carro carro; 
    
    Oficina (){
        this.carro=new Carro();
    }
    
    void infoCarro(String cor,String marca,String combustivel, String categoria){
        this.carro.setCor(cor);
        this.carro.setMarca(marca);
        this.carro.setCombustivel(combustivel);
        this.carro.setCategoria(categoria);
        this.carro.setVelocidade(0);
        this.carro.setTranca_portas(false);
        this.carro.setTranca_portaMalas(false);}
        
    public void acelerar(int a) {
      this.carro.setVelocidade(a);
            System.out.println("Aceleração Teste de oficina");
    }

    public void freiar(int f) {
        this.carro.setVelocidade(f);
         System.out.println("Desaceleração Teste de Oficina");
    }

    public void travarPortas() {
     System.out.println("Teste de Oficina");
     if (this.carro.isTranca_portas()==false){
        this.carro.setTranca_portas(true);
        System.out.println("Portas Travadas");
        } 
 }
     
 public void destravarPortas(){
 System.out.println("Teste de Oficina");    
 if (this.carro.isTranca_portas()==true){
     this.carro.setTranca_portas(false);
        System.out.println("Portas Destravadas");
 }}
 
 public void travarPortaMalas(){
     System.out.println("Teste de Oficina");
     if (this.carro.isTranca_portaMalas()==false){
        this.carro.setTranca_portaMalas(true);
        System.out.println("Porta Malas Travado");
 }}
 
 
 public void destravarPortaMalas(){
     System.out.println("Teste de Oficina");
     if (this.carro.isTranca_portaMalas()==true){
        this.carro.setTranca_portaMalas(false);
        System.out.println("Porta Malas Destravado");
 }}
 
 
    
    
    
}
