import com.engeto.hotel.Booking;
import com.engeto.hotel.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

     String name = "Adéla";
     String surname = "Malíková";
     String name2 = "Jana";
     String surname2 = "Dvořáčková";
     LocalDate date = LocalDate.now();
     LocalDate date2 = LocalDate.now();
     date = LocalDate.of(1993, 3, 13);
     date2 = LocalDate.of(1995, 5, 5);

     System.out.println(" ");
     System.out.println(name +" "+ surname +" ("+date+")." );
     System.out.println(name2 +" "+ surname2 +" ("+date2+")." );

     Room room1 = new Room(1, 1, true, true,  1000);
     Room room2 = new Room(2, 1, true, true,  1000);
     Room room3 = new Room(3, 3, false, true,  2400);

     System.out.println(" ");
     System.out.println(room1.getDescription());
     System.out.println(room2.getDescription());
     System.out.println(room3.getDescription());

     Booking booking1 = new Booking("Adéla", "Malíková",
             LocalDate.of(2024,7,19),
             LocalDate.of(2024, 7, 26), true,
             1);

     List<Booking> BookingList = new ArrayList<>();
     BookingList.add(booking1);
     BookingList.add(new Booking("Adéla,"+"Jana", "Malíková,"+"Dvořáčková",
             LocalDate.of(2024,9,1),
             LocalDate.of(2024, 9, 14), true,
             3));
     BookingList.add(new Booking("Pavel", "Novák",
             LocalDate.of(2024,12,5),
             LocalDate.of(2024, 12, 10), true,
             3));


     System.out.println(" ");
     System.out.println("The number of reservations in the system: "+BookingList.size());
     System.out.println(" ");
     System.out.println("List of all reservations:");
     for (Booking booking : BookingList) {
      System.out.println(booking.getDescription());
     }

    }
}