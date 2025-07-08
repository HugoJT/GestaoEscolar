package modelo;

public class DisciplinaAula {
    private  Disciplina disciplina;
    private  Aula aula;

    public DisciplinaAula(Disciplina disciplina, Aula aula){
        this.disciplina = disciplina;
        this.aula = aula;

    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public Aula getAula() {
        return aula;
    }
    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public DisciplinaAula(){}

    public  String toString(){
        return "-"+getDisciplina()+
                "-"+getAula();
    }
}
