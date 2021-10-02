package oop.polymorophism;

public class TestCalculator {

	public static void main(String[] args) {
		
		LandCalculator lc = new LandCalculator();
		System.out.println(lc.areOfLand(15, 56, 85, 9654));
		
		ModernCalculator mc = new ModernCalculator();
		System.out.println(mc.areOfLand(5, 5));

	

	}

}
