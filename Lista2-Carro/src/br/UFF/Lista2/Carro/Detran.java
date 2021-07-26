package br.UFF.Lista2.Carro;





public class Detran {
    private Carro carro;
    private boolean avaliacao;
    
    Detran(){
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
    
    
    boolean acelerar(int a) {
        this.carro.setVelocidade(a);
            System.out.println("Vistoria na Aceleração");
            return true;
    }
    
    boolean freiar(int f) {    
        this.carro.setVelocidade(f);
            System.out.println("Vistoria no Freio");
            return true;
    }
    
    boolean travarPortas() {
        System.out.println("Vistoria do Detran");
     if (this.carro.isTranca_portas()==false){
        this.carro.setTranca_portas(true);
        System.out.println("Travas das Portas Verificadas");
        return true;
     }return false;
    
    }
    
    boolean destravarPortas() {
     System.out.println("Vistoria do Detran");    
 if (this.carro.isTranca_portas()==true){
     this.carro.setTranca_portas(false);
        System.out.println("Destravamento de Portas Verificadas");    
        return true;}
        return false;
    }
    
    boolean travarPortaMalas() {
       System.out.println("Vistoria do Detran");
     if (this.carro.isTranca_portaMalas()==false){
        this.carro.setTranca_portaMalas(true);
        System.out.println("Destravamento do Porta Malas Verificado");
        return true;
     }  return false;}
    
    boolean destravarPortaMalas() {
       System.out.println("Vistoria do Detran");
     if (this.carro.isTranca_portaMalas()==true){
        this.carro.setTranca_portaMalas(false);
        System.out.println("Destravamento do Porta Malas Verificado");
        return true;
     }  return false;}
    
    public void avaliar (){
        if (travarPortas())
            if(destravarPortas())
                if(travarPortaMalas())
                    if(destravarPortaMalas())
                        this.avaliacao=true;
                           System.out.println("Vistoria em dia no Detran");
        
    }
    
    
}
