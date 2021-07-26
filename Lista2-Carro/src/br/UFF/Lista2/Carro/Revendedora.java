package br.UFF.Lista2.Carro;




import java.util.Scanner;


public class Revendedora {
       private Carro carro; 
       private boolean disponibilidade;
    
    Revendedora (){
        this.carro=new Carro();
        this.disponibilidade=true;
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
        

    public void testeAcelerar() {
      this.carro.setVelocidade(20);
      System.out.println("Aceleração Teste de Compra/Venda");
    }

    public void freiar() {
         this.carro.setVelocidade(0);
         System.out.println("Desaceleração Teste de Compra/Venda");
    }

    public void travarPortas() {
     System.out.println("Teste de Travas p/ Compra/Venda");
     if (this.carro.isTranca_portas()==false){
        this.carro.setTranca_portas(true);
        System.out.println("Portas Travadas");
     } 
 }
 
 public  void destravarPortas(){
 System.out.println("Teste de Travas p/ Compra/Venda");    
 if (this.carro.isTranca_portas()==true){
        this.carro.setTranca_portas(false);
        System.out.println("Portas Destravadas");
 }}
 
 public void travarPortaMalas(){
     System.out.println("Teste de Travas p/ Compra/Venda");
     if (this.carro.isTranca_portaMalas()==false){
        this.carro.setTranca_portaMalas(true);
        System.out.println("Porta Malas Travado");
 }}
 
 public void destravarPortaMalas(){
     System.out.println("Teste de Travas p/ Compra/Venda");
     if (this.carro.isTranca_portaMalas()==true){
        this.carro.setTranca_portaMalas(false);
        System.out.println("Porta Malas Destravado");
 }}
    
   public void comprar(){
       System.out.println("Informe os dados do Carro a Comprar");
       Scanner teclado=new Scanner(System.in);
       System.out.println("Cor: ");
       String cor=teclado.nextLine();
       System.out.println("Marca: ");
       String marca=teclado.nextLine();
       System.out.println("Tipo de Combustível: ");
       String combustivel=teclado.nextLine();
       System.out.println("Categoria: ");
       String categoria=teclado.nextLine();
       infoCarro(cor,marca,combustivel,categoria);
       System.out.println("Carro Comprado");
      } 
    
   public void vender(){
       if(this.disponibilidade==true){
       System.out.println("Carro Vendido");
       this.disponibilidade=false;}
       System.out.println("Carro Vendido");
      } 
}
