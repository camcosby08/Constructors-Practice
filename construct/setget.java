package construct;

import java.util.Scanner;

public class setget {
	
	int a;
	int b;
	private Scanner s;
	
	public setget(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void setInts() {
		s = new Scanner(System.in);
		
		System.out.print("type first number: ");
		a = s.nextInt();
		
		System.out.print("type second number: ");
		b = s.nextInt();			
	}
	
	public int getInts() {
		return a+b;
	}
	
	void printAB() {
		System.out.println(getInts());
	}
	
}
