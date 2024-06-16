import com.engeto.hotel.Booking;
import com.engeto.hotel.Guest;
import com.engeto.hotel.Room;
import com.engeto.hotel.BookingManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

  Guest guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
  Guest guest2 = new Guest("Jana", "Dvořáčková", LocalDate.of(1995, 5, 5));
  Guest guest3 = new Guest("Karel", "Dvořák", LocalDate.of(1990, 5, 15));
  Guest guest4 = new Guest("Karel", "Dvořák", LocalDate.of(1979, 1, 3));
  Guest guest5 = new Guest("Karolína", "Tmavá", LocalDate.of(1980, 6, 20));

  Room room1 = new Room(1, 1, true, true, 1000);
  Room room2 = new Room(2, 1, true, true, 1000);
  Room room3 = new Room(3, 3, false, true, 2400);



    System.out.println(" ");
    System.out.println(guest1.getDescription());
    System.out.println(guest2.getDescription());
    System.out.println(guest3.getDescription());
    System.out.println(guest4.getDescription());
    System.out.println(guest5.getDescription());
    System.out.println(" ");
    System.out.println(room1.getDescription());
    System.out.println(room2.getDescription());
    System.out.println(room3.getDescription());

  Booking booking1 = new Booking(
          LocalDate.of(2021, 7, 19),
          LocalDate.of(2021, 7, 26),
          true, room1, guest1,1);

  List<Booking> bookingList = new ArrayList<>();
  bookingList.add(booking1);

  bookingList.add(new Booking(
          LocalDate.of(2024, 9, 1),
          LocalDate.of(2024, 9, 14),
          true, room3, guest1,2));

     fillBookings(bookingList, room3, guest3, room2, guest4, guest5);



 }

    private static void fillBookings(List<Booking> bookingList, Room room3, Guest guest3, Room room2, Guest guest4, Guest guest5) {
        BookingManager myBookingList = new BookingManager(bookingList);
        myBookingList.addBooking(new Booking(LocalDate.of(2023, 6, 1),
                                             LocalDate.of(2023, 6, 7),
                                             false, room3, guest3,1));

        myBookingList.addBooking(new Booking(LocalDate.of(2023,7,18),
                                             LocalDate.of(2023,7,21),
                                             true, room2, guest4,1));

        for (int i = 0; i < 10; i++) {
         int CheckInDate = (i * 2 + 1);
         int CheckoutDate = (i * 2 + 2);
         myBookingList.addBooking(new Booking (LocalDate.of(2023, 8, CheckInDate),
                                   LocalDate.of(2023, 8, CheckoutDate),
                                   false, room2, guest5,1));
        }
        myBookingList.addBooking(new Booking(LocalDate.of(2023, 8, 1),
                                             LocalDate.of(2023, 8, 31),
                                             false, room3, guest5,1));

        System.out.println(" ");
        System.out.println("The number of reservations in the system: " + myBookingList.getBookingManagerList().size());
        System.out.println(" ");
        System.out.println("List of all reservations:");

        for (Booking booking : myBookingList.getBookingManagerList()) {
         System.out.println(booking.getDescription());
        }
        System.out.println(" ");
        System.out.println("Index 2: "+myBookingList.getBookingIndex(4).getDescription());
        System.out.println(" ");
        System.out.println("Number of working stays:: "+myBookingList.getNumberOfWorkingBookings());
        System.out.println(" ");
        System.out.println("Number of people: "+myBookingList.getNumberOfGuests());
        System.out.println(" ");
        System.out.println("Number of reservation: "+myBookingList.getBookingManagerList().size());
        System.out.println(" ");
        System.out.println("Average guest: "+myBookingList.getAverageGuests());
        System.out.println("third lesson:");
        reservationDescription(myBookingList);
        System.out.println("First Eight:");
        firstEight(myBookingList);
        System.out.println(" ");
        printGuestStatistics(myBookingList);
        System.out.println("Booking Length:");
        bookingLength(myBookingList);
        System.out.println("Booking Price:");
        getPrice(myBookingList);
    }

    private static void reservationDescription(BookingManager myBookingList) {
        for (Booking booking : myBookingList.getBookingManagerList()) {
            System.out.println(booking.getDescription2());
        }
    }

    private static void firstEight(BookingManager myBookingList){
        int printedCount = 0;
        int count = 8;
        for (Booking booking : myBookingList.getBookingManagerList()){
            if (booking.isTypeOfVacation()){
                System.out.println(booking.getDescription2());
                printedCount++;
                if (printedCount >= count){
                    break;
                }
            }

        }

        }

    private static void printGuestStatistics(BookingManager myBookingList){
        int bookingWithOneGuest = 0;
        int bookingWithTwoGuest = 0;
        int bookingWithMoreGuest = 0;
        for (Booking booking : myBookingList.getBookingManagerList()) {
            if (booking.getNumberOfGuest() == 1){
                bookingWithOneGuest++;
            }
            if (booking.getNumberOfGuest() == 2){
                bookingWithTwoGuest++;
            }
            if (booking.getNumberOfGuest() > 2){
                bookingWithMoreGuest++;
            }
        }
        System.out.println("The number of reservations with one guest is: "+bookingWithOneGuest);
        System.out.println("The number of reservations with two guest is: "+bookingWithTwoGuest);
        System.out.println("The number of reservations with more than two guest is: "+bookingWithMoreGuest);
    }

    private static void bookingLength(BookingManager myBookingList){
        for (Booking booking : myBookingList.getBookingManagerList()) {
            System.out.println(booking.getBookingLength());
        }
    }

    private static void getPrice(BookingManager myBookingList){
        for (Booking booking : myBookingList.getBookingManagerList()) {
            System.out.println(booking.getPrice()+" Kč");
        }
    }
    }

