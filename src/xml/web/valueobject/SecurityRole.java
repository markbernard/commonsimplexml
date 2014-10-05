package xml.web.valueobject;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * web.xml element security-role
 * 
 * @author Mark Bernard
 */
@Root(name="security-role")
public class SecurityRole {
    @Element(name="description",required=false)
    private String description = null;
    @Element(name="role-name",required=true)
    private String roleName = null;

    /**
     * 
     */
    public SecurityRole() {}

    /**
     * @param description
     * @param roleName
     */
    public SecurityRole(String description, String roleName) {
        this.description = description;
        this.roleName = roleName;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * @return the roleName
     */
    public String getRoleName() {
        return roleName;
    }
    /**
     * @param roleName the roleName to set
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String toString() {
        return "[description: " + description +
                ", roleName: " + roleName +
                "]";
    }
}
