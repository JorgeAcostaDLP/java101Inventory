
public class Car {
	String color;
	String type;
	
	
	Car(String c, String t) {
		color = c;
		type = t;
	}
	 

	
	public  void start() {
		System.out.println("Get started!");
	}
	public  void printDescription() {
		System.out.println("This car is "+ this.color+ " and it is a "+ this.type);
	}
	

}

 