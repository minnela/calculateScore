package com.city.score.calculator.domain;

import javax.persistence.*;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="score")
    private int score;

    @Column(name="plaqueno")
    private int plaqueno;

    @Column(name="name")
    private String name;

    public City() {
    }

    public City(int plaqueno) {
        this.plaqueno = plaqueno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPlaqueno() {
        return plaqueno;
    }

    public void setPlaqueno(int plaqueno) {
        this.plaqueno = plaqueno;
    }

    public String getCityName() {
        return name;
    }

    public void setCityName(String name) {
        this.name = name;
    }
}
