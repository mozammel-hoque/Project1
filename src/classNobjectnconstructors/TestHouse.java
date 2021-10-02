package classNobjectnconstructors;

public class TestHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		House house = new House("450 central ave", "Red");
		House House1 = house;
		House1.kitchen();
		House.bathroom();
		House.livingBedroom();
		House1.guestBedroom();
		System.out.println("the address is: "+House1.getAddress());
		
	//	House1.details("450 central ave", "Red");
		System.out.println("-----------------------------------------------");
		House house2 = new House("50 park ave", "White");
	    house2.childrenBedroom();
		house2.kitchen();
		House.livingBedroom();
		House.bathroom();
		house2.masterBedroom();
		house2.guestBedroom();
	//	house2.details("50 park ave", "White");
		System.out.println("--------------------------------------------------");
		House house3 = new House("900 1st st", "Grey");
		
		house3.kitchen();
		House.livingBedroom();
		House.bathroom();
		house3.masterBedroom();
		house3.childrenBedroom();
		house3.guestBedroom();
		house3.garage();
	//	house3.details("900 1st st", "Grey");
	}

}
