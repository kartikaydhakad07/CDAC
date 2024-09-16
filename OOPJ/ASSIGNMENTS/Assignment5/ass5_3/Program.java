package ass5_3;

public class Program {
	
	
	public static void main(String args[]) {
		
		
		Animal a = new Animal("Cat");
		a.Eat();
		a.Sleep();
		
		
		System.out.println("");
		
		Dog d = new Dog("Rottwieler");
		
		d.Eat();
		d.Sleep();
		d.Bark();
		
		System.out.println("");
		
		Animal a1 = new Dog("Doberman");
		a1.Eat();
		a1.Sleep();
		a1.Bark();
		
		
		
		
		
		
	}
}
