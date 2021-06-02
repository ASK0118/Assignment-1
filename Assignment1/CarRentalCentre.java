package Assignment1;

public class CarRentalCentre {
	
	private String CompanyName, CompanyAdd, CompanyWebsite;
	private int CompanyPhoneNum;
	
	public CarRentalCentre(String CN, String CA, int CPN, String CW) {  //1.4 Constructor with 4 arguments
		this.CompanyName = CN;
		this.CompanyAdd = CA;
		this.CompanyPhoneNum = CPN;
		this.CompanyWebsite = CW;
		
		printInfo();
	}

	public void printInfo() {  //method with no parameter
		System.out.println("Information of Company");
		System.out.println("===================");
		System.out.println("Company Name		: " + this.CompanyName);
		System.out.println("Company Address		: " + this.CompanyAdd);
		System.out.println("Company Phone Number	: " + this.CompanyPhoneNum);
		System.out.println("Company Website		: " + this.CompanyWebsite);
	}
}
