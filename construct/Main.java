package construct;

public class Main {
	

	public static void main(String[] args) {
		
		constructor c = new constructor("c" , "a" , "m");
		c.printName();
		
		setget s = new setget(0, 0);
		s.setInts();
		s.printAB();
		
		new childSupero();		
	}
}
