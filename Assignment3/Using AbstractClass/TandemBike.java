
public class TandemBike extends Bicycle{
	
	int minnoofseats;
	
	public TandemBike(int cadence, int gear, int speed, int minnoofseats) {
		super(cadence, speed, gear);
		
		this.minnoofseats = minnoofseats;
	}
	
	public void printvalues() {
		
		if (minnoofseats >= 2) {
		System.out.println("the cadence is : " +cadence + "  gear is in: " +gear +
				"  speed is: " +speed + "  min. no of seats for TademBike is:" +minnoofseats);
		}
		else
			System.out.println("This Bicycle is not suitable for TandemBike");
}
	
}
