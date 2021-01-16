package com.city.score.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public double calculateScore(int personScore, int salaryMultiplier, int cityScore) {
        double score = personScore*salaryMultiplier+cityScore;
        return score;
    }
}
