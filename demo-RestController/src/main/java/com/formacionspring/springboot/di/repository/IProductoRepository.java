package com.formacionspring.springboot.di.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.formacionspring.springboot.di.entity.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Long>{

	@Query("select c from Producto c where c.nombre like %?1%")
	public List<Producto> findByName(String nombre);


}
