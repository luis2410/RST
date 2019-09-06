package com.santos.RST;

import com.santos.RST.entity.Citas;
import com.santos.RST.entity.Paciente;
import com.santos.RST.enums.Genero;
import com.santos.RST.repository.CitasRepositorio;
import com.santos.RST.repository.PacienteRepositorio;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.print.attribute.DocAttribute;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RstApplicationTests {

	@Autowired
	PacienteRepositorio pacienteRepositorio;

	@Autowired
	CitasRepositorio citasRepositorio;

	@Test
	@Transactional
	public void contextLoads() {

//		Optional<Paciente> po = pacienteRepositorio.findById(1);
//		Paciente p = po.get();
//
//		Citas cita = new Citas();
//		cita.setCitaRealizada(true);
//		Calendar cal = Calendar.getInstance();
//		cal.set(2120,4,5);
//		cita.setDiaDeCita(cal.getTime());
//		cita.setPaciente(p);
//		citasRepositorio.save(cita);


//		List<Paciente> p = pacienteRepositorio.findAll();

		//
//		System.out.println(pacienteRepositorio != null);
//		Paciente p = new Paciente();
//		p.setNombre("Rafael");
//		p.setaPaterno("Santos");
//		p.setaMaterno("Tovar");
//		p.setDiagnostico("Problemas para dormir");
//		p.setEdad(50);
//		p.setGenero(Genero.MASCULINO);
//		p.setNumTelefono("6691123456");
//
//		Citas cita = new Citas();
//		cita.setCitaRealizada(false);
//		Calendar cal = Calendar.getInstance();
//		cal.set(2020,5,2);
//		cita.setDiaDeCita(cal.getTime());
//		cita.setPaciente(p);
//
//		Citas cita2 = new Citas();
//		cita2.setCitaRealizada(false);
//
//		cal.set(2019,2,9);
//		cita2.setDiaDeCita(cal.getTime());
//		cita2.setPaciente(p);
//
//		pacienteRepositorio.save(p);
//		citasRepositorio.save(cita);
//		citasRepositorio.save(cita2);










	}

}
