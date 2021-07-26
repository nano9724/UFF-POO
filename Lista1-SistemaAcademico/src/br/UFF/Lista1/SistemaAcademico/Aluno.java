
package br.UFF.Lista1.SistemaAcademico;


public class Aluno {
    
    private int matricula;
    private String nome;
    private String nascimento;
    private String curso;
    private int CR;    
    private Inscricao [] disciplinas;
    private int qtdeD;
    
    Aluno(int matricula, String nome, String nascimento,String curso){
        this.matricula=matricula;
        this.nascimento=nascimento;
        this.curso=curso;
        disciplinas= new Inscricao[100];
        this.qtdeD=0;
        }
    
    public void printAluno(){
        System.out.println("Matricula: "+getMatricula());
        System.out.println("Nome: "+getNome());
        System.out.println("Nascimento: "+getNascimento());
        System.out.println("Curso: "+getCurso());
     }
    
    public void printHistoricoAluno(){
        for(int i=0; i<qtdeD;i++){
        System.out.println("Código: "+this.disciplinas[i].getDisciplina().getCodigo());
        System.out.println("Nome: "+this.disciplinas[i].getDisciplina().getNome());
        System.out.println("Ementa: "+this.disciplinas[i].getDisciplina().getEmenta());
        }}
    
    float imprimirNotas (){
        float nota=0;
        for (int i=0; i<=qtdeD;i++){
            nota=this.disciplinas[i].getNota();
            System.out.println(this.disciplinas[i].getDisciplina().getNome());
            }return nota;    
    }
    
    float mediaTurma(Disciplina d){
       float media=0;
       for (int i=0; i<=qtdeD;i++){ 
        if(disciplinas.equals(d)){
        media=this.disciplinas[i].getNota();
        media/=3;
        }
     }return media;}
    
    void imprimeHorario(Disciplina d){
        for (int i=0; i<=qtdeD;i++){ 
        if(disciplinas.equals(d)){
        System.out.println(this.disciplinas[i].getDisciplina().getHorario());
    }}
    }
    
    void imprimeEmenta(Disciplina d){
        for (int i=0; i<=qtdeD;i++){ 
        if(disciplinas.equals(d)){
        System.out.println(this.disciplinas[i].getDisciplina().getEmenta());
    }}
    }
    
    float calculoCR (){
        float nota=0,cgh=0, cr=0,cr_atual=0;
        
        for(int i=0; i<=this.qtdeD;i++){
        cgh=this.disciplinas[i].getDisciplina().getCargahoraria();
        nota=this.disciplinas[i].getMedia();
        cr_atual=cgh*nota;
        cr+=cr_atual;
        }
        return cr;
    }
        
     public void inscrever (Inscricao d) {
        this.disciplinas[qtdeD]=d;
        qtdeD++;
    }     

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public String getCurso() {
        return curso;
    }

    public int getCR() {
        return CR;
    }

    public Inscricao[] getDisciplinas() {
        return disciplinas;
    }

    public int getQtdeD() {
        return qtdeD;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setCR(int CR) {
        this.CR = CR;
    }

    public void setDisciplinas(Inscricao[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void setQtdeD(int qtdeD) {
        this.qtdeD = qtdeD;
    }
    
    
}
