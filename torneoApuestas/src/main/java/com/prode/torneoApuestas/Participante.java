package com.prode.torneoApuestas;



import lombok.Getter;
import lombok.Setter;

public class Participante {

	@Getter @Setter String nombre;
	String pronosticos;
	
	public Participante(String nombre, String filePath) {
		super();
		this.nombre = nombre;
		this.pronosticos = filePath;
	}
	
	
}
