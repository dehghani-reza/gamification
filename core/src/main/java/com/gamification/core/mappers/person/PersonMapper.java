package com.gamification.core.mappers.person;

import com.gamification.core.entities.Person;
import com.gamification.core.model.person.PersonDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel ="spring")
public interface PersonMapper {

    Person person2PersonDTO(PersonDTO dto);

    PersonDTO personDTO2Person(Person entity);
}
