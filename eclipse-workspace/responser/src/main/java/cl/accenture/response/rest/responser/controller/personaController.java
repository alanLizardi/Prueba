package cl.accenture.response.rest.responser.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cl.accenture.response.rest.responser.model.PersonaDto;

@RestController
@RequestMapping("/responser") // Contexto, path
public class personaController {

	@RequestMapping(value = "/traePersona{nombre}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public PersonaDto traePersona() {
		PersonaDto p = new PersonaDto();
		p.setEdad(14);
		p.setNombre("Ilich");
		p.setOficio("Perra");
		return p;
	}
}
