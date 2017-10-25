import java.time.LocalDate;
import java.time.Month;

public class MyBicycle {

	public static void main(String[] args) {
		
		Owner ramu = new Owner("Ramu", "chandra", 9989967989l, LocalDate.of(2016, Month.APRIL, 01));
		
		Bicycle Hero = new Bicycle(30, 50, 4);
		
		Hero.mycycle = ramu;
		
		System.out.println("FirstName: "+Hero.mycycle.getFirstName());
		System.out.println("LastName: "+Hero.mycycle.getLastName());
		System.out.println("Contact No: "+Hero.mycycle.getMobileNo());
		System.out.println("Date of Purchase: "+Hero.mycycle.getDop());
		
	}

}
