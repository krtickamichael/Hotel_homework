package com.engeto.hotel;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Booking> bookingManagerList = new ArrayList<>();

    public BookingManager(List<Booking> newBookingList) {
        this.bookingManagerList.addAll(newBookingList);
    }

    public void addBooking(Booking booking) {
        bookingManagerList.add(booking);
    }

    public List<Booking> getBookingManagerList() {
        return new ArrayList<>(bookingManagerList);
    }

    public void clearBooking(Booking booking) {
        bookingManagerList.clear();
    }

    public Booking getBookingIndex(int index) {
        if (index >= 0 && index < bookingManagerList.size()) {
            return bookingManagerList.get(index);
        } else {
            return null;
        }
    }

    public int getNumberOfWorkingBookings() {
        int count = 0;
        for (Booking booking : bookingManagerList) {
            if (booking.isTypeOfVacation()) {
                count++;
            }
        }
        return count;
    }

    public int getNumberOfGuests() {
        int people = 0;
        for (Booking booking : bookingManagerList) {
            if (booking.getNumberOfGuest() == 0) {
                people++;
            } else {
                people += booking.getNumberOfGuest();
            }
        }
        return people;
    }

    public float getAverageGuests(){
       float AverageGuests = 0;
       AverageGuests = (float) getNumberOfGuests() /getBookingManagerList().size();
       return AverageGuests;
    }
}
