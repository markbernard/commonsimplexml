package xml.web.valueobject;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementUnion;
import org.simpleframework.xml.Root;

import xml.web.type.JspFileType;
import xml.web.type.ServletClassType;
import xml.web.type.StringValueType;

/**
 * web.xml element servlet
 * 
 * @author Mark Bernard
 */
@Root(name="servlet")
public class Servlet extends CommonAttribute {
    @Element(name="servlet-name",required=true)
    private String servletName = "";
    @Element(name="display-name",required=false)
    private String displayName = null;
    @Element(name="description",required=false)
    private String description = null;
    @ElementUnion({
        @Element(name="servlet-class",type=ServletClassType.class,required=true),
        @Element(name="jsp-file",type=JspFileType.class,required=true)
    })
    private StringValueType servletClassOrJspFile = null;
    @ElementList(name="init-params",inline=true,required=false)
    private List<InitParam> initParams = null;

    /**
     * 
     */
    public Servlet() {}

    /**
     * @param servletName
     * @param displayName
     * @param description
     * @param servletClassOrJspFile
     * @param initParams
     */
    public Servlet(String servletName, String displayName, String description, StringValueType servletClassOrJspFile,
            List<InitParam> initParams) {
        this.servletName = servletName;
        this.displayName = displayName;
        this.description = description;
        this.servletClassOrJspFile = servletClassOrJspFile;
        this.initParams = initParams;
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
     * @return the servletClassOrJspFile
     */
    public StringValueType getServletClassOrJspFile() {
        return servletClassOrJspFile;
    }
    /**
     * @param servletClassOrJspFile the servletClassOrJspFile to set
     */
    public void setServletClassOrJspFile(StringValueType servletClassOrJspFile) {
        this.servletClassOrJspFile = servletClassOrJspFile;
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
        return "{servletName: " + servletName +
                ", displayName: " + displayName +
                ", description: " + description +
                ", servletClassOrJspFile: " + servletClassOrJspFile +
                ", initParam: " + initParams +
                "}";
    }

    public boolean equals(Object obj) {
        if(obj instanceof Servlet) {
            return servletName.equals(((Servlet)obj).servletName);
        }
        
        return false;
    }
}
