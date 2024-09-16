package ass5_3;

/*Create a base class Animal with attributes like name, and methods 
like eat() and sleep(). Create a subclass Dog that inherits from Animal and has an 
additional method bark(). Write a program to demonstrate the use of inheritance by 
creating objects of Animal and Dog and calling their methods.*/




public class Animal {
	String name;
	
	
	public Animal() {
		
	}
    public Animal(String name) {
		this.name = name;
	}
    
    public void Eat() {
    	System.out.println(name +" is eating");
    	
    }
    
    public void Sleep() {
    	System.out.println(name + " is sleeps at night");
    }
    
    public void Bark() {
    	
    }

}
