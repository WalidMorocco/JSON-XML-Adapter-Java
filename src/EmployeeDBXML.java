import java.util.Arrays;
import java.util.LinkedList;

public class EmployeeDBXML implements XMLFormat {
	LinkedList<String> employees = new LinkedList<String>(Arrays.asList("Walid Amar", "Elon Musk", "Lebron James"));

	@Override
	public void get() {
		for (String element: employees) {
            System.out.println(element);
        }
	}

}
