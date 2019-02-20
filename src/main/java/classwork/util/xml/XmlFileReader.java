package classwork.util.xml;

import classwork.params.entity.template.Fallback;
import classwork.util.AbstractFileReader;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class XmlFileReader extends AbstractFileReader {
	private Fallback fallback;
	public XmlFileReader(Object mapper, String fileName, Fallback fallback) {
		super(mapper, fileName);
		this.fallback = fallback;
	}
	
	@Override
	public void readFile() {
		XmlMapper x = (XmlMapper) mapper;

		System.out.println("Читаем данные из файла " + fileName);
		try {
			fallback = x.readValue(new File(fileName), fallback.getClass());
			System.out.println("Данные из файла: \n" + fallback);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
