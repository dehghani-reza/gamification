package com.smartagilify.core.repositories;

import com.smartagilify.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User getUserById(Long id);

    User getUserByUsername(String username);
}
