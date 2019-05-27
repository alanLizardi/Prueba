package cl.accenture.prueba.cl.accenture.prueba.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import cl.accenture.prueba.cl.accenture.prueba.util.Programa;

@Entity
@Table(name = "persona")
public class Persona implements Programa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private String id;

	@Column(name = "nombre")
	private String Nombre;

	@Column(name = "rut")
	private String Rut;

	@Column(name = "apellido")
	private String Apellido;

	@Column(name = "nivel")
	private String level;

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getRut() {
		return Rut;
	}

	public void setRut(String rut) {
		Rut = rut;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	@Override
	public void analizar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void programar() {
		// TODO Auto-generated method stub

	}

	public static String saluda() {
		String saludo = "Hola";
		return saludo;
	}
}