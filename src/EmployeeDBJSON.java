
public class EmployeeDBJSON implements JSONFormat {
	String[] employees = {"Walid Amar", "Elon Musk", "Lebron James"};
	
	@Override
	public void get() {
		for (String element: employees) {
            System.out.println(element);
        }
		
	}

}
