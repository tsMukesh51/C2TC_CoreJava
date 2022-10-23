package org.tns.interfac;

public class BusReservation implements Booking, TransportMode{

	@Override
	public void reservation(String Name, int id, int amount) {
		// TODO Auto-generated method stub
		System.out.println("The details are " + Name + " " + id + " " + amount);
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("The mode is bus.");
	}
	
	

}
