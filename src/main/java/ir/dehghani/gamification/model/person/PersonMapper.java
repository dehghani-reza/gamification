package ir.dehghani.gamification.model.person;

import ir.dehghani.gamification.entities.Person;
import ir.dehghani.gamification.model.Dto2Entity;
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
