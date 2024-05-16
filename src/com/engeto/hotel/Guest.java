package com.engeto.hotel;

import java.time.LocalDate;

public class Guest {
    private String name;
    private String surname;
    private LocalDate date = LocalDate.now();

    public Guest(String name, String surname, LocalDate date) {
        this.name = name;
        this.surname = surname;
        this.date = LocalDate.now();

    }

    public String getDescription() {
        return name +" "+ surname + " (" +date+ ")";

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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}

