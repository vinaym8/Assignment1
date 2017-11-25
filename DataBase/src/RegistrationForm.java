
public class RegistrationForm {

	private int UserID;
	private String UserName;
	private String EmailId;
	private boolean Gender;
	
	public RegistrationForm() {
		super();
	}

	public RegistrationForm(int userid, String userName, String emailid, boolean gender) {
		super();
		UserID = userid;
		UserName = userName;
		EmailId = emailid;
		Gender = gender;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userid) {
		UserID = userid;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public boolean isGender() {
		return Gender;
	}

	public void setGender(boolean gender) {
		Gender = gender;
	}
	
	
}
