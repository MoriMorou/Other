package ru.morou.koreshop.persist.repo;


import ru.morou.koreshop.persist.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role, Long> {

    
    Role findByName(String name);
}
