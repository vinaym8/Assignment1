import java.util.ArrayList;
import java.util.Collections;

public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee E1 = new Employee(112, "Hary", 6000);
		Employee E2 = new Employee(106, "Raj", 4000);
		Employee E3 = new Employee(250, "Kumar", 2000);
		Employee E4 = new Employee(90, "Jhon", 3000);
		Employee E5 = new Employee(150, "Steve", 5000);
		Employee E6 = new Employee(110, "Abdul", 3800);
		Employee E7 = new Employee(130, "Ashfaq", 4800);
		Employee E8 = new Employee(120, "Ravi", 5800);
		Employee E9 = new Employee(119, "Rachel", 6800);
		Employee E10 = new Employee(100, "Archana", 9000);
		
		
		
			ArrayList<Employee> EmplyList = new ArrayList<>();
			EmplyList.add(E1);
			EmplyList.add(E2);
			EmplyList.add(E3);
			EmplyList.add(E4);
			EmplyList.add(E5);
			EmplyList.add(E6);
			EmplyList.add(E7);
			EmplyList.add(E8);
			EmplyList.add(E9);
			EmplyList.add(E10);
			
			Employee highSal = Collections.max(EmplyList);
			System.out.println("The Employee with Highest Salary is: "+highSal);
			
		
		
		
		
		//java.util.Collections.sort(EmplyList);
		/*java.util.Collections.sort(EmplyList, new TestComparator());
		System.out.println("Sorting the Employees by their Salary");
		for (Employee i : EmplyList) {
			System.out.println(i.getId()+" "+i.getName()+" "+i.getSalary());
		}*/

	}

}
