package com.prode.torneoApuestas;

import lombok.Getter;
import lombok.Setter;

public class Ronda {
	
	private @Setter @Getter int id; 
	private  Partido[] partidos;
	
	public int puntos() {
		return partidos.length;
		
		

}

	public Ronda(int id, Partido[] partidos) {
		super();
		this.id = id;
		this.partidos = partidos;
	}
}