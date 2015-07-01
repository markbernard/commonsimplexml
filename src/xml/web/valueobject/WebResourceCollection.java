package xml.web.valueobject;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 * web.xml element web-resource-collection
 * 
 * @author Mark Bernard
 */
@Root(name="web-resource-collection")
public class WebResourceCollection extends CommonAttribute {
    @Element(name="web-resource-name",required=true)
    private String webResourceName = null;
    @Element(name="description",required=false)
    private String description = null;
    @ElementList(name="url-pattern",required=false,inline=true)
    private List<String> urlPatterns = null;
    @ElementList(name="http-method",required=false,inline=true)
    private List<String> httpMethods = null;

    /**
     * 
     */
    public WebResourceCollection() {}

    /**
     * @param webResourceName
     * @param description
     * @param urlPatterns
     * @param httpMethods
     */
    public WebResourceCollection(String webResourceName, String description, List<String> urlPatterns,
            List<String> httpMethods) {
        this.webResourceName = webResourceName;
        this.description = description;
        this.urlPatterns = urlPatterns;
        this.httpMethods = httpMethods;
    }

    /**
     * @return the webResourceName
     */
    public String getWebResourceName() {
        return webResourceName;
    }
    /**
     * @param webResourceName the webResourceName to set
     */
    public void setWebResourceName(String webResourceName) {
        this.webResourceName = webResourceName;
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
     * @return the urlPatterns
     */
    public List<String> getUrlPatterns() {
        return urlPatterns;
    }
    /**
     * @param urlPatterns the urlPatterns to set
     */
    public void setUrlPatterns(List<String> urlPatterns) {
        this.urlPatterns = urlPatterns;
    }
    /**
     * @return the httpMethods
     */
    public List<String> getHttpMethods() {
        return httpMethods;
    }
    /**
     * @param httpMethods the httpMethods to set
     */
    public void setHttpMethods(List<String> httpMethods) {
        this.httpMethods = httpMethods;
    }

    public String toString() {
        return "{webResourceName: " + webResourceName +
                ", description: " + description +
                ", urlPatterns: " + urlPatterns +
                ", httpMethods: " + httpMethods +
                "}";
    }
}
