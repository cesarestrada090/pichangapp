package com.confiedy.app.repository;

import com.confiedy.app.entities.Invitation;
import com.confiedy.app.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvitationRepository extends JpaRepository<Invitation, Integer> {
}