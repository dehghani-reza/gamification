package ir.dehghani.gamification.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;



@Table(name = "USERS")
@Entity
@Getter@Setter@NoArgsConstructor
public class User extends BaseEntity{

    private String username;
    private String password;
    private Boolean isActive;

    @ManyToOne
    @JoinColumn(name = "PERSON_ID",foreignKey = @ForeignKey(name = "FK_PERSON_USER"))
    private Person person;
}
