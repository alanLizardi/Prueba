package cl.accenture.prueba.cl.accenture.prueba.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import cl.accenture.prueba.cl.accenture.prueba.modelo.Persona;

public interface PersonaRepository extends CrudRepository<Persona, String> {

	@Query(value = "select * from persona where id=:id", nativeQuery = true)
	Persona traePersonaPorID(@Param("id") String id);

	@Query(value = "select * from persona ", nativeQuery = true)
	List<Persona> traeTodoPersonas();

}
