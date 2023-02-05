package com.gamification.core.controllers;

import com.gamification.core.entities.Person;
import com.gamification.core.model.Dto2Entity;
import com.gamification.core.model.person.PersonDTO;
import com.gamification.core.services.BaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController extends BaseController<PersonDTO, Person> {

    public PersonController(BaseService<Person> service, Dto2Entity<PersonDTO, Person> mapper) {
        super(service, mapper);
    }

}
