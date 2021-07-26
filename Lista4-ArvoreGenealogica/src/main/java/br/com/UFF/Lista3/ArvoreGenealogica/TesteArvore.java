
package br.com.UFF.Lista3.ArvoreGenealogica;


public class TesteArvore extends Pessoa {
   
   public TesteArvore(String nome, int idade){
       super(nome, idade);
    }
   
   public static void main (String [] args){
       
   TesteArvore adriano =new TesteArvore("Adriano", 29);
   TesteArvore adriana =new TesteArvore("Adriana", 45);
   TesteArvore luis =new TesteArvore("Luis Henrique", 46);
   TesteArvore eni =new TesteArvore("Eni", 71);
   TesteArvore antonio =new TesteArvore("Antonio", 75);
   TesteArvore jane =new TesteArvore("Jane", 78);
   TesteArvore oswaldo =new TesteArvore("Oswaldo", 81);
   adriano.setMae(adriana);
   adriano.setPai(luis);
   adriana.setMae(eni);
   adriana.setPai(antonio);
   luis.setMae(jane);
   luis.setPai(oswaldo);
   
   adriano.printFamily();
   
   }
    
}
