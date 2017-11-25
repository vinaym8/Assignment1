import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class BaseDAO {
	public Connection getConnection()
	{
		Connection con = null;
		
		try
		{
			//"jdbc:postgresql://localhost/test?user=fred&password=secret&ssl=true"
			//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration?verifyServerCertificate=false&useSSL=true","root","sagar");
			//con = DriverManager.getConnection("jdbc:postgresql://localhost/test?user=fred&password=secret&ssl=true");
			/*String url = "jdbc:postgresql://localhost/test";
			Properties props = new Properties();
			props.setProperty("user","vinay");
			props.setProperty("password","password");
			props.setProperty("ssl","false");
			con = DriverManager.getConnection(url, props);*/
			
			String url = "jdbc:postgresql://localhost:5432/registration?user=postgres&password=password&ssl=false";
		     con = DriverManager.getConnection(url);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}

}
