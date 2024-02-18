package com.confiedy.app.repository;

import com.confiedy.app.entities.Championship;
import com.confiedy.app.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChampionshipRepository extends JpaRepository<Championship, Integer> {
}