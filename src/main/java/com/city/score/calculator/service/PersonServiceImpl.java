package com.city.score.calculator.service;

import com.city.score.calculator.domain.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public double calculateScore(int personScore, int salaryMultiplier, int cityScore) {
        double score = personScore*salaryMultiplier+cityScore;
        return score;
    }
    @Override
    public int sendSmsToUser(Person person) {
        int mobileNumber = person.getMobilePhoneNumber();
        return mobileNumber;
    }
}
