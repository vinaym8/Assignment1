
public class Son {
	
	private String FirstName;
	private String LastName;
	private int age;
	
	public Son(String firstName, String lastName, int age) {
		
		this.FirstName = firstName;
		this.LastName = lastName;
		this.age = age;
		
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
