package modelo;

public class Aluno extends Pessoa{
    private int matr;
    private AlunoAula alunoAula;

    public Aluno(int matr, String nome, String email, String cpf, int idade, AlunoAula alunoAula) {
        super(nome, email, cpf, idade);
        this.matr = matr;
        this.alunoAula = alunoAula;

    }
    public int getMatr() {
        return matr;
    }
    public void setMatr(int matr) {
        this.matr = matr;
    }
    public AlunoAula getAlunoAula() {
        return alunoAula;
    }
    public void setAlunoAula(AlunoAula alunoAula) {
        this.alunoAula = alunoAula;
    }

    public String toString(){
        return "\n ------------Aula------------"+
                "\n Nome: "+getNome()+
                "\n Email: "+getEmail()+
                "\n CPF: "+getCpf()+
                "\n Idade: "+getIdade()+
                "\n Matricula: "+getMatr()+
                "\n • "+getAlunoAula();
    }
}
