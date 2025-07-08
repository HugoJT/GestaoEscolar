package modelo;

public class AlunoAula {
    private Aula aula;
    private Aluno aluno;

    public AlunoAula(Aula aula, Aluno aluno) {
        this.aula = aula;
        this.aluno = aluno;
    }
    public Aula getAula() {
        return aula;
    }
    public void setAula(Aula aula) {
        this.aula = aula;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public AlunoAula(){}

    public String toString(){
        return "\n - "+getAluno()+
                "\n - "+getAula();
    }
}
