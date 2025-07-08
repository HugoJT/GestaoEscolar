package modelo;

public class AulaTurma {
    private Aula aula;
    private Turma turma;

    public AulaTurma(Aula aula, Turma turma) {
        this.aula = aula;
        this.turma = turma;
    }
    public Aula getAula() {
        return aula;
    }
    public void setAula(Aula aula) {
        this.aula = aula;
    }
    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public AulaTurma() {}

    public String toString(){
        return "\n -"+getAula()+
                "\n -"+getTurma();
    }
}
