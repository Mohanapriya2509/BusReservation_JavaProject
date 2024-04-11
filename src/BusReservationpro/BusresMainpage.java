package BusReservationpro;
import java.util.*;
import java.util.ArrayList;
public class BusresMainpage {

	public static void main(String[] args) {
		ArrayList<Bus> Buses=new ArrayList<Bus>();
		ArrayList<Booking> Bookings=new ArrayList<Booking>();
		Buses.add(new Bus(2345,false,2));
		Buses.add(new Bus(2455,true,55));
		Buses.add(new Bus(2945,false,47));
		Buses.add(new Bus(2845,true,45));
		for(Bus b:Buses) {
			b.displayBusInfo();
		}
		
		int userop=1;
		Scanner sc=new Scanner(System.in);
		while(userop==1) {
			System.out.println("Enter 1 to book and enter 0 to exit");
			userop=sc.nextInt();
			if(userop==1) {
				Booking book=new Booking();
				if(book.isAvailable(Bookings, Buses)) {
					Bookings.add(book);
					System.out.println("Ticket Booking was Confirmed");
					
				}
				else {
					System.out.println("Sorry seats are Occupied!");
				}
			
			}
		}
		
		

	}

}
