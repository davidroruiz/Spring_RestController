package com.formacionspring.springboot.di.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.formacionspring.springboot.di.entity.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{

	@Query("select c from Persona c where c.nombre like %?1%")
	public List<Persona> findByName(String nombre);
	
}
