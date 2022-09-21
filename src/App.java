public class App {
	
	public static void main(String[] args) {
		
		EmployeeDBJSON json = new EmployeeDBJSON();
		EmployeeDBXML xml = new EmployeeDBXML();
		
		ReadDB jsonAdapter = new JSONAdapter(json);
		ReadDB xmlAdapter = new XMLAdapter(xml);
		
		
		System.out.println("Read Employees from Json File:");
		jsonAdapter.read();
		
		System.out.println("\nRead Employees from XML File:");
		xmlAdapter.read();
		
	}
	
}
