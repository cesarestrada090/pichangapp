package com.confiedy.app.repository;

import com.confiedy.app.entities.Match;
import com.confiedy.app.entities.MatchComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchCommentRepository extends JpaRepository<MatchComment, Integer> {
}