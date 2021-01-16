package com.city.score.calculator.service;

import com.city.score.calculator.domain.City;
import com.city.score.calculator.domain.Score;
import com.city.score.calculator.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService{
    CityRepository cityRepository;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }
    @Override
    public int getScoreByPlaque(int plaqueno) throws ClassNotFoundException {
        try{
            City city = cityRepository.getCityByPlaque(plaqueno);
            return city.getScore();
        }catch(Exception e) {
            throw new ClassNotFoundException("City is not selected");
        }

    }
}
