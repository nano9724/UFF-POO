
package br.com.UFF.Lista3.Agenda;


public class Teste {
    
    public static void main (String[] args){
    
        
        Agenda agenda1=new Agenda();
        agenda1.addPF("Adriano", "12345678987","Rua 1", "08/12/2009");
        agenda1.addPJ("Loja Adriano", "84587458664", "Rua do trabalho", "Rua da loja");
        agenda1.findPessoaf("12345678987");
        agenda1.printContatos();
    
    }
    
    
    
}
