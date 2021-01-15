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
    private int name;

    public City() {
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

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}
