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


		List<Paciente> p = pacienteRepositorio.findAll();
		System.out.println(p.get(0).toString());
		System.out.println(p.get(0).getCitas().get(0).getId());
		System.out.println(p.get(0).getCitas().get(0).getCitaRealizada());
		System.out.println(p.get(0).getCitas().get(0).getDiaDeCita());
		System.out.println(p.get(0).getCitas().get(0).getPaciente().getNombre());
		//
//		System.out.println(pacienteRepositorio != null);
//		Paciente p = new Paciente();
//		p.setNombre("Luis");
//		p.setaPaterno("Santos");
//		p.setaMaterno("Navarro");
//		p.setDiagnostico("Paciente con problemas mentales");
//		p.setEdad(27);
//		p.setGenero(Genero.MASCULINO);
//		p.setNumTelefono("6691295551");
//		Citas cita = new Citas();
//		cita.setCitaRealizada(false);
//		Calendar cal = Calendar.getInstance();
//		cal.set(2000,5,25);
//		cita.setDiaDeCita(cal.getTime());
//		cita.setPaciente(p);
//
//		pacienteRepositorio.save(p);
//		citasRepositorio.save(cita);










	}

}
