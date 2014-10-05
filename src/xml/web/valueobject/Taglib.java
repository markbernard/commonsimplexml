package xml.web.valueobject;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * web.xml element taglib
 * 
 * @author Mark Bernard
 */
@Root(name="taglib")
public class Taglib {
    @Element(name="taglib-uri",required=true)
    private String taglibUri = null;
    @Element(name="taglib-location",required=true)
    private String taglibLocation = null;

    /**
     * 
     */
    public Taglib() {}
    
    /**
     * @param taglibUri
     * @param taglibLocation
     */
    public Taglib(String taglibUri, String taglibLocation) {
        this.taglibUri = taglibUri;
        this.taglibLocation = taglibLocation;
    }

    /**
     * @return the taglibUri
     */
    public String getTaglibUri() {
        return taglibUri;
    }
    /**
     * @param taglibUri the taglibUri to set
     */
    public void setTaglibUri(String taglibUri) {
        this.taglibUri = taglibUri;
    }
    /**
     * @return the taglibLocation
     */
    public String getTaglibLocation() {
        return taglibLocation;
    }
    /**
     * @param taglibLocation the taglibLocation to set
     */
    public void setTaglibLocation(String taglibLocation) {
        this.taglibLocation = taglibLocation;
    }

    public String toString() {
        return "[taglibUri: " + taglibUri +
                ", taglibLocation: " + taglibLocation +
                "]";
    }
}
