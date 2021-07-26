
package br.com.UFF.Lista3.Agenda;


 class PessoaJuridica extends Contato  {
    
    private String CNPJ;
    private String faturamento;
    
    PessoaJuridica(String razao, String CNPJ, String endereco, String f){
        super(razao,endereco);
        this.CNPJ=CNPJ;
        this.faturamento=f;    
    }
       
    public void printPessoaJ(){
        
   String print= "Razão Social: "+ this.getRazaoSocial() + 
            " \nCNPJ: "+ this.getCNPJ() + 
            " \nEndereço: "+ this.getEndereco() +
            " \nFaturamento: "+ this.getFaturamento();
   System.out.println(print);
   System.out.println("_______________________________");
    }

    
    public String getRazaoSocial() {
        return getNome();
    }
    
    @Override
    public String getEndereco(){
    return this.getEndereco();
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getFaturamento() {
        return faturamento;
    }
    
    
    
}
