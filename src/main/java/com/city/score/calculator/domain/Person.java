package com.city.score.calculator.domain;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int identity_number;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="salary")
    private int salary;

    @Column(name="mobile_no")
    private int mobilePhoneNumber;

    @Column(name="city")
    private String city;

    public Person() {
    }

    public Person(int identity_number) {
        this.identity_number = identity_number;
    }

    public Person(String city) {
        this.city = city;
    }

    public int getIdentity_number() {
        return identity_number;
    }

    public void setIdentity_number(int identity_number) {
        this.identity_number = identity_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(int mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
