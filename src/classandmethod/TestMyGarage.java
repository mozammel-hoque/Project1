package classandmethod;

public class TestMyGarage {

	public static void main(String[] args) {
		
		Garage myGarage = new Garage();
		
		myGarage.setDrivewaySize(12);
		System.out.println(myGarage.getDrivewaySize());
		
		Garage neighborGarage = new Garage();
		neighborGarage.setDrivewaySize(14);
		System.out.println(neighborGarage.getDrivewaySize());
		
		System.out.println(myGarage.getDrivewaySize());
		
		
		
	}
	

}
