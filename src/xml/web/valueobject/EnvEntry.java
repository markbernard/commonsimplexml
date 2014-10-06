package xml.web.valueobject;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * web.xml element env-entry
 * 
 * @author Mark Bernard
 */
@Root(name="env-entry")
public class EnvEntry extends CommonAttribute {
    @Element(name="description",required=false)
    private String description = null;
    @Element(name="env-entry-name",required=true)
    private String envEntryName = null;
    @Element(name="env-entry-value",required=false)
    private String envEntryValue = null;
    @Element(name="env-entry-type",required=true)
    private String envEntryType = null;

    /**
     * 
     */
    public EnvEntry() {}

    /**
     * @param description
     * @param envEntryName
     * @param envEntryValue
     * @param envEntryType
     */
    public EnvEntry(String description, String envEntryName, String envEntryValue, String envEntryType) {
        this.description = description;
        this.envEntryName = envEntryName;
        this.envEntryValue = envEntryValue;
        this.envEntryType = envEntryType;
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
     * @return the envEntryName
     */
    public String getEnvEntryName() {
        return envEntryName;
    }
    /**
     * @param envEntryName the envEntryName to set
     */
    public void setEnvEntryName(String envEntryName) {
        this.envEntryName = envEntryName;
    }
    /**
     * @return the envEntryValue
     */
    public String getEnvEntryValue() {
        return envEntryValue;
    }
    /**
     * @param envEntryValue the envEntryValue to set
     */
    public void setEnvEntryValue(String envEntryValue) {
        this.envEntryValue = envEntryValue;
    }
    /**
     * @return the envEntryType
     */
    public String getEnvEntryType() {
        return envEntryType;
    }
    /**
     * @param envEntryType the envEntryType to set
     */
    public void setEnvEntryType(String envEntryType) {
        this.envEntryType = envEntryType;
    }

    public String toString() {
        return "[description: " + description +
                ", envEntryName: " + envEntryName +
                ", envEntryValue: " + envEntryValue +
                ", envEntryType: " + envEntryType +
                "]";
    }
}
