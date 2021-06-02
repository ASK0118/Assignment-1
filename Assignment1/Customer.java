package Assignment1;

import java.util.Scanner; //1.2 pre-defined class

import java.text.DecimalFormat;  //1.2 pre-defined class

public class Customer {  //1.3 user defined class

		Scanner input = new Scanner(System.in);
		
		DecimalFormat df2 = new DecimalFormat("#.##") ;
		
		private String custName;
		private int age, phoneNum, selection,day;
		private char gender;
		private double RentPrice, totPrice;
		
		public Customer() {    //1.4 Constructor with no argument
					
			System.out.print("Please enter the name			: ");
			this.custName = input.nextLine();
			
			System.out.print("Please enter the gender\n[M for male, F for female]		: ");
			this.gender = input.next().charAt(0);
			
			System.out.print("Please enter the age			: ");
			this.age = input.nextInt(); 
			
			System.out.print("Please enter the phone number [Example: 0123456789]: ");
			this.phoneNum = input.nextInt();
			
			System.out.print("Please enter the type of car wanted to select\n[1 for Sedan, 2 for SUV, 3 for MPV]	: ");
			this.selection = input.nextInt();
			
				switch(selection) {
					
				case 1 :System.out.print("Please select the car model\n[1 for Vios, 2 for Civic, 3 for Almera]: ");  //selection for car type sedan
						this.selection = input.nextInt();
						
						if (selection==1) { //selection for vios
							System.out.print("Please enter number of rental days	: ");
							this.day = input.nextInt();
							System.out.println("\nInformation of Customer");
							System.out.println("=======================");
							
							if(day<=7) {  //start for day less or equal to 7
								this.RentPrice=113;  // price for vios if rent less than or equal 7 days
								totPrice=totalRentPrice();   //initialize the total price for rental
								System.out.println("\nName				: " + this.custName);
								System.out.println("Gender				: " + this.gender);
								System.out.println("Age				: " + this.age);
								System.out.println("Phone number			: " + this.phoneNum);
								System.out.println("Car				: Vios" );
								System.out.println("The rental price per day 	: RM "+ this.RentPrice);
								System.out.println("The total rental price 		: RM "+ totPrice);
								} //end for day less than 7
						
							else {  //start of day more than 7
								double discount = 0.2;
								double newPrice= 113 -(113 * discount);  //new price for vios if rent more than 7 days 
								totPrice=totalRentPrice(newPrice); //initialize the total price for rental
								System.out.println("\nName				: " + this.custName);
								System.out.println("Gender				: " + this.gender);
								System.out.println("Age				: " + this.age);
								System.out.println("Phone number			: " + this.phoneNum);
								System.out.println("Car				: Vios" );
								System.out.println("The rental price per day 	: RM "+ df2.format(newPrice));
								System.out.println("The total rental price 		: RM "+ df2.format(totPrice));
								}  //end for day more than 7
							} //end for selection 1
				
							else if (selection==2) { //selection for civic
								System.out.print("Please enter number of rental days	: ");
								this.day = input.nextInt();
								System.out.println("\nInformation of Customer");
								System.out.println("=======================");
								
								if(day<=7) {  //start for day less or equal to 7
									this.RentPrice=103;  // price for civic if rent less than or equal 7 days
									totPrice=totalRentPrice();   //initialize the total price for rental
									System.out.println("\nName				: " + this.custName);
									System.out.println("Gender				: " + this.gender);
									System.out.println("Age				: " + this.age);
									System.out.println("Phone number			: " + this.phoneNum);
									System.out.println("Car				: Civic" );
									System.out.println("The rental price per day 	: RM "+ this.RentPrice);
									System.out.println("The total rental price 		: RM "+ totPrice);
									} //end for day less than 7
							
								else {  //start of day more than 7
									double discount = 0.2;
									double newPrice= 103 -(103 * discount);  //new price for civic if rent more than 7 days 
									totPrice=totalRentPrice(newPrice); //initialize the total price for rental
									System.out.println("\nName				: " + this.custName);
									System.out.println("Gender				: " + this.gender);
									System.out.println("Age				: " + this.age);
									System.out.println("Phone number			: " + this.phoneNum);
									System.out.println("Car				: Civic" );
									System.out.println("The rental price per day 	: RM "+ df2.format(newPrice));
									System.out.println("The total rental price 		: RM "+ df2.format(totPrice));
									}  //end for day more than 7
								} //end for selection 2
				
							else if (selection==3) { //selection for almera
								System.out.print("Please enter number of rental days	: ");
								this.day = input.nextInt();
								System.out.println("\nInformation of Customer");
								System.out.println("=======================");
								
								if(day<=7) {  //start for day less or equal to 7
									this.RentPrice=93;  // price for almera if rent less than or equal 7 days
									totPrice=totalRentPrice();   //initialize the total price for rental
									System.out.println("\nName				: " + this.custName);
									System.out.println("Gender				: " + this.gender);
									System.out.println("Age				: " + this.age);
									System.out.println("Phone number			: " + this.phoneNum);
									System.out.println("Car				: Almera" );
									System.out.println("The rental price per day 	: RM "+ this.RentPrice);
									System.out.println("The total rental price 		: RM "+ totPrice);
									} //end for day less than 7
							
								else {  //start of day more than 7
									double discount = 0.2;
									double newPrice= 93 -(93 * discount);  //new price for almera if rent more than 7 days 
									totPrice=totalRentPrice(newPrice); //initialize the total price for rental
									System.out.println("\nName				: " + this.custName);
									System.out.println("Gender				: " + this.gender);
									System.out.println("Age				: " + this.age);
									System.out.println("Phone number			: " + this.phoneNum);
									System.out.println("Car				: Almera" );
									System.out.println("The rental price per day 	: RM "+ df2.format(newPrice));
									System.out.println("The total rental price 		: RM "+ df2.format(totPrice));
									}  //end for day more than 7
								} //end for selection 3
								break;   //break for switch case 1 
								
				case 2 :System.out.print("Please select the car model\n[1 for Harrier, 2 for CR-V, 3 for Rogue]: ");  //selection for car type SUV
				this.selection = input.nextInt();
				
					if (selection==1) { //selection for Harrier
						System.out.print("Please enter number of rental days	: ");
						this.day = input.nextInt();
						System.out.println("\nInformation of Customer");
						System.out.println("=======================");
						
						if(day<=7) {  //start for day less or equal to 7
							this.RentPrice=153;  // price for Harrier if rent less than or equal 7 days
							totPrice=totalRentPrice();   //initialize the total price for rental
							System.out.println("\nName				: " + this.custName);
							System.out.println("Gender				: " + this.gender);
							System.out.println("Age				: " + this.age);
							System.out.println("Phone number			: " + this.phoneNum);
							System.out.println("Car				: Harrier" );
							System.out.println("The rental price per day	: RM "+ this.RentPrice);
							System.out.println("The total rental price 		: RM "+ totPrice);
							} //end for day less than 7
					
						else {  //start of day more than 7
							double discount = 0.2;
							double newPrice= 153 -(153 * discount);  //new price for Harrier if rent more than 7 days 
							totPrice=totalRentPrice(newPrice); //initialize the total price for rental
							System.out.println("\nName				: " + this.custName);
							System.out.println("Gender				: " + this.gender);
							System.out.println("Age				: " + this.age);
							System.out.println("Phone number			: " + this.phoneNum);
							System.out.println("Car				: Harrier" );
							System.out.println("The rental price per day 	: RM "+ df2.format(newPrice));
							System.out.println("The total rental price 		: RM "+ df2.format(totPrice));
							}  //end for day more than 7
						} //end for selection 1
			
						else if (selection==2) { //selection for CR-V
							System.out.print("Please enter number of rental days	: ");
							this.day = input.nextInt();
							System.out.println("\nInformation of Customer");
							System.out.println("=======================");
							
							if(day<=7) {  //start for day less or equal to 7
								this.RentPrice=143;  // price for CR-V if rent less than or equal 7 days
								totPrice=totalRentPrice();   //initialize the total price for rental
								System.out.println("\nName				: " + this.custName);
								System.out.println("Gender				: " + this.gender);
								System.out.println("Age				: " + this.age);
								System.out.println("Phone number	: " + this.phoneNum);
								System.out.println("Car				: CR-V" );
								System.out.println("The rental price per day	: RM "+ this.RentPrice);
								System.out.println("The total rental price 		: RM "+ totPrice);
								} //end for day less than 7
						
							else {  //start of day more than 7
								double discount = 0.2;
								double newPrice= 143 -(143 * discount);  //new price for CR-V if rent more than 7 days 
								totPrice=totalRentPrice(newPrice); //initialize the total price for rental
								System.out.println("\nName				: " + this.custName);
								System.out.println("Gender				: " + this.gender);
								System.out.println("Age				: " + this.age);
								System.out.println("Phone number			: " + this.phoneNum);
								System.out.println("Car				: CR-V" );
								System.out.println("The rental price per day 	: RM "+ df2.format(newPrice));
								System.out.println("The total rental price 		: RM "+ df2.format(totPrice));
								}  //end for day more than 7
							} //end for selection 2
			
						else if (selection==3) { //selection for Rogue
							System.out.print("Please enter number of rental days	: ");
							this.day = input.nextInt();
							System.out.println("\nInformation of Customer");
							System.out.println("=======================");
							
							if(day<=7) {  //start for day less or equal to 7
								this.RentPrice=133;  // price for Rogue if rent less than or equal 7 days
								totPrice=totalRentPrice();   //initialize the total price for rental
								System.out.println("\nName				: " + this.custName);
								System.out.println("Gender				: " + this.gender);
								System.out.println("Age				: " + this.age);
								System.out.println("Phone number			: " + this.phoneNum);
								System.out.println("Car				: Rogue" );
								System.out.println("The rental price per day 	: RM "+ this.RentPrice);
								System.out.println("The total rental price 		: RM "+ totPrice);
								} //end for day less than 7
						
							else {  //start of day more than 7
								double discount = 0.2;
								double newPrice= 133 -(133 * discount);  //new price for Rogue if rent more than 7 days 
								totPrice=totalRentPrice(newPrice); //initialize the total price for rental
								System.out.println("\nName				: " + this.custName);
								System.out.println("Gender				: " + this.gender);
								System.out.println("Age				: " + this.age);
								System.out.println("Phone number			: " + this.phoneNum);
								System.out.println("Car				: Rogue" );
								System.out.println("The rental price per day 	: RM "+ df2.format(newPrice));
								System.out.println("The total rental price 		: RM "+ df2.format(totPrice));
								}  //end for day more than 7
							} //end for selection 3
							break;   //break for switch case 2 
							
				case 3 :System.out.print("Please select the car model\n[1 for Vellfire, 2 for Odssey, 3 for Serena]: ");  //selection for car type MPV
						this.selection = input.nextInt();
					
						if (selection==1) { //selection for Vellfire
							System.out.print("Please enter number of rental days	: ");
							this.day = input.nextInt();
							System.out.println("\nInformation of Customer");
							System.out.println("=======================");
							
							if(day<=7) {  //start for day less or equal to 7
								this.RentPrice=533;  // price for Vellfire if rent less than or equal 7 days
								totPrice=totalRentPrice();   //initialize the total price for rental
								System.out.println("\nName				: " + this.custName);
								System.out.println("Gender				: " + this.gender);
								System.out.println("Age				: " + this.age);
								System.out.println("Phone number			: " + this.phoneNum);
								System.out.println("Car				: Vellfire" );
								System.out.println("The rental price per day 	: RM "+ this.RentPrice);
								System.out.println("The total rental price 		: RM "+ totPrice);
								} //end for day less than 7
						
							else {  //start of day more than 7
								double discount = 0.2;
								double newPrice= 533 -(533 * discount);  //new price for Vellfire if rent more than 7 days 
								totPrice=totalRentPrice(newPrice); //initialize the total price for rental
								System.out.println("\nName				: " + this.custName);
								System.out.println("Gender				: " + this.gender);
								System.out.println("Age				: " + this.age);
								System.out.println("Phone number			: " + this.phoneNum);
								System.out.println("Car				: Vellfire" );
								System.out.println("The rental price per day 	: RM "+ df2.format(newPrice));
								System.out.println("The total rental price 		: RM "+ df2.format(totPrice));
								}  //end for day more than 7
							} //end for selection 1
				
							else if (selection==2) { //selection for Odssey
								System.out.print("Please enter number of rental days	: ");
								this.day = input.nextInt();
								System.out.println("\nInformation of Customer");
								System.out.println("=======================");
								
								if(day<=7) {  //start for day less or equal to 7
									this.RentPrice=523;  // price for Odssey if rent less than or equal 7 days
									totPrice=totalRentPrice();   //initialize the total price for rental
									System.out.println("\nName				: " + this.custName);
									System.out.println("Gender				: " + this.gender);
									System.out.println("Age				: " + this.age);
									System.out.println("Phone number			: " + this.phoneNum);
									System.out.println("Car				: Odssey" );
									System.out.println("The rental price per day 	: RM "+ this.RentPrice);
									System.out.println("The total rental price 		: RM "+ totPrice);
									} //end for day less than 7
							
								else {  //start of day more than 7
									double discount = 0.2;
									double newPrice= 523 -(523 * discount);  //new price for Odssey if rent more than 7 days 
									totPrice=totalRentPrice(newPrice); //initialize the total price for rental
									System.out.println("\nName				: " + this.custName);
									System.out.println("Gender				: " + this.gender);
									System.out.println("Age				: " + this.age);
									System.out.println("Phone number			: " + this.phoneNum);
									System.out.println("Car				: Odssey" );
									System.out.println("The rental price per day 	: RM "+ df2.format(newPrice));
									System.out.println("The total rental price 		: RM "+ df2.format(totPrice));
									}  //end for day more than 7
								} //end for selection 2
				
							else if (selection==3) { //selection for Serena
								System.out.print("Please enter number of rental days	: ");
								this.day = input.nextInt();
								System.out.println("\nInformation of Customer");
								System.out.println("=======================");
								
								if(day<=7) {  //start for day less or equal to 7
									this.RentPrice=513;  // price for Serena if rent less than or equal 7 days
									totPrice=totalRentPrice();   //initialize the total price for rental
									System.out.println("\nName				: " + this.custName);
									System.out.println("Gender				: " + this.gender);
									System.out.println("Age				: " + this.age);
									System.out.println("Phone number			: " + this.phoneNum);
									System.out.println("Car				: Serena" );
									System.out.println("The rental price per day 	: RM "+ this.RentPrice);
									System.out.println("The total rental price 		: RM "+ totPrice);
									} //end for day less than 7
							
								else {  //start of day more than 7
									double discount = 0.2;
									double newPrice= 513 -(513 * discount);  //new price for Serena if rent more than 7 days 
									totPrice=totalRentPrice(newPrice); //initialize the total price for rental
									System.out.println("\nName				: " + this.custName);
									System.out.println("Gender				: " + this.gender);
									System.out.println("Age				: " + this.age);
									System.out.println("Phone number			: " + this.phoneNum);
									System.out.println("Car				: Serena" );
									System.out.println("The rental price per day 	: RM "+ df2.format(newPrice));
									System.out.println("The total rental price 		: RM "+ df2.format(totPrice));
									}  //end for day more than 7
								} //end for selection 3
								break;   //break for switch case 3
					}
		}

		
		public double totalRentPrice() {  //overloading method with no argument
			return day*this.RentPrice;
		}
		
		public double totalRentPrice(double newPrice) {  //overloading method with 1 argument
			return day*newPrice;
		}
		
}
