package factory.method;

import classwork.params.entity.template.Fallback;
import classwork.util.AbstractFileReader;
import classwork.util.json.JsonFileReader;
import classwork.util.xml.XmlFileReader;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.codehaus.jackson.map.ObjectMapper;

public class FileReaderFactory {
    protected String fileName;
    protected Fallback fallback;

    public FileReaderFactory(String fileName, Fallback fallback) {
        this.fileName = fileName;
        this.fallback = fallback;
    }

    public AbstractFileReader fileReader(String typeFile){
        switch (typeFile){
            case "json":
                return new JsonFileReader(new ObjectMapper(), fileName + typeFile, fallback);
            default:
                return new XmlFileReader(new XmlMapper(), fileName + typeFile, fallback);
        }
    }

    public static final FileReaderFactory newFileReaderFactory(String fileName, Fallback fallback){
        return new FileReaderFactory(fileName, fallback);
    }
}
