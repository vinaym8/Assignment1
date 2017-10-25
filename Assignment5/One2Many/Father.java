
public class Father {
	
	private String FirstName;
	private String LastName;
	private int no_of_wifes;
	private Son[] sons;
	
	public Father(String firstName, String lastName, int no_of_wifes) {
	
		this.FirstName = firstName;
		this.LastName = lastName;
		this.no_of_wifes = no_of_wifes;
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

	public void setNo_of_wifes(int no_of_wifes) {
		this.no_of_wifes = no_of_wifes;
	}

	public Son[] getSons() {
		return sons;
	}

	public void setSons(Son[] sons) {
		this.sons = sons;
	}
	
}
