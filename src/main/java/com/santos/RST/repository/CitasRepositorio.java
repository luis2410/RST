package com.santos.RST.repository;

import com.santos.RST.entity.Citas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface CitasRepositorio extends JpaRepository<Citas, Serializable> {}
