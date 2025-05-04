package edu.kuzenko.security25.user;

/*
    @author yaroslavkuzenko
    @project security25
    @class UserRepository
    @since 04.05.2025 - 22.49
*/

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByEmail(String email);
}