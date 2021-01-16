package com.city.score.calculator.controller;


import com.city.score.calculator.domain.City;
import com.city.score.calculator.domain.Person;
import com.city.score.calculator.service.CityService;
import com.city.score.calculator.service.PersonService;
import com.city.score.calculator.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PersonController {
    CityService cityService;
    PersonService personService;
    ScoreService scoreService;

    @Autowired
    public PersonController(CityService cityService, PersonService personService, ScoreService scoreService) {
        this.cityService = cityService;
        this.personService = personService;
        this.scoreService = scoreService;
    }

    @RequestMapping("/calculateScore")
    public ModelAndView getCalculateScorePage(){
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("cities" ,cityService.findAll());
        model.put("person", new Person());
        return new ModelAndView("calculateScore", model);
    }

    @RequestMapping(value = "/calculateScore", method = RequestMethod.POST)
    public void handleItemAssign(@ModelAttribute("person") Person person, @ModelAttribute("cities")City city) {
        int score = scoreService.getScoreByPersonIdentityNumber(person.getIdentity_number());
        int salary = person.getSalary();
        int a =0;

    }





}
