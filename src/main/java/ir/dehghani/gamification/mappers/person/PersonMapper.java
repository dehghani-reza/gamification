package ir.dehghani.gamification.mappers.person;

import ir.dehghani.gamification.entities.Person;
import ir.dehghani.gamification.model.person.PersonDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel ="spring")
public interface PersonMapper {

    Person person2PersonDTO(PersonDTO dto);

    PersonDTO personDTO2Person(Person entity);
}
