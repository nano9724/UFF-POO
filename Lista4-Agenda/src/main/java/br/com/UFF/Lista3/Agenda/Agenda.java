package br.com.UFF.Lista3.Agenda;
import java.util.*;

public class Agenda {
         
    ArrayList <PessoaJuridica> pessoasj;
    ArrayList <PessoaFisica> pessoas;
    
    Agenda(){
        pessoasj = new ArrayList();
        pessoas = new ArrayList();
    }
    
    void addPF(String n, String cpf, String endereco, String data_nascimento){
       PessoaFisica p=new PessoaFisica(n,cpf, endereco,data_nascimento);
       pessoas.add(p);
    }
    
    void addPJ(String n, String cnpj,String endereco, String faturamento){
       PessoaJuridica p=new PessoaJuridica(n,cnpj, endereco, faturamento);
       pessoasj.add(p);}
    
    void findPessoaf(String cpf){
        int n= pessoas.size();
        for (int i=0; i<n; i++){
            if((pessoas.get(i).getCpf()).equals(cpf)){
                pessoas.get(i).printPessoaF();
            }else {System.out.println("Não está na lista");}
        }};
    
    void findPessoaJ (String CNPJ){
        int n= pessoasj.size();
        for (int i=0; i<n; i++){
            if((pessoasj.get(i).getCNPJ()).equals(CNPJ)){
                pessoasj.get(i).printPessoaJ();
            }else {System.out.println("Não está na lista");}
        }};
    
    void printContatos(){
        int n=pessoas.size();
        for(int i=0; i<n; i++){
        pessoas.get(i).printPessoaF();
        }
        int m = pessoasj.size();
         for(int j=0; j<m; j++){
         pessoasj.get(j).printPessoaJ();
         }
    }
  
}


