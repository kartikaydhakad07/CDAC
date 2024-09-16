package ass5_2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Car c = new Car("Rolls Royce", 1995 , "Phantom");
			Vehicle v = new Car("Rolls Royce", 1995 , "Ghost");
			
			v.ShowRecord();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
