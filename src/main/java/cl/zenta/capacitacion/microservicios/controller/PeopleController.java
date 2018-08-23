package cl.zenta.capacitacion.microservicios.controller;

import cl.zenta.capacitacion.microservicios.entities.People;
import cl.zenta.capacitacion.microservicios.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PeopleController {

    @Autowired
    private PeopleRepository repository;


    @RequestMapping(method = RequestMethod.POST , value="/people/")
    public void save( @RequestBody People person){
        repository.save(person);
    }


    @RequestMapping(method = RequestMethod.GET , value="/people/")
    public Iterable<People> findAll(){
        return repository.findAll();
    }

}
