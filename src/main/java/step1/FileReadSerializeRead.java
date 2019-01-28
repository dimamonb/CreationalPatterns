package step1;

import common.sup.da.v1.JsonParameterSerializeReader;
import common.sup.entity.template.v1.Fallback;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;


/**
 * читаем из temp.out
 *
 * serializeReader -> objectMapper
 * */
public class FileReadSerializeRead {
	
	public static final String RESULT_PARAMETERS_V_1_JSON = "result_parameters.v1.json";
	
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
		System.out.println("Записываем данные в файла " + RESULT_PARAMETERS_V_1_JSON);
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File(RESULT_PARAMETERS_V_1_JSON), business);
		System.out.println("Данные записаны на диск в файл " + RESULT_PARAMETERS_V_1_JSON);
	}
	
}
