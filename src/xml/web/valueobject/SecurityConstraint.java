package xml.web.valueobject;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 * web.xml element security-constraint
 * 
 * @author Mark Bernard
 */
@Root(name="security-constraint")
public class SecurityConstraint extends CommonAttribute {
    @Element(name="display-name",required=false)
    private String displayName = null;
    @ElementList(name="web-resource-collection",required=true,inline=true)
    private List<WebResourceCollection> webResourceCollections = null;
    @Element(name="auth-constraint",required=false)
    private String authConstraint = null;
    @Element(name="user-data-constraint",required=false)
    private String userDataConstraint = null;

    /**
     * 
     */
    public SecurityConstraint() {}

    /**
     * @param displayName
     * @param webResourceCollections
     * @param authConstraint
     * @param userDataConstraint
     */
    public SecurityConstraint(String displayName, List<WebResourceCollection> webResourceCollections,
            String authConstraint, String userDataConstraint) {
        this.displayName = displayName;
        this.webResourceCollections = webResourceCollections;
        this.authConstraint = authConstraint;
        this.userDataConstraint = userDataConstraint;
    }

    /**
     * @return the displayName
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * @param displayName the displayName to set
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    /**
     * @return the webResourceCollections
     */
    public List<WebResourceCollection> getWebResourceCollections() {
        return webResourceCollections;
    }
    /**
     * @param webResourceCollections the webResourceCollections to set
     */
    public void setWebResourceCollections(List<WebResourceCollection> webResourceCollections) {
        this.webResourceCollections = webResourceCollections;
    }
    /**
     * @return the authConstraint
     */
    public String getAuthConstraint() {
        return authConstraint;
    }
    /**
     * @param authConstraint the authConstraint to set
     */
    public void setAuthConstraint(String authConstraint) {
        this.authConstraint = authConstraint;
    }
    /**
     * @return the userDataConstraint
     */
    public String getUserDataConstraint() {
        return userDataConstraint;
    }
    /**
     * @param userDataConstraint the userDataConstraint to set
     */
    public void setUserDataConstraint(String userDataConstraint) {
        this.userDataConstraint = userDataConstraint;
    }

    public String toString() {
        return "[displayName: " + displayName +
                ", webResourceCollections: " + webResourceCollections +
                ", authConstraint: " + authConstraint +
                ", userDataConstraint: " + userDataConstraint +
                "]";
    }
}
