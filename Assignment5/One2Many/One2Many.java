
public class One2Many {

	public static void main(String[] args) {
		
		Father f = new Father("Modi", "Narendra", 1);
		Son[] sons = new Son[2];
		sons[0] = new Son("Demonetization", "Public", 2);
		sons[1] = new Son("GST", "public", 1);
		
		f.setSons(sons);
		
		Son[] f1 = f.getSons();
		for (Son element : f1) {
			System.out.println(element.getFirstName()+"\t"
					+element.getLastName()+"\t"+element.getAge());
			
		}

	}

}
