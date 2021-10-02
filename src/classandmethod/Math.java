package classandmethod;

public class Math {

	//non return method
		public static void addition2(int a, int b) {
			int total = a+b;
			System.out.println(total);
		
		}
		
		
		//return method
		public static int addition(int a, int b) {
			return a+b;
			
		}

		public static void main(String[] args) {
		System.out.println(addition(565674, 475847));
			
		}
		
		public static int subtraction(int a, int b) {
			int total = a-b;
			return a-b;
			
		}
		
		public double salary(double baseSalaryPerHour, double regularHours, double overTimeHours, double priceOfTheProduct, double numberOfSales, double commissionPercentage, double tax) {
			
			
			double baseSalary = baseSalaryPerHour * regularHours;
			System.out.println("base salary is: "+baseSalary);
			double overTimeSalary = baseSalaryPerHour * 1.5 * overTimeHours;
			System.out.println("overtime salary is: "+overTimeSalary);
			double commissionEarnings = numberOfSales * priceOfTheProduct * commissionPercentage;
			System.out.println("commission is: "+commissionEarnings);	
			double grossIncome = baseSalary + overTimeSalary + commissionEarnings;
			System.out.println("gross income is: "+grossIncome);
			double netIncome = grossIncome * (1-tax);
			System.out.println("tax amount is: "+grossIncome * tax);
			
			return netIncome;				
		}
		
}


