package classandmethod;

public class Human {

	
	//static keyword
	static int height;
	static int width = 10;
	int depth = 5;
	
	//non static method
	public void smile() {
		depth = 6; //accessing non static variable from non static method is fine
		height = 15; //accessing static variable from non variable method is fine
		
		System.out.println("human can smile");
		
	}
		
	//static method
	public static void cry() {
	//	depth = 58; //accessing non static variable from static method is not fine
		height = 20; //accessing static variable from variable is fine
			System.out.println("human can cry");
		}
		
	
	
	
}
