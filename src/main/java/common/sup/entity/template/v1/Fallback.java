package common.sup.entity.template.v1;

import org.codehaus.jackson.annotate.JsonGetter;

import java.io.Serializable;
import java.util.List;

public class Fallback implements Serializable{
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
