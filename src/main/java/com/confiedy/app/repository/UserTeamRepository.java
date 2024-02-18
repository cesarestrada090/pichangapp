package com.confiedy.app.repository;

import com.confiedy.app.entities.User;
import com.confiedy.app.entities.UserTeam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTeamRepository extends JpaRepository<UserTeam, Integer> {
}