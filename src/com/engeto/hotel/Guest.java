package com.engeto.hotel;

import java.time.LocalDate;

public class Guest {
    private String name;
    private String surname;
    private LocalDate birthdate;

    public Guest(String name, String surname, LocalDate birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;

    }

    public String getDescription() {
        return name +" "+ surname + " (" + birthdate + ")";

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

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}

