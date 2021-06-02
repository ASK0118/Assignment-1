package Assignment1;

public class AdvertisingNMarketing {  //1.3 user defined class
	
	private double price,discount;
	
	AdvertisingNMarketing(){  //1.4 Constructor with no arguments
		
		price=113;
		discount=0.2;
		
		Info(price,discount);
	}

public void Info(double price, double discount) {  //method with 2 parameters
	System.out.println("AFFORDABLE CAR RENTAL!!!");
	System.out.println("Rent at the price as low as RM " + price + " !!!");
	System.out.println("You will get a " + discount*100 + " % discount if rent more than 7 days !!!");
	}

}