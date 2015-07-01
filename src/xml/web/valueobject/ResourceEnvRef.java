package xml.web.valueobject;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * web.xml element resource-env-ref
 * 
 * @author Mark Bernard
 */
@Root(name="resource-env-ref")
public class ResourceEnvRef extends CommonAttribute {
    @Element(name="description",required=false)
    private String description = null;
    @Element(name="resource-env-ref-name",required=true)
    private String resourceEnvRefName = null;
    @Element(name="resource-env-ref-type",required=true)
    private String resourceEnvRefType = null;

    /**
     * 
     */
    public ResourceEnvRef() {}

    /**
     * @param description
     * @param resourceEnvRefName
     * @param resourceEnvRefType
     */
    public ResourceEnvRef(String description, String resourceEnvRefName, String resourceEnvRefType) {
        this.description = description;
        this.resourceEnvRefName = resourceEnvRefName;
        this.resourceEnvRefType = resourceEnvRefType;
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
     * @return the resourceEnvRefName
     */
    public String getResourceEnvRefName() {
        return resourceEnvRefName;
    }
    /**
     * @param resourceEnvRefName the resourceEnvRefName to set
     */
    public void setResourceEnvRefName(String resourceEnvRefName) {
        this.resourceEnvRefName = resourceEnvRefName;
    }

    public String toString() {
        return "{description: " + description +
                ", resourceEnvRefName: " + resourceEnvRefName +
                ", resourceEnvRefType: " + resourceEnvRefType +
                "}";
    }
}
