import java.util.*;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RegistrationForm user1 = new RegistrationForm(122, "vinay", "Vinay@gmail.com", true);
		RegistrationForm user2 = new RegistrationForm(132, "vinay2", "Vinay2@gmail.com", false);
		RegistrationForm user3 = new RegistrationForm(112, "vinay3", "Vinay3@gmail.com", true);
		/*RegistrationForm user4 = new RegistrationForm(140, "vinay4", "Vinay4@gmail.com", false);*/
		RegistrationDao dao1 = new RegistrationDao();
		dao1.deleteUser(122);
		dao1.deleteUser(132);
		dao1.deleteUser(112);
		
		
		List<RegistrationForm> allusers = dao1.getUsers();
		for(RegistrationForm i : allusers) {
			System.out.println(i.getUserID()+"  "+i.getUserName()+"  "+i.getEmailId());
		
			
		}

	}

}
