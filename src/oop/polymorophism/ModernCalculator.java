package oop.polymorophism;

public class ModernCalculator extends LandCalculator {

	//overriding: is when use the same method name and same perameter but different body
	//NB: in order to do this we need annotation @Override and extends to the original class where the method is located 
	@Override
	public int areOfLand(int a, int b) {
		int total = a + b +10;
		return total; 
	}
}
