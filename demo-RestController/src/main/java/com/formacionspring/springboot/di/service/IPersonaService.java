package com.formacionspring.springboot.di.service;

import java.util.List;
import java.util.Optional;

import com.formacionspring.springboot.di.entity.Persona;

public interface IPersonaService {

	public List<Persona> findAllPersona();

	public Optional<Persona>findById(Long id);
	
	public List<Persona> findByName(String nombre);
	
	public Persona savePersona(Persona personaNew);

	public String deletePersona(Long id);
	
	public void deletePersonas();

	public Persona updatePersona(Long id,Persona personaNew);
}
