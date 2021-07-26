
package br.com.UFF.Lista3.ArvoreGenealogica;


public class Pessoa  {
    
    private String nome;
    private int idade;
    private Pessoa mae;
    private Pessoa pai;
   
    public Pessoa(String nome, int idade){
    this.nome=nome;
    this.idade=idade;
    }
    
    public String getNome(){
    return nome;
    }
    
    public void setPai(Pessoa p){
    this.pai=p;
    }
    
     public void setMae(Pessoa p){
    this.mae=p;
    }
     
     void printFamily(){
         System.out.println("Árvore Genealógica " +getNome());
         
         if (mae!=null){
           System.out.println("Mãe " + mae.getNome());
           if (mae.mae!=null){
           System.out.println("Avó Materna: " + mae.mae.getNome());
           }
           if(mae.pai!=null){
           System.out.println("Avô Materno: " + mae.pai.getNome());
           }
           
         }
         
         if (pai!=null){
        System.out.println("Pai " + pai.getNome());
            if (pai.mae!=null){
           System.out.println("Avó Paterna: " + pai.mae.getNome());
           }
           if(pai.pai!=null){
           System.out.println("Avô Paterno: " + pai.pai.getNome());
           }
           }}
    
}
