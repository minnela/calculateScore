package com.city.score.calculator.repository;

import com.city.score.calculator.domain.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Integer> {
    Score getById(int id);
}
