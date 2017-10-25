
public class CombinedBicycle {

	public static void main(String[] args) {
		
		RoadBike rb = new RoadBike(50, 3, 40, 75);
		MountainBike mb = new MountainBike(30, 4, 20, "dual");
		TandemBike tb = new TandemBike(20, 8, 30, 2);
		rb.printvalues();
		mb.printvalues();
		tb.printvalues();
	}

}
