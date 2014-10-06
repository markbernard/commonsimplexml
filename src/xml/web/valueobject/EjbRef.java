package xml.web.valueobject;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * web.xml element ejb-ref
 * 
 * @author Mark Bernard
 */
@Root(name="ejb-ref")
public class EjbRef extends CommonAttribute {
    @Element(name="description",required=false)
    private String description = null;
    @Element(name="ejb-ref-name",required=true)
    private String ejbRefName = null;
    @Element(name="ejb-ref-type",required=true)
    private String ejbRefType = null;
    @Element(name="home",required=true)
    private String home = null;
    @Element(name="remote",required=true)
    private String remote = null;
    @Element(name="ejb-link",required=false)
    private String ejbLink = null;

    /**
     * 
     */
    public EjbRef() {}

    /**
     * @param description
     * @param ejbRefName
     * @param ejbRefType
     * @param home
     * @param remote
     * @param ejbLink
     */
    public EjbRef(String description, String ejbRefName, String ejbRefType, String home, String remote, String ejbLink) {
        this.description = description;
        this.ejbRefName = ejbRefName;
        this.ejbRefType = ejbRefType;
        this.home = home;
        this.remote = remote;
        this.ejbLink = ejbLink;
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
     * @return the ejbRefName
     */
    public String getEjbRefName() {
        return ejbRefName;
    }
    /**
     * @param ejbRefName the ejbRefName to set
     */
    public void setEjbRefName(String ejbRefName) {
        this.ejbRefName = ejbRefName;
    }
    /**
     * @return the ejbRefType
     */
    public String getEjbRefType() {
        return ejbRefType;
    }
    /**
     * @param ejbRefType the ejbRefType to set
     */
    public void setEjbRefType(String ejbRefType) {
        this.ejbRefType = ejbRefType;
    }
    /**
     * @return the home
     */
    public String getHome() {
        return home;
    }
    /**
     * @param home the home to set
     */
    public void setHome(String home) {
        this.home = home;
    }
    /**
     * @return the remote
     */
    public String getRemote() {
        return remote;
    }
    /**
     * @param remote the remote to set
     */
    public void setRemote(String remote) {
        this.remote = remote;
    }
    /**
     * @return the ejbLink
     */
    public String getEjbLink() {
        return ejbLink;
    }
    /**
     * @param ejbLink the ejbLink to set
     */
    public void setEjbLink(String ejbLink) {
        this.ejbLink = ejbLink;
    }

    public String toString() {
        return "[description: " + description +
                ", ejbRefName: " + ejbRefName +
                ", ejbRefType: " + ejbRefType +
                ", home: " + home +
                ", remote: " + remote +
                ", ejbLink: " + ejbLink +
                "]";
    }
}
