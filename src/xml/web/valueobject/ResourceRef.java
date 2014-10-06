package xml.web.valueobject;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * web.xml element resource-ref
 * 
 * @author Mark Bernard
 */
@Root(name="resource-ref")
public class ResourceRef extends CommonAttribute {
    @Element(name="description",required=false)
    private String description = null;
    @Element(name="res-ref-name",required=true)
    private String resRefName = null;
    @Element(name="res-type",required=true)
    private String resType = null;
    @Element(name="res-auth",required=true)
    private String resAuth = null;
    @Element(name="res-sharing-scope",required=false)
    private String resSharingScope = null;

    /**
     * 
     */
    public ResourceRef() {}

    /**
     * @param description
     * @param resRefName
     * @param resType
     * @param resAuth
     * @param resSharingScope
     */
    public ResourceRef(String description, String resRefName, String resType, String resAuth, String resSharingScope) {
        this.description = description;
        this.resRefName = resRefName;
        this.resType = resType;
        this.resAuth = resAuth;
        this.resSharingScope = resSharingScope;
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
     * @return the resRefName
     */
    public String getResRefName() {
        return resRefName;
    }
    /**
     * @param resRefName the resRefName to set
     */
    public void setResRefName(String resRefName) {
        this.resRefName = resRefName;
    }
    /**
     * @return the resType
     */
    public String getResType() {
        return resType;
    }
    /**
     * @param resType the resType to set
     */
    public void setResType(String resType) {
        this.resType = resType;
    }
    /**
     * @return the resAuth
     */
    public String getResAuth() {
        return resAuth;
    }
    /**
     * @param resAuth the resAuth to set
     */
    public void setResAuth(String resAuth) {
        this.resAuth = resAuth;
    }
    /**
     * @return the resSharingScope
     */
    public String getResSharingScope() {
        return resSharingScope;
    }
    /**
     * @param resSharingScope the resSharingScope to set
     */
    public void setResSharingScope(String resSharingScope) {
        this.resSharingScope = resSharingScope;
    }

    public String toString() {
        return "[description: " + description +
                ", resRefName: " + resRefName +
                ", resType: " + resType +
                ", resAuth: " + resAuth +
                ", resSharingScope: " + resSharingScope +
                "]";
    }
}
