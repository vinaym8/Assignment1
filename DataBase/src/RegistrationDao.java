import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class RegistrationDao extends BaseDAO implements IRegistration {

	@Override
	public void addUser(RegistrationForm reg) {
		// TODO Auto-generated method stub
		String insertQuery = "insert into regForm (USER_ID,USER_NAME,EMAIL_ID,GENDER)" +"values(?,?,?,?)";
		try(Connection con = getConnection())
		{
			PreparedStatement prepStmt = con.prepareStatement(insertQuery);
			
			prepStmt.setInt(1, reg.getUserID());
			prepStmt.setString(2, reg.getUserName());
			prepStmt.setString(3, reg.getEmailId());
			prepStmt.setBoolean(4, reg.isGender());
			
			int numRows = prepStmt.executeUpdate();
			if(numRows == 1)
			{
				System.out.println("1 Row inserted succesfully");
			}
			con.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	@Override
	public RegistrationForm fetchUserId(int id) {
		// TODO Auto-generated method stub
		RegistrationForm reg = null;
		String fetchByIdQuery = "select * from regForm where USER_ID =?";
		try(Connection con = getConnection())
		{
			PreparedStatement prepStmt = con.prepareStatement(fetchByIdQuery);
			prepStmt.setInt(1, id);
			ResultSet resultset = prepStmt.executeQuery();
			while(resultset.next())
			{
				reg = new RegistrationForm();
				reg.setUserID(resultset.getInt(1));
				reg.setUserName(resultset.getString(2));
				reg.setEmailId(resultset.getString("EMAIL_ID"));
				reg.setGender(resultset.getBoolean(4));
				
			}
			resultset.close();
			con.close();
			return reg;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<RegistrationForm> getUsers() {
		// TODO Auto-generated method stub
		String selectQuery = "select * from regForm";
		ArrayList<RegistrationForm> al = new ArrayList<>();
		try(Connection con = getConnection())
		{
			Statement stmt = con.createStatement();
			ResultSet resultet = stmt.executeQuery(selectQuery);
			while(resultet.next())
			{
				RegistrationForm regObj = new RegistrationForm();
				regObj.setUserID(resultet.getInt(1));
				regObj.setUserName(resultet.getString(2));
				regObj.setEmailId(resultet.getString(3));
				regObj.setGender(resultet.getBoolean(4));
				al.add(regObj);
			
			}
			resultet.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return al;
	}

	@Override
	public void updateUser(RegistrationForm reg) {
		// TODO Auto-generated method stub
		
		String updateStmt = "update regForm set USER_NAME = ?,EMAIL_ID = ?,GENDER =? where USER_ID = ?";
		try(Connection con = getConnection())
		{
			PreparedStatement prepStmt = con.prepareStatement(updateStmt);
			prepStmt.setString(1, reg.getUserName());
			prepStmt.setString(2, reg.getEmailId());
			prepStmt.setBoolean(3, reg.isGender());
			prepStmt.setInt(4, reg.getUserID());
			int numRows = prepStmt.executeUpdate();
			if(numRows == 1)
			{
				System.out.println("1 Row updated");
			}
			con.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		String deleteQuery = "DELETE FROM regForm WHERE USER_ID = ?";
		try(Connection con = getConnection())
		{
			PreparedStatement prepStmt = con.prepareStatement(deleteQuery);
			prepStmt.setInt(1, id);
			int numRows = prepStmt.executeUpdate();
			if(numRows == 1)
			{
				System.out.println("1 Row deleted");
			}
			con.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	
}