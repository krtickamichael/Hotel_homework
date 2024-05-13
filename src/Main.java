import com.engeto.hotel.Room;

import java.time.LocalDate;

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

     System.out.println(name +" "+ surname +" ("+date+")." );
     System.out.println(name2 +" "+ surname2 +" ("+date2+")." );

     Room room1 = new Room(1, 1, true, true,  1000);
     Room room2 = new Room(2, 1, true, true,  1000);
     Room room3 = new Room(3, 3, false, true,  2400);

     System.out.println(room1.getDescription());
     System.out.println(room2.getDescription());
     System.out.println(room3.getDescription());




    }
}