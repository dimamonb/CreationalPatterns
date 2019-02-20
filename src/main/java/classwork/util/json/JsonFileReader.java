package classwork.util.json;

import classwork.params.entity.template.Fallback;
import classwork.util.AbstractFileReader;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonFileReader extends AbstractFileReader {
	private Fallback fallback;
	public JsonFileReader(ObjectMapper mapper, String fileName, Fallback fallback) {
		super(mapper, fileName);
		this.fallback = fallback;
	}
	
	@Override
	public void readFile() {
		ObjectMapper o = (ObjectMapper) mapper;

		System.out.println("Читаем данные из файла " + fileName);
		try {
			fallback = o.readValue(new File(fileName), fallback.getClass());
			System.out.println("Данные из файла: \n" + fallback);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		JsonFileReader reader = new JsonFileReader(new ObjectMapper(),"result_parameters.v1.json", new Fallback());
		reader.readFile();
	}
}
