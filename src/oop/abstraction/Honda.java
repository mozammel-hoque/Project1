package oop.abstraction;

public class Honda extends ModernCar implements Car, Motor {

	
	//this methods are coming from car interface
	public void carShape() {
		System.out.println("aerodynamic with 2 people capacity");
		
	}

	public void start() {
	System.out.println("let's drive");	
		
	}

	public void stop() {
		
		System.out.println("need breaks");
	}

	
	public void changeGear() {
		System.out.println("3 manual shifts");
		
	}
	
	//this is a Honda class method 
	public void radio() {
		System.out.println("let's play music");
		
		
	}

	//this method is coming from Motor
	public void engine() {
		System.out.println("engine with turbo");
			
	}

	public void fuelType() {
		System.out.println("diesel fuel type");
		
		
		
	}

	
	public void hydraulicBreak() {
		// TODO Auto-generated method stub
		System.out.println("hydraulic break system");
		
	}
	
	
	

}
