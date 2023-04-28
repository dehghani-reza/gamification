package com.smartagilify.core.person;

import com.smartagilify.core.entities.Person;
import com.smartagilify.core.mappers.person.PersonMapper;
import com.smartagilify.core.model.person.PersonDTO;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonMapperTest {

    PersonMapper mapper = Mappers.getMapper(PersonMapper.class);

    @Test
    public void givenPersonToPersonDTO_whenMaps_thenCorrect() {
        Person person = new Person("amir", "fathi");
        PersonDTO personDTO = mapper.entity2Dto(person);
        assertEquals(person.getFirstName(), personDTO.getFirstName());
        assertEquals(person.getLastName(), personDTO.getLastName());

    }

    @Test
    public void givenPersonDTOToPerson_whenMaps_thenCorrect() {
        PersonDTO personDTO = new PersonDTO("amir", "fathi");
        Person person = mapper.dto2Entity(personDTO);
        assertEquals(personDTO.getFirstName(), person.getFirstName());
        assertEquals(personDTO.getLastName(), person.getLastName());

    }

}