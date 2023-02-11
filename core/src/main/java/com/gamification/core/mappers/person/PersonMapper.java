package com.gamification.core.mappers.person;

import com.gamification.core.entities.Person;
import com.gamification.core.model.person.PersonDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper extends BaseMapper<PersonDTO, Person> {
    @Override
    PersonDTO entity2Dto(Person entity);

    @Override
    Person dto2Entity(PersonDTO dto);
}
