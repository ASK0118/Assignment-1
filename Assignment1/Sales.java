package Assignment1;

import java.text.DecimalFormat;

public class Sales {  //1.3 user defined class
	
	DecimalFormat df2 = new DecimalFormat("#.##");

	private double sales;
	
	public Sales(double sales){
		 this.sales = sales;
		  System.out.println("Sales Report");
		  System.out.println("============");
		  System.out.println("The average sales in every day	: RM " + this.sales);
		  System.out.println("The sales in a week		: RM " + df2.format(totalSalesWeek()));
		  System.out.println("The sales in a month		: RM " + df2.format(totalSalesMonth()));
		  
	}

	public double totalSalesWeek() {  //method to calculate total sales of a week
		return this.sales *7 ;
	}
	
	public double totalSalesMonth() {  //method to calculate total sales of a month
		return this.sales *30 ; 
	}
}