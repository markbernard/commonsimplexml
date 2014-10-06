package xml.web.valueobject;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 * web.xml element filter
 * 
 * @author Mark Bernard
 */
@Root(name="filter")
public class Filter extends CommonAttribute {
    @Element(name="icon",required=false)
    private String icon = null;
    @Element(name="filter-name",required=true)
    private String filterName = "";
    @Element(name="display-name",required=false)
    private String displayName = null;
    @Element(name="description",required=false)
    private String description = null;
    @Element(name="filter-class",required=true)
    private String filterClass = "";
    @ElementList(name="init-param",inline=true,required=false)
    private List<InitParam> initParams = null;

    /**
     * 
     */
    public Filter() {}

    /**
     * @param icon
     * @param filterName
     * @param displayName
     * @param description
     * @param filterClass
     * @param initParams
     */
    public Filter(String icon, String filterName, String displayName, String description, String filterClass,
            List<InitParam> initParams) {
        this.icon = icon;
        this.filterName = filterName;
        this.displayName = displayName;
        this.description = description;
        this.filterClass = filterClass;
        this.initParams = initParams;
    }
    /**
     * @return the icon
     */
    public String getIcon() {
        return icon;
    }
    /**
     * @param icon the icon to set
     */
    public void setIcon(String icon) {
        this.icon = icon;
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
     * @return the filterClass
     */
    public String getFilterClass() {
        return filterClass;
    }
    /**
     * @param filterClass the filterClass to set
     */
    public void setFilterClass(String filterClass) {
        this.filterClass = filterClass;
    }
    /**
     * @return the initParams
     */
    public List<InitParam> getInitParams() {
        return initParams;
    }
    /**
     * @param initParams the initParams to set
     */
    public void setInitParams(List<InitParam> initParams) {
        this.initParams = initParams;
    }


    public String toString() {
        return "[icon: " + icon + 
                ", filterName: " + filterName +
                ", displayName: " + displayName +
                ", description: " + description +
                ", filterClass: " + filterClass +
                ", initParam: " + initParams +
                "]";
    }
    
    public boolean equals(Object obj) {
        if(obj instanceof Filter) {
            return filterName.equals(((Filter)obj).filterName);
        }
        
        return false;
    }
}
