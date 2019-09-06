package com.santos.RST.repository;

import com.santos.RST.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepositorio extends JpaRepository<Paciente,Integer> {}
