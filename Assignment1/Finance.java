package Assignment1;

import java.text.DecimalFormat;  //1.2 pre-defined class

public class Finance {  //1.3 user defined class
	
	private double employSalary, inventExp, utilitiesFee, maintenanceFee, advertiseFee, sales;
	
	public Finance(double eS, double iE, double uF, double mF, double aF, double s) {  //1.4 Constructor with 7 arguments
		
		DecimalFormat df2 = new DecimalFormat("#.##") ;
		
		this.employSalary = eS;
		this.inventExp = iE;
		this.utilitiesFee = uF;
		this.maintenanceFee = mF;
		this.advertiseFee = aF;
		this.sales = s;
		
		System.out.println("Financial Statement of One Month");
		System.out.println("================================");
		//System.out.println("Total budget: " + this.budget);
		System.out.println("Total employees salary		: RM " + this.employSalary);
		System.out.println("Total inventory fee		: RM " + this.inventExp);
		System.out.println("Total utilities fee		: RM " + this.utilitiesFee);
		System.out.println("Total maintenance fee		: RM " + this.maintenanceFee);
		System.out.println("Total advertisement fee		: RM " + this.advertiseFee);
		System.out.println("Total expenses			: RM " + df2.format(totalExpenses()));
		System.out.println("Total sales			: RM " + this.sales);
		System.out.println("Net profit			: RM " + df2.format(netProfit()));
		System.out.println();
	}
	
	public double totalExpenses() {
		return employSalary + inventExp + utilitiesFee + maintenanceFee + advertiseFee ;
	}
	
	public double netProfit() {
		return sales - totalExpenses();
	}
}
