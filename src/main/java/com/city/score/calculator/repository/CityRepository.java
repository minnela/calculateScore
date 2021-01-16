package com.city.score.calculator.repository;

import com.city.score.calculator.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
    @Transactional
    @Query("select c from City c where c.plaqueno = :plaqueno")
    City getCityByPlaque(@Param("plaqueno") int plaqueno);
}
