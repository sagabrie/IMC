package com.controlepeso.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.controlepeso.models.IMC;
import com.controlepeso.repository.ImcRepository;

@Controller
@RestController
@RequestMapping("imc")
public class IMCController {
	
	@Autowired
	private ImcRepository iR;

	@GetMapping("/cadastrar")
	public String form() {
		return "controle/formControle";		
	}
	
	@PostMapping("/cadastrar/evento")
	public String form(@RequestBody IMC imc) {
	  iR.save(imc);
	  return "redirect:/cadastrarImc";
	}
}
