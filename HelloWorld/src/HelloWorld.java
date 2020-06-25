
public class HelloWorld {
	public static void main(String[] args) {	

	String s = new String("Distended");
	String sub = s.substring(3,6);
	System.out.println("the string is " + sub);
	
	Car c = new Car("red", "troca");
c.start();
c.printDescription();
	}
}