package com.city.score.calculator.domain;

import javax.persistence.*;

@Entity
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="score")
    private int score;

    public Score() {
    }

    public Score(int score, Person person) {
        this.score = score;
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

}
