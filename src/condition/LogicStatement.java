package condition;

public class LogicStatement {

	public static void main(String[] args) {
		
		//if snd else statement
		int num1 = 9;
		if(num1<11) {
			System.out.println("this number is less than 1");
		}
		
		// % means remainder
		if (num1 % 2 == 0) {
			System.out.println("this number is even");
		}else {
			System.out.println("this number is odd");
			
		}
		
		//if , else if and else statement
		String month = "Feb";
		if (month.equals("Jan")) {
			System.out.println("this is the first month of the year");
		} else if (month.equals("Dec")) {
			System.out.println("this is the last month of the year");
		
		} else if (month.equals("Feb")) {
			System.out.println("this is sepcial month");
		}
		else {
			System.out.println("this is regular month");
		}
		
		
		//switch statement
		int day = 2;
		String currentday;
		switch(day) {
		case 1: currentday = "Mon";
			break;
		case 2: currentday = "Tue";
			break;
		case 3: currentday = "wed";
			break;
		case 4: currentday = "thu";
			break;
		case 5: currentday = "Fri";
			break;
		case 6: currentday = "Sat";
			break;
		case 7: currentday = "Sun";
			break;
		default: currentday = "incorrect number";
		}
		System.out.println("today is: "+currentday);

	}

}
