package com.controlepeso.repository;

import org.springframework.data.repository.CrudRepository;

import com.controlepeso.models.IMC;
import org.springframework.stereotype.Repository;

@Repository
public interface ImcRepository extends CrudRepository<IMC, String>{
	IMC findById(int id);
}
