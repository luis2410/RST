package com.santos.RST.entity;


import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "citas")
public class Citas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "citarealizada")
    private Boolean citaRealizada;

    @Temporal(TemporalType.DATE)
    @Column(name = "diadecita")
    private Calendar diaDeCita;

    @ManyToOne
    private Paciente paciente;

    public Citas() {
    }

    public Citas(Integer id, Boolean citaRealizada, Calendar diaDeCita, Paciente paciente) {
        this.id = id;
        this.citaRealizada = citaRealizada;
        this.diaDeCita = diaDeCita;
        this.paciente = paciente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getCitaRealizada() {
        return citaRealizada;
    }

    public void setCitaRealizada(Boolean citaRealizada) {
        this.citaRealizada = citaRealizada;
    }

    public Calendar getDiaDeCita() {
        return diaDeCita;
    }

    public void setDiaDeCita(Calendar diaDeCita) {
        this.diaDeCita = diaDeCita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
