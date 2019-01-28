package step2;

import common.sup.da.v2.JsonParameterSerializeReader;
import common.sup.entity.template.v2.Fallback;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class FileReadSerializeRead {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String fileName = args[0];
		
		Fallback business = null;
		System.out.println("Значение business: " + business);
		JsonParameterSerializeReader myReader = new JsonParameterSerializeReader();
		System.out.println("Считываем данные из файла " + fileName);
		business = myReader.customSerializeReader(fileName);
		System.out.println("Данные считаны с диска из файл " + fileName);
		System.out.println("Значение business: " + business);
		
		ObjectMapper mapper = new ObjectMapper();
		System.out.println("Записываем данные в файла result_parameters.json");
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File("result_parameters.json"), business);
		System.out.println("Данные записаны на диск в файл result_parameters.json");
	}
	
}
