package factory.app;

import classwork.params.da.JsonParameterReader;
import classwork.params.da.JsonParameterSerializeWriter;
import classwork.params.entity.template.Fallback;
import classwork.util.AbstractFileReader;
import factory.method.FileReaderFactory;

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
	 * parameters.v1.json -> temp.v1.out
	 *
     * */
	
	//todo нужно реализовать паттерн фабричный метод для считывания из файлов разного формата
	public static final String RESULT_PARAMETERS = "result_parameters.v1.";
    public static void main(String... args) throws Exception {
        

	
	    FileReaderFactory readFactory = FileReaderFactory.newFileReaderFactory(RESULT_PARAMETERS,new Fallback());
		AbstractFileReader jsonReader = readFactory.fileReader("json");
		jsonReader.readFile();

		System.out.println();

		AbstractFileReader xmlReader = readFactory.fileReader("xml");
		xmlReader.readFile();

    }
}
