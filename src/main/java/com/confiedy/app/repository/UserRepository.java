package com.confiedy.app.repository;

import com.confiedy.app.entities.User;
import com.confiedy.app.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
}