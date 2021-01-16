package com.city.score.calculator.controller;


import com.city.score.calculator.domain.City;
import com.city.score.calculator.domain.Person;
import com.city.score.calculator.service.CityService;
import com.city.score.calculator.service.PersonService;
import com.city.score.calculator.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
        return new ModelAndView("calculateScore", "person", new Person());
    }

    @RequestMapping(value = "/calculateScore", method = RequestMethod.POST)
    public String handleItemAssign(@ModelAttribute("person") Person person, BindingResult result) {
        if (result.hasErrors()) {
            return "error";
        }
        int personScore = scoreService.getScoreByPersonIdentityNumber(person.getIdentity_number());
        String city = person.getCity();
        int plaqueNo=Integer.parseInt(city);
        int cityScore = cityService.getScoreByPlaque(plaqueNo);
        double lastScore = personService.calculateScore(personScore,person.getSalary(),cityScore);
        person.setScore(lastScore);
        return "personInformation";
    }


}
