package step3;

import step3.common.JsonParameterReader;
import step3.v3.Fallback;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


/**
 * parameters.step3.json -> temp.step3.out
 * */
public class FileReadExternalizeWrite {
	
	public static void main(String[] args) throws IOException {
		
		String fileName = args[0];
		JsonParameterReader service = new JsonParameterReader();
		Fallback parameterInfo = service.read(fileName);
		
		FileOutputStream fileOutputStream = new FileOutputStream("temp.step3.out");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(parameterInfo);
		
		objectOutputStream.close();
		
	}
	
}
