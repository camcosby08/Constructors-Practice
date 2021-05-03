package construct;

public class constructor {

	//ask for names
	String firstName;
	String middleName;
	String lastName;
	
	public constructor (String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	void printName() {
		System.out.println(firstName + middleName + lastName);
	}

}
