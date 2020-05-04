package com.controlepeso.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

public class Peso {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int Id;
	@NotEmpty
	private int Peso;
	@NotEmpty
	private String data;
	
	
	public int getPeso() {
		return Peso;
	}
	public void setPeso(int peso) {
		Peso = peso;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
}
