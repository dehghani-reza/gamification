package com.gamification.core.model.person;

import com.gamification.core.model.BaseDTO;
import lombok.Value;

@Value
public class PersonDTO extends BaseDTO {

    private String firstName;
    private String lastName;
}
