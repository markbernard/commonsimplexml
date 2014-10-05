package xml.web.type;

/**
 * Root class for all union types.
 * 
 * @author Mark Bernard
 */
public class StringValueType {
    private String value;

    /**
     * 
     */
    public StringValueType(){}
    
    /**
     * 
     * @param value
     */
    public StringValueType(String value) {
        this.value = value;
    }
    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    public String toString() {
        return value;
    }
}
