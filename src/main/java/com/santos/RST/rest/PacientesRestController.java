package com.santos.RST.rest;

import com.santos.RST.entity.Paciente;
import com.santos.RST.repository.PacienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pacientes")
public class PacientesRestController {

    @Autowired
    PacienteRepositorio pacienteRepositorio;

    @GetMapping
    public List<Paciente> listaPacientes(){
        return pacienteRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public Paciente getPaciente(@PathVariable Integer id){
        Optional<Paciente> po = pacienteRepositorio.findById(id);
        return po.get();
    }

}
