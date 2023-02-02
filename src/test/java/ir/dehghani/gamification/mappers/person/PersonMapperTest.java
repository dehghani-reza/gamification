package ir.dehghani.gamification.mappers.person;

import ir.dehghani.gamification.entities.Person;
import ir.dehghani.gamification.model.person.PersonDTO;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

class PersonMapperTest {

    PersonMapper mapper = Mappers.getMapper(PersonMapper.class);

    @Test
    public void givenPersonToPersonDTO_whenMaps_thenCorrect() {
        Person person = new Person("amir", "fathi");
        PersonDTO personDTO = mapper.personDTO2Person(person);
        assertEquals(person.getFirstName(), personDTO.getFirstName());
        assertEquals(person.getLastName(), personDTO.getLastName());

    }

    @Test
    public void givenPersonDTOToPerson_whenMaps_thenCorrect() {
        PersonDTO personDTO = new PersonDTO("amir", "fathi");
        Person person = mapper.person2PersonDTO(personDTO);
        assertEquals(personDTO.getFirstName(), person.getFirstName());
        assertEquals(personDTO.getLastName(), person.getLastName());

    }

}