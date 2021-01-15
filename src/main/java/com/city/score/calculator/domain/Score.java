package com.city.score.calculator.domain;

import javax.persistence.*;

@Entity
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="score")
    private int score;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "identity_number")
    private Person person;

    public Score() {
    }

    public Score(int score, Person person) {
        this.score = score;
        this.person = person;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
