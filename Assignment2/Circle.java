public class Circle {
	double radius;
	double diameter;
	double area_using_radius;
	double area_using_diameter;
	double perimeter;
	final double pie;
	
public  Circle(double radius, final double pie) {
	this.radius = radius;
	this.pie = pie;
	
}

public void calculatearea() {
	area_using_radius = pie * radius * radius;
	System.out.println("The area of the circle calculated using radius is: "+area_using_radius);
	
}

public void calculatearea(int diameter){
	this.diameter = diameter;
	
	if( diameter == 2 * radius) {
	
	area_using_diameter = (pie * diameter * diameter) / 4;
	
	System.out.println("The area of the circle calculated using diameter is: "+area_using_diameter);
	}
	
	else
	{
		System.err.println("Cannot calculate area because diameter must be two times the radius");
		}
}
		
public void calculateperimeter() {
	
	perimeter = 2 * pie * radius;
	System.out.println("The perimeter of the circle is: "+perimeter);
	
}
	
}
