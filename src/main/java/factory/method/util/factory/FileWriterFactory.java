package factory.method.util.factory;

import factory.method.params.entity.template.Fallback;
import factory.method.util.AbstractFileWriter;
import factory.method.util.json.JsonFileWriter;
import factory.method.util.xml.XmlFileWriter;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.codehaus.jackson.map.ObjectMapper;

public class FileWriterFactory {
	
	protected String fileName;
	protected Fallback fallback;
	
	private FileWriterFactory(String fileName, Fallback fallback) {
		this.fileName = fileName;
		this.fallback = fallback;
	}
	
	public AbstractFileWriter fileWriter(String typeFile){
		if (typeFile.equals("json")){
			return new JsonFileWriter(new ObjectMapper(), fileName + typeFile, fallback);
		} else {
			return new XmlFileWriter(new XmlMapper(), fileName + typeFile, fallback);
		}
	}
	
	public static final FileWriterFactory newFileWriterFactory(String fileName, Fallback fallback){
		return new FileWriterFactory(fileName, fallback);
	}
	
}
