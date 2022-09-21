
public class XMLAdapter implements ReadDB {
	
	XMLFormat xmlFormat;
	
	public XMLAdapter(XMLFormat xmlFormat) {
		super();
		this.xmlFormat = xmlFormat;
	}

	@Override
	public void read() {
		xmlFormat.get();
		
	}
}
