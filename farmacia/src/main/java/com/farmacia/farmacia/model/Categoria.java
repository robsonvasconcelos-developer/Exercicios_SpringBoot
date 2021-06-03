package com.farmacia.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name = "categoria")
public class Categoria {
	
	// Atributos da Tabela 1
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY ) 
	private long id; 
	
	
	@NotNull
	@Size(min = 1, max = 255)
	private String remedio; 

	@NotNull
	@Size(min = 1, max = 255) 
	private String perfumaria;
	
	
	
	// Getters and Setters
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRemedio() {
		return remedio;
	}

	public void setRemedio(String remedio) {
		this.remedio = remedio;
	}

	public String getPerfumaria() {
		return perfumaria;
	}

	public void setPerfumaria(String perfumaria) {
		this.perfumaria = perfumaria;
	}
	
	
	
	
	
	

}