package com.santos.RST.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "citas")
public class Citas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "citarealizada")
    private Boolean citaRealizada;

    @Temporal(TemporalType.DATE)
    @Column(name = "diadecita")
    private Date diaDeCita;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_PACIENTES", nullable = false, updatable = false)
    @JsonIgnore
    private Paciente paciente;

    public Citas() {
    }

    public Citas(Integer id, Boolean citaRealizada, Date diaDeCita, Paciente paciente) {
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

    public Date getDiaDeCita() {
        return diaDeCita;
    }

    public void setDiaDeCita(Date diaDeCita) {
        this.diaDeCita = diaDeCita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
