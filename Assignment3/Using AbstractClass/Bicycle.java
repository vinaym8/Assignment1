
abstract public class Bicycle {
	
	int cadence = 0;
	int speed = 0;
	int gear = 1;
	
	public Bicycle(int cadence, int speed, int gear) {
		
		this.cadence = cadence;
		this.speed = speed;
		this.gear = gear;
	}
	public void changecadence(int newvalue) {
		cadence = newvalue;	
	}
	
	public void changegear(int newvalue) {
		gear = newvalue;
	}
	
	public void speedup(int increment) {
		speed = speed + increment;
	}
	
	public void applybreaks(int decrement) {
		speed = speed - decrement;		
	}
	
	abstract public void printvalues();

}
