package com.seccion4.orm4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seccion4.orm4.model.Paciente;
import com.seccion4.orm4.repository.PacienteRepository;

@Service
public class PacienteService {
    @Autowired // para conectar con el repositorio (primero se debe hacer en el repositorio lo del metodo para encontrar todos)
    private PacienteRepository pacienteRepository;

    public List<Paciente> findAll(){
        return pacienteRepository.findAll();
    }

    public Paciente save(Paciente paciente){
		return pacienteRepository.save(paciente);
	}

}
