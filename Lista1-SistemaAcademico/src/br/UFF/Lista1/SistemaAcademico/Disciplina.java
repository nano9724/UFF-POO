package br.UFF.Lista1.SistemaAcademico;


public class Disciplina {
    private String codigo;
    private String nome;
    private String ementa;
    private int cargahoraria;
    private String horario;
    
    Disciplina (String codigo, String nome, String ementa, int ch, String h){
        this.codigo=codigo;
        this.nome=nome;
        this.ementa=ementa;
        this.cargahoraria=ch;
        this.horario=h;
    }
    
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public String getNome() {
        return nome;
    } 

    public String getCodigo() {
        return codigo;
    }

    public String getEmenta() {
        return ementa;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }
    
   
    }
    
