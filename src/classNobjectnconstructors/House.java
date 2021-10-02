package classNobjectnconstructors;

public class House {
	//global variables: belongs to the calss
	String address;
	String color;
	final String lastname = "Doe";
	
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}


	
	//constructor
	public House(String myAddress, String myColor) {
		this.address = myAddress;
		this.color = myColor;

		
	}
	
	
	
	
	//methods
	//local variables belong to the method
	//this connects global variable to local vairable
	public void details(String myAddress, String myColor) {
		
		System.out.println("the address of this house is: "+address);
		System.out.println("the color of this house is: "+color);
	}
	public void kitchen() {
	
		System.out.println("let's cook");

	}
	
	public static void bathroom() {
		System.out.println("shower...shower...shower");
		
	}
	
	public static void livingBedroom() {
		System.out.println("let's watch TV");
	}
	
	public void masterBedroom() {
		System.out.println("Daddy and Mommy");
		
	}
	
	public void childrenBedroom() {
		System.out.println("let's play");
		
	}
	
	public void guestBedroom() {
		System.out.println("wlcome to our house");
		
	}
	
	public void garage() {
		System.out.println("I love my car");
		
	}
}
