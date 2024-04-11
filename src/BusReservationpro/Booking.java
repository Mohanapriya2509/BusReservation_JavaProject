package BusReservationpro;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String passengername;
	int Busno;
	Date date;
	Booking(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the passesnger Name:");
		passengername=sc.next();
		System.out.println("Enter the Bus Number:");
		Busno=sc.nextInt();
		System.out.println("Enter the Travelling Date:");
		String datee=sc.next();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateformat.parse(datee);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
	public boolean isAvailable(ArrayList<Booking>Bookings,ArrayList<Bus>Buses) {
		int capacity=0;
		for(Bus bus:Buses) {
			if(bus.getbusNo()==Busno) {
				capacity=bus.getcapacity();
				
			}
			
		}
		int Booked=0;
		for(Booking b:Bookings) {
			if(b.Busno==Busno && b.date.equals(date)) {
				Booked++;
				
			}
		}
		return Booked<capacity?true:false;
	}

}
