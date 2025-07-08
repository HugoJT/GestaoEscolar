package modelo;

public class Turma {
    private String codigo, anoLetivo, turno;

    public Turma(String codigo, String anoLetivo, String turno) {
        this.codigo = codigo;
        this.anoLetivo = anoLetivo;
        this.turno = turno;

    }
    public String getCodigo() {
        return codigo;

    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getAnoLetivo() {
        return anoLetivo;
    }
    public void setAnoLetivo(String anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public String getTurno() {
        return turno;

    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Turma() {}

    @Override
    public String toString(){
        return"\n ------------Turma------------"+
                "\n Codigo: "+getCodigo()+
                "\n Ano Letivo: "+getAnoLetivo()+
                "\n Turno: "+getTurno();
    }
}
