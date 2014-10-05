package xml.web.type;

/**
 * Used in xml.web.valueobject.FilterMapping to support a union with xml.web.type.ServletNameType
 * 
 * @author Mark Bernard
 */
public class UrlPatternType extends StringValueType {
    /**
     * 
     */
    public UrlPatternType(){}
    
    /**
     * 
     * @param value
     */
    public UrlPatternType(String value) {
        super(value);
    }
}
