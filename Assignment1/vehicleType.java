package Assignment1;

public class vehicleType { //1.3 user defined class
	
	private String type, model;
	
	public vehicleType(String m, String t) { //1.4 Constructor with 2 arguments
		
		this.model = m;
		this.type = t;
		
	}
	
	//1.3 User define class
	public String printInfoToyota(){  //method to print out the info of toyota
		return "Brand				: Toyota\n"
				+ "Model				: "+ this.model 
				+ "\nType				: "+ this.type 
				+ "\nNumber of seats			: 5, 5, 7\n"
				+ "Full tank capacity in Liter	: 40, 55, 75\n"
				+ "Rent price per day		: RM 113, RM 153, RM 533";
	}
	
	public String printInfoHonda(){  //method to print out the info of honda
		return "Brand				: Honda\n"
				+ "Model				: "+ this.model 
				+ "\nType				: "+ this.type 
				+ "\nNumber of seats			: 5, 5, 7\n"
				+ "Full tank capacity in Liter	: 40, 55, 75\n"
				+ "Rent price per day		: RM 103, RM 143, RM 523";
	}
	
	public String printInfoNissan(){  //method to print out the info of nissan
		return "Brand				: Nissan\n"
				+ "Model				: "+ this.model 
				+ "\nType				: "+ this.type 
				+ "\nNumber of seats			: 5, 5, 7\n"
				+ "Full tank capacity in Liter	: 40, 55, 75\n"
				+ "Rent price per day		: RM 93, RM 133, RM 513";
	}
}