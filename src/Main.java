import com.engeto.hotel.Booking;
import com.engeto.hotel.Guest;
import com.engeto.hotel.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
 public static void main(String[] args) {

  Guest guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
  Guest guest2 = new Guest("Jana", "Dvořáčková", LocalDate.of(1995, 5, 5));

  Room room1 = new Room(1, 1, true, true,  1000);
  Room room2 = new Room(2, 1, true, true,  1000);
  Room room3 = new Room(3, 3, false, true,  2400);

  System.out.println(" ");
  System.out.println(guest1.getDescription());
  System.out.println(guest2.getDescription());
  System.out.println(" ");
  System.out.println(room1.getDescription());
  System.out.println(room2.getDescription());
  System.out.println(room3.getDescription());

  Booking booking1 = new Booking(guest1.getName(), guest1.getSurname(),
          LocalDate.of(2021,7,19),
          LocalDate.of(2021, 7, 26), true,room1);

  List<Booking> BookingList = new ArrayList<>();
  BookingList.add(booking1);

  BookingList.add(new Booking(guest1.getName()+" and "+guest2.getName(),
          guest1.getSurname()+" and "+guest2.getSurname(),
          LocalDate.of(2024,9,1),
          LocalDate.of(2024, 9, 14),
          true, room3));


  System.out.println(" ");
  System.out.println("The number of reservations in the system: "+BookingList.size());
  System.out.println(" ");
  System.out.println("List of all reservations:");
  for (Booking booking : BookingList) {
   System.out.println(booking.getDescription());
  }

 }
}