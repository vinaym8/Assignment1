import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mtc.app.entity.Product;
import com.mtc.app.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
	
		Product product = session.get(Product.class,101);
		
		System.out.println("ProductId   : "+product.getId());
		System.out.println("ProductName : "+product.getName());
		
		session.close();
		
		sessionFactory.close();

	}

}
