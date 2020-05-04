package com.controlepeso.repository;

import org.springframework.data.repository.CrudRepository;

import com.controlepeso.models.IMC;



public interface ImcRepository extends CrudRepository<IMC, String>{
	
	IMC findByEvento(int id);
}
