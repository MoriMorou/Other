package ru.morou.koreshop.persist.repo;

import ru.morou.koreshop.persist.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    
    User findByUserName(String userName);
}
