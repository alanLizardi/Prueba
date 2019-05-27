package cl.accenture.prueba.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cl.accenture.prueba.cl.accenture.prueba.controlador.PersonaController;
import cl.accenture.prueba.cl.accenture.prueba.modelo.Persona;

class PersonaControllerTest {

	// @Autowired//Esta anotación permite acceder a los metodos publicos de la clase
	// sin necesidad de instanciarlos.
	

	@Test
	public void sumaControllerTest() {
		PersonaController pController = new PersonaController();
		int resultadoEsperado;
		resultadoEsperado = pController.sumaPersonas(1, 3);
		assertEquals(4, resultadoEsperado, "Resultado NOK");
	}
	@Test
	public void traePersonaTest() {
		PersonaController pController = new PersonaController();
		Persona ResultadoEsperado;
		ResultadoEsperado = pController.traePersona("Alan");
		assertEquals("Nombre Incorrecto", ResultadoEsperado.getNombre(), "Alan");
	}
}
