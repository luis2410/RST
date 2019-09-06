package com.santos.RST.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apaterno")
    private String aPaterno;
    @Column(name = "amaterno")
    private String aMaterno;
    @Column(name = "edad")
    private String edad;
    @Column(name = "numtelefono")
    private String numTelefono;
    @Column(name = "genero")
    private String genero;
    @Column(name = "diagnostico", length = 512)
    private String diagnostico;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "paciente")
    private List<Citas> citas;

    public Paciente() {
    }

    public Paciente(Integer id, String nombre, String aPaterno, String aMaterno, String edad, String numTelefono, String genero, String diagnostico, List<Citas> citas) {
        this.id = id;
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.edad = edad;
        this.numTelefono = numTelefono;
        this.genero = genero;
        this.diagnostico = diagnostico;
        this.citas = citas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public List<Citas> getCitas() {
        return citas;
    }

    public void setCitas(List<Citas> citas) {
        this.citas = citas;
    }
}
