package factory.method.util.json;

import factory.method.util.AbstractFileReader;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonFileReader extends AbstractFileReader {
	
	public JsonFileReader(ObjectMapper mapper, String fileName) {
		super(mapper, fileName);
	}
	
	@Override
	public void readFile() {
	
	}
}
