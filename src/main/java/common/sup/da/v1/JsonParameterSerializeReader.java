package common.sup.da.v1;

import common.sup.entity.template.v1.Fallback;

import java.io.*;

public class JsonParameterSerializeReader {
	
	public Fallback customSerializeReader(String filename) throws IOException, ClassNotFoundException {
		try (FileInputStream fos = new FileInputStream(filename)){
			try (ObjectInputStream oos = new ObjectInputStream(fos)){
				return (Fallback)oos.readObject();
			}
		}
	}
	
}
