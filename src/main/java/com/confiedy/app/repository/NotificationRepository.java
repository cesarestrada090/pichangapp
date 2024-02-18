package com.confiedy.app.repository;

import com.confiedy.app.entities.Notification;
import com.confiedy.app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}