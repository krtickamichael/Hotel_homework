package com.engeto.hotel;

public class Room {
    private int roomNumber;
    private int bed;
    private boolean balcony;
    private boolean seaview;
    private int pricePerNight;

    public Room(int roomNumber, int bed, boolean balcony, boolean seaview, int pricePerNight) {
        this.roomNumber = roomNumber;
        this.bed = bed;
        this.balcony = balcony;
        this.seaview = seaview;
        this.pricePerNight = pricePerNight;
    }

    public String getDescription(){
        return "Description: " + "Room number:" + roomNumber + " Number of beds:" + bed +
                " balcony:" + balcony + " Sea views:" + seaview + " Price per night:" + pricePerNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSeaview() {
        return seaview;
    }

    public void setSeaview(boolean seaview) {
        this.seaview = seaview;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
}