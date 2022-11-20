package ir.dehghani.gamification.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Getter@Setter@NoArgsConstructor
public class Person extends BaseEntity{

    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "person")
    private Set<User> user;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
