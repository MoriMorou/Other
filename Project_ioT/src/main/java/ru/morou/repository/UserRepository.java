package ru.morou.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.morou.model.Users;

public interface UserRepository extends MongoRepository<Users, String> {
}
