package modelo;

public class FuncioanarioAdministrativo extends Pessoa {
    private String setor, cargo;
    private Aula aula;

    public FuncioanarioAdministrativo(String setor, String cargo, Aula aula, String nome, String email, String cpf, int idade) {
        super(nome, email, cpf, idade);
        this.setor = setor;
        this.cargo = cargo;
        this.aula = aula;
    }
    public String getSetor() {
        return setor;
    }
    public String getCargo() {
        return cargo;
    }
    public Aula getAula() {
        return aula;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public FuncioanarioAdministrativo(){}

    public String toString(){
        return "\n ------------FuncioanarioAdministrativo------------"+
                "\n Nome: "+getNome()+
                "\n Email: "+getEmail()+
                "\n Cpf: "+getCpf()+
                "\n Idade: "+getIdade()+
                "\n Setor: "+getSetor()+
                "\n Cargo: "+getCargo()+
                "\n Aulas: "+getAula();
    }




}
