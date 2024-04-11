package BusReservationpro;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	Bus(int busNo,boolean ac,int capacity){
		this.busNo=busNo;
		this.ac=ac;
		this.capacity=capacity;	
	}
	//accessor method
	public int getbusNo(){ 
		return busNo;
	}
	public boolean isac(){ 
		return ac;
	}
	public int getcapacity(){ 
		return capacity;
	}
	//accessor method
	public boolean setac(boolean val){ 
		return ac=val;
	}
	public void setcapacity(int cap) { 
		capacity=cap;
	}
	public void displayBusInfo() {
		System.out.println("BusNo: " + busNo + "  ac: " + ac + "  capacity: " + capacity);

	}

}
