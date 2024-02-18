package com.confiedy.app.repository;

import com.confiedy.app.entities.Invitation;
import com.confiedy.app.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Integer> {
}