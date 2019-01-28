package step1;

import common.sup.da.v1.JsonParameterReader;
import common.sup.da.v1.JsonParameterSerializeWriter;
import common.sup.entity.template.v1.Fallback;

/**
 * @author Evgeni Korolev <SBT-Korolev-EE@mail.ca.sbrf.ru>
 * @date 03.04.2018
 */
public class FileReadSerializeWrite {
	
	
	public static final String TEMP_V_1_OUT = "temp.v1.out";
	
	/**
     * Из файла parameters.json считываем данные
     * После сериазилуем в файл temp.out
     * Далее перегоняем потоком в result_parameters.json
     *
     * Смысл задания - сериализовать объект в файл.
     * Из файла считать - записать в новый файл и сравнить с исходным
     *
	 * fileReader->serializeWriter
	 *
     * */
    public static void main(String... args) throws Exception {
        
        String fileName = args[0];
	
	    JsonParameterReader service = new JsonParameterReader();
        Fallback business = null;
	    System.out.println("Значение business: " + business);
	    System.out.println("Считываем данные из файла " + fileName);
        business = service.read(fileName);
	    System.out.println("Данные считаны:");
	    System.out.println(business);

        JsonParameterSerializeWriter mySerializer = new JsonParameterSerializeWriter();
	    System.out.println("Записываем данные в файла " + TEMP_V_1_OUT);
        mySerializer.customSerializeWriter(business, TEMP_V_1_OUT);
	    System.out.println("Данные записаны на диск в файл " + TEMP_V_1_OUT);
	    
    }
}
