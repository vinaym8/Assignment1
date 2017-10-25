
public class TandemBike extends Bicycle{
	
	int minnoofseats;
	
	public TandemBike(int cadence, int gear, int speed, int minnoofseats) {
		super(cadence, speed, gear);
		
		this.minnoofseats = minnoofseats;
	}
	
	public void printvalues() {
		System.out.println("the cadence is : " +cadence + "  gear is in: " +gear +
				"  speed is: " +speed + "  min. no of seats for TademBike is:" +minnoofseats);
}
	
}
