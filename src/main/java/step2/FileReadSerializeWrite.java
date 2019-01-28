package step2;

import common.sup.da.v2.JsonParameterReader;
import common.sup.da.v2.JsonParameterSerializeWriter;
import common.sup.entity.template.v2.Fallback;

/**
 * @author Evgeni Korolev <SBT-Korolev-EE@mail.ca.sbrf.ru>
 * @date 03.04.2018
 */
public class FileReadSerializeWrite {


    /**
     * Из файла parameters.json считываем данные
     * После сериазилуем в файл temp.out
     * Далее перегоняем потоком в result_parameters.json
     *
     * Смысл задания - сериализовать объект в файл.
     * Из файла считать - записать в новый файл и сравнить с исходным
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
	    System.out.println("Записываем данные в файла temp.out");
        mySerializer.customSerializeWriter(business, "temp.out");
	    System.out.println("Данные записаны на диск в файл temp.out");
	

	    
//        ObjectMapper mapper = new ObjectMapper();
//        JsonFileClass jsonFileClass = new JsonFileClass();
//        JsonParameterWriter parameterWriter = new JsonParameterWriter();
//
//        jsonFileClass.setVersion("1.0");
//        jsonFileClass.setParameters(parameterWriter.write(business));
//        mapper.writerWithDefaultPrettyPrinter().writeValue(new File("result_parameters.json"), jsonFileClass);
//
    }
}
