
public class RoadBike extends Bicycle{
	
	int tyrewidth;
	public RoadBike(int cadence, int gear, int speed, int tyrewidth) {
		super(cadence, speed, gear);
		
		this.tyrewidth = tyrewidth;
		
	}
	
	public void printvalues() {
		System.out.println("the cadence is : " +cadence + "  gear is in: " +gear + 
				"  speed is: " +speed + "  max tyre width of RoadBike is:" +tyrewidth);
	}
	
}


