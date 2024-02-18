package com.confiedy.app.repository;

import com.confiedy.app.entities.Championship;
import com.confiedy.app.entities.ChampionshipInvitation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChampionshipInvitationRepository extends JpaRepository<ChampionshipInvitation, Integer> {
}