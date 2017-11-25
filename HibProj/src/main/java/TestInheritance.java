import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.actionbazaar.persistence.Bidder;
import com.actionbazaar.persistence.Seller;
import com.actionbazaar.persistence.User;
import com.mtc.app.util.HibernateUtil;

public class TestInheritance {

	public static void main(String[] args) {		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		//Query query = session.createQuery("from User");
		org.hibernate.query.Query<User> query = session.createQuery("from User");
		
		List<User> user = query.list();
		for(User Object:user) {
			System.out.println();
			System.out.println("userId: "+Object.getUserId());
			System.out.println("firstname: "+Object.getFirstName());
			System.out.println("Lastname: "+Object.getLastName());
			System.out.println("Username: "+Object.getUsername());
			System.out.println("Email: "+Object.getEmail());
			System.out.println("password: "+Object.getPassword());
			System.out.println("BirthDate: "+Object.getBirthDate());
		}
		
		org.hibernate.query.Query<Bidder> bidders = session.createQuery("from Bidder");
		List<Bidder> bidderlist = bidders.list();
		for(Bidder Obj1:bidderlist) {
			System.out.println();
			System.out.println("BidderId:  "+Obj1.getBidderId());
			System.out.println("UserId:  "+Obj1.getUserId());
		}
		
		org.hibernate.query.Query<Seller> sellerquery = session.createQuery("from Seller");
		List<Seller> sellerlist = sellerquery.list();
		for(Seller Obj1:sellerlist) {
			System.out.println();
			System.out.println("MaxItemsAllowed: "+Obj1.getMaxItemsAllowed());
			System.out.println("UserID "+Obj1.getUserId());
			System.out.println("Commission rate: "+Obj1.getCommisionRate());
			
		}
		
		session.close();
		
		sessionFactory.close();

	}

}
