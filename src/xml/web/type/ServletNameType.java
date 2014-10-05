package xml.web.type;

/**
 * Used in xml.web.valueobject.FilterMapping to support a union with xml.web.type.UrlPatternType
 * 
 * @author Mark Bernard
 */
public class ServletNameType extends StringValueType {
    /**
     * 
     */
    public ServletNameType(){}
    
    /**
     * 
     * @param value
     */
    public ServletNameType(String value) {
        super(value);
    }

}
