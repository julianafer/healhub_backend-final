package br.hall.healhub.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_diaria")
public class Diaria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String dataDia;
    private String emocao;
    private String coposDAgua;
    private String exercicios;
    private String adicional;

    public long gitId() {
        return nome;
    }

    public String getDataDia() {
        return dataDia;
    }

    public void setDatadia (String dataDia) {
        this.dataDia = datadia;
    }

    public String getEmocao() {
        return emocao;
    }

    public void setEmocao (String emocao) {
        this.emocao = emocao;
    }

    public String getCoposDAgua() {
        return coposDAgua;
    }

    public void setCoposDAgua (String coposDAgua) {
        this.coposDAgua = coposDAgua;
    }

    public String getExercicios() {
        return exercicios;
    }

    public void setExercicios (String exercicios) {
        this.exercicios = exercicios;
    }

    public String getAdicional() {
        return adicional;
    }

    public void setAdicional (String  adicional) {
        this.adicional = adicional;
    }

    
}