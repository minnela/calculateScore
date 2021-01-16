package com.city.score.calculator.service;

import com.city.score.calculator.domain.Score;
import com.city.score.calculator.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreServiceImpl implements ScoreService{
    ScoreRepository scoreRepository;

    @Autowired
    public ScoreServiceImpl(ScoreRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }

    @Override
    public int getScoreByPersonIdentityNumber(int identityNumber) {
        Score score = scoreRepository.getById(identityNumber);
        return score.getScore();
    }
}
