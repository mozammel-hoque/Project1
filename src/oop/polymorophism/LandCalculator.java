package oop.polymorophism;

public class LandCalculator {
	
	
	//overloading : when  you use the same method with the same name, but different parameters
	public int areOfLand(int a, int b) {
		int total = a + b;
		return total; 
	}

	public int areOfLand(int a, int b, int c, int d) {
		int total = a + b + c + d;
		return total; 
	}
	
	public int areOfLand(int a, int b, int c, String str) {
		int total = a + b + c;
		System.out.println(str);
		return total; 
	}
}
