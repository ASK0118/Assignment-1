package Assignment1;

import java.util.Scanner; //1.2 pre-defined class

import java.text.DecimalFormat;  //1.2 pre-defined class

public class Employees {  //1.3 user defined class

		Scanner input = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		private String empName;
		private int age, phoneNum, position;
		private char gender;
		private double salary, epf ;
		
		public Employees() {    //1.4 Constructor with no argument
			
			salary = 2000;
			epf = 0.07;
			
			System.out.print("Please enter the name		: ");
			this.empName = input.nextLine();
			
			System.out.print("Please enter the gender\n[M for male, F for female]	: ");
			this.gender = input.next().charAt(0);
			
			System.out.print("Please enter the age		: ");
			this.age = input.nextInt(); 
			
			System.out.print("Please enter the phone number\n[Example: 0123456789]		: ");
			this.phoneNum = input.nextInt();
			
			System.out.print("Please enter the position \n[1 for clerk, 2 for supervisor, 3 for manager]	: ");
			this.position = input.nextInt();
			
			System.out.println("\nInformation of Employee");
			System.out.println("=======================");
			System.out.println("Name				: " + this.empName);
			System.out.println("Gender				: " + this.gender);
			System.out.println("Age				: " + this.age);
			System.out.println("Phone number			: " + this.phoneNum);
			
			if(position==1) {
				System.out.println("Position			: Clerk");
				System.out.println("Salary per month		: RM "+ salary);
				System.out.println("Total salary after minus EPF for a month: RM " + df.format(totalPaid()));
			}
			
			else if(position==2) {
				salary = 2500;  //initialize the salary for supervisor
				System.out.println("Position			: Supervisor");
				System.out.println("Basic salary for a month	: RM " + salary);
				System.out.println("Total salary after minus EPF for a month: RM " + df.format(totalPaid(salary)));
			}
			
			else if(position==3) {
				salary = 3500;  //initialize the salary for manager
				double elaun = 300;
				System.out.println("Position			: Manager");
				System.out.println("Basic salary for a month	: RM " + salary);
				System.out.println("Elaun for a month		: RM " + elaun);
				System.out.println("Total salary after minus EPF for a month: RM " + df.format(totalPaid(salary,elaun)));
			}
		}
		
		public double totalPaid() {
			return salary-salary*epf;
		}
		
		public double totalPaid(double salary) {
			return salary-salary*epf;
		}
		
		public double totalPaid(double salary, double elaun) {
			return salary - salary*epf + elaun;
		} 
}