package common.sup.da.v1;

import common.sup.entity.template.v1.Fallback;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonParameterReader {

    public Fallback read(String url) throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        final Fallback fallback = mapper.readValue(new File(url), Fallback.class);
        return fallback;
    }
    
}
