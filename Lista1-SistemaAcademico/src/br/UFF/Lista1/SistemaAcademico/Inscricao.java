
package br.UFF.Lista1.SistemaAcademico;


public class Inscricao {
   
    private Disciplina disciplina;
    private Aluno aluno;
    private float [] nota;
    private int numN;
    
    Inscricao(Aluno a,Disciplina disciplina){
        this.aluno=a;
        this.disciplina=disciplina;
        this.nota=new float[4]; 
        this.numN=0;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setNota(float nota) {
        if(numN<3){
        this.nota[numN] = nota;}
    }

    public Disciplina getDisciplina(){
        return disciplina;
    }

    public Aluno getAluno(){
        return aluno;
    }

    public float getNota(){
        float nota=0;
        for (int i=0;i<4;i++)
         nota=this.nota[i];
        return nota;
    }
    
    public float getMedia(){
        float nota=0;        
        nota=this.nota[3];
        return nota;
    }
    
    public void setMedia(float nota) {
        this.nota[3] = nota;
    }
        
    }
    
   
    
    
    
    
    
    
    

