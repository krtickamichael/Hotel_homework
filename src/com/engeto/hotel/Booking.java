package com.engeto.hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private String name;
    private String surname;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private boolean typeOfVacation;
    private Room roomNumber;
    private List<Room> otherRooms = new ArrayList<>();

    public Booking(String name, String surname, LocalDate checkIn, LocalDate checkOut,
                   boolean typeOfVacation, Room roomNumber, List<Room> otherRooms)
    {
        this.name = name;
        this.surname = surname;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.typeOfVacation = typeOfVacation;
        this.roomNumber = roomNumber;
        this.otherRooms = otherRooms;
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

    public Room getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Room roomNumber) {
        this.roomNumber = roomNumber;
    }

    public List<Room> getOtherRooms() {
        return otherRooms;
    }

    public void setOtherRooms(List<Room> otherRooms) {
        this.otherRooms = otherRooms;
    }
}
