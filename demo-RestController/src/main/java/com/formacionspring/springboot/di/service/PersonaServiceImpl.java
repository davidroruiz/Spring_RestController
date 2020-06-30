package com.formacionspring.springboot.di.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionspring.springboot.di.entity.Persona;
import com.formacionspring.springboot.di.entity.Producto;
import com.formacionspring.springboot.di.repository.IPersonaRepository;
import com.formacionspring.springboot.di.repository.IProductoRepository;

@Service
public class PersonaServiceImpl implements IPersonaService {

	
	@Autowired
	 IPersonaRepository repoPersona;
	
	@Autowired
	IProductoRepository repoProducto;
	
	@Transactional(readOnly = true)
	@Override
	public List<Persona> findAllPersona() {
		// TODO Auto-generated method stub
		return repoPersona.findAll();
	}
	@Transactional(readOnly = true)
	public List<Producto> findAllProducto() {
		// TODO Auto-generated method stub
		return repoProducto.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Persona> findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Persona> persona = repoPersona.findById(id);
		return persona;
	}

	@Transactional
	@Override
	public List<Persona> findByName(String nombre) {
		// TODO Auto-generated method stub
		return repoPersona.findByName("%" + nombre + "%");
	}
	
	
	@Transactional

	public List<Producto> findByNameProducto(String nombre) {
		// TODO Auto-generated method stub
		return repoProducto.findByName("%" + nombre + "%");
	}

	@Transactional
	@Override
	public Persona savePersona(Persona personaNew) {
		// TODO Auto-generated method stub
		return repoPersona.save(personaNew);
	}
	
	@Transactional
	@Override
	public Persona updatePersona(Long id,Persona personaNew) {
		// TODO Auto-generated method stub
		//id=personaNew.getId();
		
			Persona persona2=repoPersona.findById(id).get();
			persona2.setNombre(personaNew.getNombre());
			persona2.setApellido(personaNew.getApellido());
			//persona2.setProducto(personaNew.getProducto());
			return repoPersona.save(persona2);
	}
	
	@Transactional
	@Override
	public String deletePersona(Long id) {
		// TODO Auto-generated method stub
		
		if(repoPersona.findById(id).isPresent()) {
			repoPersona.deleteById(id);
			return "Persona eliminado correctamente.";
		}
		
		return "No existe la persona";
	}

	@Transactional
	@Override
	public void deletePersonas() {
		// TODO Auto-generated method stub
		repoPersona.deleteAll();
	}


	


}
