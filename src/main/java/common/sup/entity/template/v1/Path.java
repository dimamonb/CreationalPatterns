package common.sup.entity.template.v1;

import java.io.Serializable;

public class Path  implements Serializable {
    private String name;
    private String value;

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Path{" +
                       "name='" + name + '\'' +
                       ", value='" + value + '\'' +
                       '}';
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}