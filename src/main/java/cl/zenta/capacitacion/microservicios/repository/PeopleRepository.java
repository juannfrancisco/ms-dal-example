package cl.zenta.capacitacion.microservicios.repository;

import cl.zenta.capacitacion.microservicios.entities.People;
import org.springframework.data.repository.CrudRepository;

public interface PeopleRepository extends CrudRepository<People, String> {
}
