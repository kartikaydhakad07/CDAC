package ass5_2;

public class Car extends Vehicle{
	String model;
	
	
	
	public Car() {
		
	}
	
    public Car(String make, int year, String model) {
    	
    	super(make,year);
    	this.model = model;
		
	}
    
  

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void ShowRecord() {
    	System.out.println("maker : "+ super.make);
    	System.out.println("year : "+ super.year);
    	System.out.println("model : "+ this.model);
    }


}
