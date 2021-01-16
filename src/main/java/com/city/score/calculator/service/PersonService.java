package com.city.score.calculator.service;

import com.city.score.calculator.domain.Person;

public interface PersonService {
    double calculateScore(int personScore ,int salaryMultiplier , int cityScore);
    int sendSmsToUser(Person person);

}
