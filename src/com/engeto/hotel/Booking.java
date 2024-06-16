package com.engeto.hotel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Booking {
    private LocalDate checkIn;
    private LocalDate checkOut;
    private boolean typeOfVacation;
    private Room room;
    private Guest guest;
    private int numberOfGuest;

    public Booking(LocalDate checkIn, LocalDate checkOut,
                   boolean typeOfVacation,Room room,Guest guest,int numberOfGuest)

    {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.typeOfVacation = typeOfVacation;
        this.room = room;
        this.guest = guest;
        this.numberOfGuest = numberOfGuest;
    }


    public String getDescription() {
        return "Name:"+guest.getName()+" Surname:"+guest.getSurname()+ " CheckIn:"+checkIn+
                " CheckOut:"+checkOut+ " Room number:"+room.getRoomNumber();
    }

    public String getDescription2() {
        return checkIn+ " až "+checkOut+ ": " +guest.getName()+" "+guest.getSurname()+
                " (" +guest.getBirthdate()+ ")" + "[" +numberOfGuest+","+room.isSeaview()+
                "] "+ "za "+room.getPricePerNight()+" Kč";
    }

    public long getBookingLength(){
        LocalDate start = getCheckIn();
        LocalDate end = getCheckOut();
        long daysBetween = ChronoUnit.DAYS.between(start,end);
        return daysBetween;
    }

    public long getPrice(){
        long price = getBookingLength()*room.getPricePerNight();
        return price;
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

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public int getNumberOfGuest() {
        return numberOfGuest;
    }

    public void setNumberOfGuest(int numberOfGuest) {
        this.numberOfGuest = numberOfGuest;
    }

}
