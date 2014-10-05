package xml.web.valueobject;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * web.xml element init-param
 * 
 * @author Mark Bernard
 */
@Root(name="init-param")
public class InitParam {
    @Element(name="param-name",required=true)
    private String paramName = "";
    @Element(name="param-value",required=true)
    private String paramValue = "";
    @Element(name="description",required=false)
    private String description = null;

    /**
     * 
     */
    public InitParam() {}

    /**
     * @param paramName
     * @param paramValue
     * @param description
     */
    public InitParam(String paramName, String paramValue, String description) {
        this.paramName = paramName;
        this.paramValue = paramValue;
        this.description = description;
    }

    /**
     * @return the paramName
     */
    public String getParamName() {
        return paramName;
    }
    /**
     * @param paramName the paramName to set
     */
    public void setParamName(String paramName) {
        this.paramName = paramName;
    }
    /**
     * @return the paramValue
     */
    public String getParamValue() {
        return paramValue;
    }
    /**
     * @param paramValue the paramValue to set
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
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


    public String toString() {
        return "[paramName: " + paramName + 
                ", paramValue: " + paramValue +
                ", description: " + description +
                "]";
    }

    public boolean equals(Object obj) {
        if(obj instanceof InitParam) {
            return paramName.equals(((InitParam)obj).paramName);
        }
        
        return false;
    }
}
