package classandmethod;

public class TestHuman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human american = new Human();
		System.out.println(american.width); //width is static
		System.out.println(american.depth); //depth is not static
		american.smile();
		american.cry();
		
		
		System.out.println(Human.width); // =static variable can be accessed by class name
		
	}

}
