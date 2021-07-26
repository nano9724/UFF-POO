package br.UFF.Lista2.Carro;





public class TesteCarros {
        
    public static void main (String[] args){
        
        Locadora carroLocadora= new Locadora();
        Revendedora carroRevendedora= new Revendedora();
        Oficina carroOficina= new Oficina();
        Detran carroDetran= new Detran();
        
        carroLocadora.infoCarro("Branco", "Ford", "Gasolina", "SUV");
        carroLocadora.acelerar();
        carroLocadora.freiar();
        carroLocadora.emprestar();
        carroLocadora.emprestar();
        
        carroRevendedora.comprar();
        carroRevendedora.testeAcelerar();
        carroRevendedora.freiar();
        carroRevendedora.travarPortas();
        carroRevendedora.vender();
        
        carroOficina.infoCarro("Vermelho", "Fiat", "GNV", "Sedan");
        carroOficina.acelerar(20);
        carroOficina.freiar(20);
        carroOficina.travarPortas();
        carroOficina.destravarPortas();
        
        carroDetran.infoCarro("Azul", "Nissan", "Diesel", "4x4");
        carroDetran.avaliar();
        
    }
}
