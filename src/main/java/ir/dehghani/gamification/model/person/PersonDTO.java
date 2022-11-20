package ir.dehghani.gamification.model.person;

import ir.dehghani.gamification.model.BaseDTO;
import lombok.Value;

@Value
public class PersonDTO extends BaseDTO {

    private String firstName;
    private String lastName;
}
