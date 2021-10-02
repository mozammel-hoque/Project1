package oop.inheritance;

public class TestHuman {

	public static void main(String[] args) {
		
		Father father = new Father();
		father.eyesColor();
		father.athletic();
		father.rich();
		System.out.println("-----------------------------------------------");
		Son son = new Son();
		son.eyesColor();
		son.athletic();
		son.rich();
		son.communication();
		System.out.println("-----------");
		//hierarchical inheritance
		
		GrandFather grandFather = new GrandFather();
		grandFather.communication();
		System.out.println("------------------");
		Bird bird = new Bird();
		bird.communication();
	
	}

}
