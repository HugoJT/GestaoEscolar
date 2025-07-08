package modelo;

public class Professor extends Pessoa{
    private String siaper;
    private ProfessorDisciplina professorDisciplina;

    public Professor(String nome, String email, String cpf, int idade , ProfessorDisciplina professorDisciplina) {
        super(nome, email, cpf, idade);
        this.siaper = siaper;
        this.professorDisciplina = professorDisciplina;
    }
    public String getSiaper() {
        return siaper;
    }
    public void setSiaper(String siaper) {
        this.siaper = siaper;
    }
    public ProfessorDisciplina getProfessorDisciplina() {
        return professorDisciplina;
    }

    public void setProfessorDisciplina(ProfessorDisciplina professorDisciplina) {
        this.professorDisciplina = professorDisciplina;
    }

    public Professor() {}

    public String toString(){
        return "\n ------------Professor ---------------"+
                "\n Nome: "+getNome()+
                "\n Email: "+ getEmail()+
                "\n CPF: "+getCpf()+
                "\n Idade: "+getIdade()+
                "\n Siaper: "+getIdade();
    }
}
