
public class JSONAdapter implements ReadDB {
	
	JSONFormat jsonFormat;
	
	public JSONAdapter(JSONFormat jsonFormat) {
		super();
		this.jsonFormat = jsonFormat;
	}

	@Override
	public void read() {
		jsonFormat.get();
		
	}
}
