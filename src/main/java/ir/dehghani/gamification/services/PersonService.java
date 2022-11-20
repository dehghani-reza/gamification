package ir.dehghani.gamification.services;

import ir.dehghani.gamification.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends BaseService<Person>{

    protected PersonService(JpaRepository<Person, Long> jpaRepository) {
        super(jpaRepository);
    }

}
