package com.prode.torneoApuestas;



import lombok.Getter;
import lombok.Setter;

public class Pronostico {

	private @Getter @Setter Partido partido;
	public Pronostico(Partido partido, Equipo equipo, resultadoEnum resultado, Participante participante) {
		super();
		this.partido = partido;
		this.equipo = equipo;
		this.resultado = resultado;
		this.participante = participante;
	}

	private @Getter @Setter Equipo equipo;
	private @Getter @Setter resultadoEnum resultado;
	private @Getter @Setter Participante participante;
	
	public int puntos() {
		if(partido.resultado(equipo)==resultado) {
			return 1;
		}
		return 0;
	}
}
