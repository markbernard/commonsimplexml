package xml.web.valueobject;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * web.xml element servlet-mapping
 * 
 * @author Mark Bernard
 */
@Root(name="servlet-mapping")
public class ServletMapping extends CommonAttribute {
    @Element(name="servlet-name",required=true)
    private String servletName = "";
    @Element(name="url-pattern",required=true)
    private String urlPattern = "";

    /**
     * 
     */
    public ServletMapping() {}

    /**
     * @param servletName
     * @param urlPattern
     */
    public ServletMapping(String servletName, String urlPattern) {
        this.servletName = servletName;
        this.urlPattern = urlPattern;
    }

    /**
     * @return the servletName
     */
    public String getServletName() {
        return servletName;
    }
    /**
     * @param servletName the servletName to set
     */
    public void setServletName(String servletName) {
        this.servletName = servletName;
    }
    /**
     * @return the urlPattern
     */
    public String getUrlPattern() {
        return urlPattern;
    }
    /**
     * @param urlPattern the urlPattern to set
     */
    public void setUrlPattern(String urlPattern) {
        this.urlPattern = urlPattern;
    }

    public String toString() {
        return "[servletName: " + servletName +
                ", urlPattern: " + urlPattern +
                "]";
    }

    public boolean equals(Object obj) {
        if(obj instanceof ServletMapping) {
            return servletName.equals(((ServletMapping)obj).servletName);
        }
        
        return false;
    }
}
