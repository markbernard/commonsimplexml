package xml.web.valueobject;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * web.xml element ejb-local-ref
 * 
 * @author Mark Bernard
 */
@Root(name="ejb-local-ref")
public class EjbLocalRef extends CommonAttribute {
    @Element(name="description",required=false)
    private String description = null;
    @Element(name="ejb-ref-name",required=true)
    private String ejbRefName = null;
    @Element(name="ejb-ref-type",required=true)
    private String ejbRefType = null;
    @Element(name="local-home",required=true)
    private String localHome = null;
    @Element(name="local",required=true)
    private String local = null;
    @Element(name="ejb-link",required=false)
    private String ejbLink = null;

    /**
     * 
     */
    public EjbLocalRef() {}

    /**
     * @param description
     * @param ejbRefName
     * @param ejbRefType
     * @param localHome
     * @param local
     * @param ejbLink
     */
    public EjbLocalRef(String description, String ejbRefName, String ejbRefType, String localHome, String local,
            String ejbLink) {
        this.description = description;
        this.ejbRefName = ejbRefName;
        this.ejbRefType = ejbRefType;
        this.localHome = localHome;
        this.local = local;
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
     * @return the localHome
     */
    public String getLocalHome() {
        return localHome;
    }
    /**
     * @param localHome the localHome to set
     */
    public void setLocalHome(String localHome) {
        this.localHome = localHome;
    }
    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }
    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
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
                ", localHome: " + localHome +
                ", local: " + local +
                ", ejbLink: " + ejbLink +
                "]";
    }
}
