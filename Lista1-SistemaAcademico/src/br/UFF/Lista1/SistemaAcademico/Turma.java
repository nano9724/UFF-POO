
package br.UFF.Lista1.SistemaAcademico;

public class Turma {
    
    private String codigo;
    private Professor professor;
    private Inscricao [] alunos;
    private int qtdeA;
    
    Turma (String c,Professor p){
        this.codigo=c;
        this.professor=p;
        this.alunos=new Inscricao[50];
        this.qtdeA=0;
        }
    
    boolean addInscricao(Aluno a, Disciplina d ){
        if (qtdeA<alunos.length){
        Inscricao inscricao=new Inscricao(a,d);
        alunos[qtdeA]=inscricao;
        a.inscrever(inscricao);
        qtdeA++;return true;
        }else {
        System.out.println("Turma Cheia");return false;
        }
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setAlunos(Inscricao[] alunos) {
        this.alunos = alunos;
    }

    public void setQtdeA(int qtdeA) {
        this.qtdeA = qtdeA;
    }

    public String getCodigo() {
        return codigo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Inscricao[] getAlunos() {
        return alunos;
    }

    public int getQtdeA() {
        return qtdeA;
    }
     void setProfessor(Professor p){
        this.professor=p;}
   
}
