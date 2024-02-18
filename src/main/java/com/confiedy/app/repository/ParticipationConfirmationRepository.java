package com.confiedy.app.repository;

import com.confiedy.app.entities.Notification;
import com.confiedy.app.entities.ParticipationConfirmation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipationConfirmationRepository extends JpaRepository<ParticipationConfirmation, Integer> {
}