package com.spring.spring3;

public class Engine {
	private int chassis;
	private Vehicle vehicle;

	public int getChassis() {
		return chassis;
	}

	public void setChassis(int chassis) {
		this.chassis = chassis;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	void displayInfo() {
		System.out.println(chassis + " is a chassis number ");
		System.out.println(vehicle);
	}
}
