
package br.UFF.Agenda;

public class Contato {
    String nome; int idade; String tel;
    
     Contato(String n, int i, String t){
     this.nome=n;
     this.idade=i;
     this.tel=t;
     }
    public void imprimirContato(){
    System.out.println("____________________ \n"+"\n"+getNome()+"\n"+getTel()+"\n"+getIdade());
        
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTel() {
        return tel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setIdade(int i) {
        this.idade = i;
    }
    
    void upAge(){
     this.idade++;
     }
    
    void atualizarTel(String t){
     this.tel=t;
     }
    
    
    
}
