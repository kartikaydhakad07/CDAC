package ass5_2;

/*2)	Create a base class Vehicle with attributes like make and year. 
Provide a constructor in Vehicle to initialize these attributes. 
Derive a class Car that has an additional attribute model and write a
constructor that initializes make, year, and model. Write a program to create a Car
object and display its details.*/




public class Vehicle {
	String make;
	int year;
	
	public Vehicle() {
		this("",0);
	}
	
	public Vehicle(String make, int year) {
		this.make = make;
		this.year = year;
	}
	
	public void ShowRecord() {
    	System.out.println("maker : "+ this.make);
    	System.out.println("year : "+ this.year);
    	
    }

	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
