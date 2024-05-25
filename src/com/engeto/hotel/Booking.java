package com.engeto.hotel;

import java.time.LocalDate;

public class Booking {
    private String name;
    private String surname;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private boolean typeOfVacation;
    private Room room;

    public Booking(String name, String surname, LocalDate checkIn,
                   LocalDate checkOut, boolean typeOfVacation,Room room)

    {
        this.name = name;
        this.surname = surname;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.typeOfVacation = typeOfVacation;
        this.room = room;


    }

    public String getDescription() {
        return "Name:"+name+ " Surname:"+surname+ " CheckIn:"+checkIn+
                " CheckOut:"+checkOut+ " Room number:"+room.getBed();

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

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public boolean isTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(boolean typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }
}
