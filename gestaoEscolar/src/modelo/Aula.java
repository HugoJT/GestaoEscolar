package modelo;

import java.util.Date;

public class Aula {
    private Date data;
    private String horaInicio, horaFim;
    private int id;
    private AulaTurma aulaTurma;


    public Aula(Date data, String horaInicio, String horaFim, int id, AulaTurma aulaTurma) {
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.id = id;
        this.aulaTurma = aulaTurma;
    }
    public Date getData() {
        return data;

    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getHoraInicio() {
        return horaInicio;
    }
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }
    public String getHoraFim() {
        return horaFim;
    }
    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public AulaTurma getAulaTurma() {
        return aulaTurma;
    }
    public void setAulaTurma(AulaTurma aulaTurma) {
        this.aulaTurma = aulaTurma;
    }

    public Aula(){}

    public String toString(){
        return  "\n ------------Aula------------"+
                "\n Data"+getData()+
                "\n Hora de Inicio: "+getHoraInicio()+
                "\n Hora de Fim: "+getHoraFim()+
                "\n Id: "+getId()+
                "\n •"+getId();
    }
}
