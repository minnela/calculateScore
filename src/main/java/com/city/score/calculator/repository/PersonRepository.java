package com.city.score.calculator.repository;

import com.city.score.calculator.domain.City;
import com.city.score.calculator.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
