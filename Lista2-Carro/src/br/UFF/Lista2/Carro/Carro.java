package br.UFF.Lista2.Carro;





public class Carro {

    private String cor,marca,combustivel, categoria;
    private double velocidade;
    private boolean tranca_portas; //false = portas travadas 
    private boolean tranca_portaMalas; //false = portaMalas travado
    
    
    Carro(){}
    
    public void setVelocidade(double velocidade) {
        this.velocidade += velocidade;
    }

    public void setTranca_portas(boolean tranca_portas) {
        this.tranca_portas = tranca_portas;
    }

    public void setTranca_portaMalas(boolean tranca_portaMalas) {
        this.tranca_portaMalas = tranca_portaMalas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public boolean isTranca_portas() {
        return tranca_portas;
    }

    public boolean isTranca_portaMalas() {
        return tranca_portaMalas;
    }
        
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }


 void  acelerar (){};
 void  freiar (){};
 void travarPortas(){};
 void destravarPortas(){};
 void destravarPortaMalas(){};    

}
