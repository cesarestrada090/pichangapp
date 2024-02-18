package com.confiedy.app.repository;

import com.confiedy.app.entities.PlayerRating;
import com.confiedy.app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRatingRepository extends JpaRepository<PlayerRating, Integer> {
}