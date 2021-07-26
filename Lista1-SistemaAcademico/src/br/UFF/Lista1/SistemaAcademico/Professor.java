
package br.UFF.Lista1.SistemaAcademico;

public class Professor {
    private int num_registro;
    private String tipo_registro;
    private String nome;
        
    Professor(String nome, String tipo_registro, int num_registro){
        this.nome=nome;
        this.tipo_registro=tipo_registro;
        this.num_registro=num_registro;    
    }

    public int getNum_registro() {
        return num_registro;
    }

    public String getTipo_registro() {
        return tipo_registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNum_registro(int num_registro) {
        this.num_registro = num_registro;
    }

    public void setTipo_registro(String tipo_registro) {
        this.tipo_registro = tipo_registro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
}
