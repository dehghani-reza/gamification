package com.gamification.core.model.person;

import com.gamification.core.entities.Person;
import com.gamification.core.model.Dto2Entity;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper extends Dto2Entity<PersonDTO, Person> {
    @Override
    public Person convert(PersonDTO dto) {
        return new Person(
                dto.getFirstName(),
                dto.getLastName()
        );
    }
}
