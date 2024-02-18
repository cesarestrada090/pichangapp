package com.confiedy.app.repository;

import com.confiedy.app.entities.Team;
import com.confiedy.app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {
}