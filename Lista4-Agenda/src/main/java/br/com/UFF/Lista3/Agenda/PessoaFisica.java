

package br.com.UFF.Lista3.Agenda;

  class PessoaFisica extends Contato   {
   
   private String cpf;
   private String data_nascimento;
    
   
   
    PessoaFisica(String nome, String cpf, String data_nascimento, String endereco){
        super(nome,endereco);
        this.cpf=cpf;
        this.data_nascimento=data_nascimento;
    }
    
     public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return this.getEndereco();
    }
        
    public void printPessoaF(){
    String print= "Razão Social: "+ this.getNome()  + 
            " \nCNPJ: "+ this.getCpf() +
            " \nEndereço: "+this.getEndereco();
    System.out.println(print);
    System.out.println("_______________________________");
            
    }
    
    
    
    
}
