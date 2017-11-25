import java.util.List;

public interface IRegistration {

	void addUser(RegistrationForm reg);
	RegistrationForm fetchUserId(int id);
	List<RegistrationForm> getUsers();
	void updateUser(RegistrationForm reg);
	void deleteUser(int id);
	
}
