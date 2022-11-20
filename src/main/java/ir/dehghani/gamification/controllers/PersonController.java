package ir.dehghani.gamification.controllers;

import ir.dehghani.gamification.model.Dto2Entity;
import ir.dehghani.gamification.entities.Person;
import ir.dehghani.gamification.model.person.PersonDTO;
import ir.dehghani.gamification.services.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController extends BaseController<PersonDTO, Person>{

    public PersonController(BaseService<Person> service, Dto2Entity<PersonDTO, Person> mapper) {
        super(service, mapper);
    }
}
