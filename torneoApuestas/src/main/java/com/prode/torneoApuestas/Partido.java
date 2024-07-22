package com.prode.torneoApuestas;

import lombok.Getter;
import lombok.Setter;

public class Partido {

	private @Setter @Getter int id; 
	private @Setter @Getter Equipo equipo1;
	private @Setter @Getter Equipo equipo2;
	private @Setter @Getter int  golesEquipo1;
	private @Setter @Getter int  golesEquipo2;
	private @Setter @Getter resultadoEnum resultado;
	
	public Partido(int id, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2,
			resultadoEnum resultado) {
		super();
		this.id = id;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
		this.resultado = resultado;
	}
	
	
}
