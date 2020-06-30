package com.formacionspring.springboot.di.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.formacionspring.springboot.di.entity.Persona;
import com.formacionspring.springboot.di.service.IPersonaService;

@RestController
public class PersonaControllerImpl implements IPersonaService {

	@Autowired
	private IPersonaService service;
	
	
	@GetMapping("/listar")
	@Override
	public List<Persona> findAllPersona() {
		// TODO Auto-generated method stub
		return service.findAllPersona();
	}

	
	
	
	@GetMapping("/listar/{id}")
	@Override
	public Optional<Persona> findById(@PathVariable("id")Long id) {
		// TODO Auto-generated method stub
		return service.findById(id);
	}

	@GetMapping("/buscar/{nombre}")
	@Override
	public List<Persona> findByName(@PathVariable("nombre")String nombre) {
		// TODO Auto-generated method stub
		return service.findByName(nombre);
	}

	@PostMapping("/insertar")
	@Override
	public Persona savePersona(@RequestBody Persona personarNew) {
		// TODO Auto-generated method stub
		return service.savePersona(personarNew);
	}
	
	@PutMapping("/update/{id}")
	@Override
	public Persona updatePersona(@PathVariable("id")Long id, @RequestBody Persona personaNew) {
		// TODO Auto-generated method stub
		return service.updatePersona(id, personaNew);
	}
	
	@DeleteMapping("/delete")
	@Override
	public void deletePersonas() {
		// TODO Auto-generated method stub
		service.deletePersonas();
		
	}
	
	
	@DeleteMapping("/delete/{id}")
	@Override
	public String deletePersona(@PathVariable("id")Long id) {
		// TODO Auto-generated method stub
		return service.deletePersona(id);
	}

	

}
