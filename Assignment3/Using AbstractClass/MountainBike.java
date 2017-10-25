
public class MountainBike extends Bicycle{
	
String suspensiontype;

	public MountainBike(int cadence, int gear, int speed, String suspensiontype) {
		super(cadence, speed, gear);
		
		this.suspensiontype = suspensiontype;
	}
	
	public void printvalues() {
		
		if(suspensiontype != null) {
		
		System.out.println("the cadence is : " +cadence + "  gear is in: " +gear 
		+ "  speed is: "  +speed + "  the type of suspension of MountainBike is: " +suspensiontype);
		}
		
		else 
			System.out.println("This bicycle is not suitable for riding on Mountains");

	}

}
