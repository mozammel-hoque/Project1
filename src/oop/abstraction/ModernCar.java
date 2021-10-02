package oop.abstraction;

public abstract class ModernCar {
	
	//abstact is superclass that cannot be instantiated and is used to state or define general characteristics 
	public abstract void hydraulicBreak();
	
	public void autoLock() {
		System.out.println("auto lock system");
	}
	
	public void navigation() {
	
	System.out.println("navigation available");
 
	}
}
