package builder.method;

import classwork.params.entity.template.Fallback;
import classwork.util.AbstractFileReader;
import classwork.util.json.JsonFileReader;
import factory.method.FileReaderFactory;
import org.codehaus.jackson.map.ObjectMapper;

public class FileReaderBuilder {


    public Fallback readFromFile(ObjectMapper om,String filename, String fileType) {
        AbstractFileReader abstractFileReader = null;
        if(fileType.equalsIgnoreCase("json")){
            abstractFileReader = new JsonFileReader(om, filename)
        }
    }

    /*protected String fileName;
    protected Fallback fallback;
    protected String fileType;

    public FileReaderBuilder buildFileName(String fileName){
        this.fileName = fileName;
        return this;
    }

    public FileReaderBuilder buildFallback(Fallback fallback){
        this.fallback = fallback;
        return this;
    }

    public FileReaderBuilder buildFileType(String fileType){
        this.fileType = fileType;
        return this;
    }

    public FileReaderBuilder build(){
        return new FileReaderBuilder();
    }

    public AbstractFileReader factoryReader(){
        FileReaderFactory readFactory = FileReaderFactory.newFileReaderFactory(fileName, fallback);
        return readFactory.fileReader(fileType);
    }*/


}
