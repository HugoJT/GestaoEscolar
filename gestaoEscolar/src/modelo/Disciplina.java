package modelo;

public class Disciplina {
    private String nome, codigo;
    private DisciplinaAula disciplinaAula;

    public Disciplina(String nome, String codigo, DisciplinaAula disciplinaAula) {
        this.nome = nome;
        this.codigo = codigo;
        this.disciplinaAula = disciplinaAula;
    }
    public String getNome() {
        return nome;

    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public DisciplinaAula getDisciplinaAula() {
        return disciplinaAula;
    }

    public void setDisciplinaAula(DisciplinaAula disciplinaAula) {
        this.disciplinaAula = disciplinaAula;
    }

    public  Disciplina(){}

    public String toString(){
        return "\n ------------Disciplina------------"+
                "\n Nome da Disciplina"+getNome()+
                "\n Codigo da Disciplina"+getCodigo()+
                "\n •"+getDisciplinaAula();
    }
}

