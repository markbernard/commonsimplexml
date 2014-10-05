package xml.web.type;

/**
 * Used in xml.web.valueobject.Servlet to support a union with xml.web.type.JspFileType
 * 
 * @author Mark Bernard
 */
public class ServletClassType extends StringValueType {
    /**
     * 
     */
    public ServletClassType(){}
    
    /**
     * 
     * @param value
     */
    public ServletClassType(String value) {
        super(value);
    }
}
