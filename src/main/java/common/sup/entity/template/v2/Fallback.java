package common.sup.entity.template.v2;

import org.codehaus.jackson.annotate.JsonGetter;

import java.io.Serializable;
import java.util.List;

public class Fallback implements Serializable{
    
    private static final long serialVersionUID = 6762730540237282806L;
    
    @Override
    public String toString() {
        return "Fallback{" +
                       "parameters=" + parameters +
                       '}';
    }
    
    public List<Parameter> parameters;

    public List<Parameter> getParameters() {
        return parameters;
    }
    @JsonGetter("parameters")
    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }
}
