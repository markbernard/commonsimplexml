package xml.web.valueobject;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementUnion;
import org.simpleframework.xml.Root;

import xml.web.type.ServletNameType;
import xml.web.type.StringValueType;
import xml.web.type.UrlPatternType;

/**
 * web.xml element filter-mapping
 * 
 * @author Mark Bernard
 */
@Root(name="filter-mapping")
public class FilterMapping extends CommonAttribute {
    @Element(name="filter-name",required=true)
    private String filterName = "";
    @ElementUnion({
        @Element(name="url-pattern",type=UrlPatternType.class,required=true),
        @Element(name="servlet-name",type=ServletNameType.class,required=true)
    })
    private StringValueType urlPatternOrServletName = null;

    /**
     * 
     */
    public FilterMapping() {}

    /**
     * @param filterName
     * @param urlPatternOrServletName
     */
    public FilterMapping(String filterName, StringValueType urlPatternOrServletName) {
        this.filterName = filterName;
        this.urlPatternOrServletName = urlPatternOrServletName;
    }

    /**
     * @return the filterName
     */
    public String getFilterName() {
        return filterName;
    }

    /**
     * @param filterName the filterName to set
     */
    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    /**
     * @return the urlPatternOrServletName
     */
    public StringValueType getUrlPatternOrServletName() {
        return urlPatternOrServletName;
    }

    /**
     * @param urlPatternOrServletName the urlPatternOrServletName to set
     */
    public void setUrlPatternOrServletName(StringValueType urlPatternOrServletName) {
        this.urlPatternOrServletName = urlPatternOrServletName;
    }

    public String toString() {
        return "{filterName: " + filterName +
                ", urlPatternOrServletName: " + urlPatternOrServletName +
                "}";
    }

    public boolean equals(Object obj) {
        if(obj instanceof FilterMapping) {
            return filterName.equals(((FilterMapping)obj).filterName);
        }
        
        return false;
    }
}
