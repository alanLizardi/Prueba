package cl.accenture.prueba.cl.accenture.prueba.persona.dto;

import java.util.List;

import cl.accenture.prueba.cl.accenture.prueba.modelo.Persona;

public class PersonasConContadorDto {

	private List<Persona> personas;

	private int numeroPersonas;

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public int getNumeroPersonas() {
		return numeroPersonas;
	}

	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}

}
