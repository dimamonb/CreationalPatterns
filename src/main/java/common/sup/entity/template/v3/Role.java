package common.sup.entity.template.v3;

import java.io.Serializable;

public class Role implements Serializable {
    
    public static final long SerialVersionUID = 1L;
    
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
