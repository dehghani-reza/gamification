package com.gamification.core.controllers;

import com.gamification.core.RestAddress;
import com.gamification.core.entities.Person;
import com.gamification.core.mappers.person.PersonMapper;
import com.gamification.core.model.person.PersonDTO;
import com.gamification.core.services.BaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestAddress.PERSON)
public class PersonController extends BaseController<PersonDTO, Person, PersonMapper> {
    public PersonController(BaseService<Person> service) {
        super(service);
    }

    @Override
    protected Class<PersonMapper> getMapper() {
        return PersonMapper.class;
    }
}
