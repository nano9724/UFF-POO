
package br.UFF.Agenda;

import java.util.Scanner;

public class Agenda {
    Contato [] contatos;
    Scanner teclado =new Scanner(System.in);
    int count=0;
    
    public Agenda (){
        contatos= new Contato[100];
    }
    
    void inserirContato (){
        System.out.println("Inserir dados novo Contado");
        System.out.println("Nome:");
        String n= teclado.nextLine();
        System.out.println("Idade:");
        int i= teclado.nextInt();
        System.out.println("Telefone:");
        String t= teclado.nextLine();
        Contato contato= new Contato(n,i,t);
        contatos[count]=contato;
        count++;       
        }
    
    
    
    public boolean atualizarContato(){
       
        System.out.println("Digite o nome do Contato: ");
        String nome= teclado.nextLine();
        for (Contato contato : this.contatos) {
            String n = contato.getNome();
            if (n.equalsIgnoreCase(nome)) {
                System.out.println("Quais Informações Deseja Alterar?");
                System.out.println("Digite:");
                System.out.println(" 1 - Nome ");
                System.out.println(" 2 - Idade ");
                System.out.println(" 3 - Telefone ");
                int option= teclado.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Digite o novo nome: ");
                        String nwName= teclado.nextLine();
                        contato.setNome(nwName);
                        return true;
                    case 2:
                        System.out.println("Digite a nova idade: ");
                        int nwAge= teclado.nextInt();
                        contato.setIdade(nwAge);
                        return true;
                    case 3:
                        System.out.println("Digite o novo telefone: ");
                        int nwTel= teclado.nextInt();
                        contato.setIdade(nwTel);
                        return true;
                    default:
                        return false;
                }
            }
        }
    
        System.out.println("Contato não encontrado");
        return false;
    } 
    
    void imprimirContatos(){
        for (int i=0; i<count; i++) {
            this.contatos[i].imprimirContato();
        }
    }
    
    void imprimirContato(String n){
        
        for (int i=0; i<count; i++) {
            String name = contatos[i].getNome();
            if (name.equalsIgnoreCase(n)) {
                contatos[i].imprimirContato();
            }
        }
    }
    
}
