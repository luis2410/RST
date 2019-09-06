package com.santos.RST.entity;

import com.santos.RST.enums.Genero;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "paciente")
public class Paciente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apaterno")
    private String aPaterno;
    @Column(name = "amaterno")
    private String aMaterno;
    @Column(name = "edad")
    private Integer edad;
    @Column(name = "numtelefono")
    private String numTelefono;
    @Column(name = "genero")
    @Enumerated(EnumType.STRING)
    private Genero genero;
    @Column(name = "diagnostico", length = 512)
    private String diagnostico;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "paciente")
    private List<Citas> citas;

    public Paciente() {
    }

    public Paciente(Integer id, String nombre, String aPaterno, String aMaterno, Integer edad, String numTelefono, Genero genero, String diagnostico, List<Citas> citas) {
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
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

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", aPaterno='" + aPaterno + '\'' +
                ", aMaterno='" + aMaterno + '\'' +
                ", edad=" + edad +
                ", numTelefono='" + numTelefono + '\'' +
                ", genero=" + genero +
                ", diagnostico='" + diagnostico + '\'' +
                ", citas=" + citas +
                '}';
    }
}
