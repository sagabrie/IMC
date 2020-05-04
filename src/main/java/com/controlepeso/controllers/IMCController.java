package com.controlepeso.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.controlepeso.models.IMC;
import com.controlepeso.repository.ImcRepository;


@Controller
public class IMCController {
	
	@Autowired
	private ImcRepository iR;
		
	// get porque retorna o formulário
	@RequestMapping(value="/cadastrarImc", method=RequestMethod.GET)
	public String form() {
		return "controle/formControle";		
	}
	
	
	// post pq quando aertamos o botão salvar ele informa a requicisão e manda para o banco de dados
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.POST)
	public String form(IMC imc) {
	 
	  iR.save(imc);
	  
	  return "redirect:/cadastrarImc";
	}
	
	

}
