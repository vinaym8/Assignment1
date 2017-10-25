import java.time.LocalDate;
public class Owner {
	
	private String FirstName;
	private String LastName;
	private Long MobileNo;
	private LocalDate dop;
	//one year warranty
	
	public Owner(String firstName, String lastName, Long mobileNo, LocalDate dop) {
		
		this.FirstName = firstName;
		this.LastName = lastName;
		this.MobileNo = mobileNo;
		this.dop = dop;
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

	public Long getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		MobileNo = mobileNo;
	}

	public LocalDate getDop() {
		return dop;
	}

	public void setDop(LocalDate dop) {
		this.dop = dop;
	}
	
}
