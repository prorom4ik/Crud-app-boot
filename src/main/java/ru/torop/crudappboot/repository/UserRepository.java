package ru.torop.crudappboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.torop.crudappboot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
