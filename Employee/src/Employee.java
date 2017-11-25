import java.util.*;

public class Employee implements Comparable<Employee> {
	
	private int id;
	private String name;
	private float salary;
	
	
	
	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.salary>o.salary)
		{
			return 1;
		}
		else if(this.salary<o.salary)
		{
			return -1;
		}
		return 0;
		
		
	}
public String toString() {
		
		return "Employee_id:"+id+"	Employee_Name:"+name+"	Employee_salary:	"+salary;
	}
	

	

	
}
