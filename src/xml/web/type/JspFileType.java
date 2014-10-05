package xml.web.type;

/**
 * Used in xml.web.valueobject.Servlet to support a union with xml.web.type.ServletClassType
 * 
 * @author Mark Bernard
 */
public class JspFileType extends StringValueType {
    /**
     * 
     */
    public JspFileType(){}
    
    /**
     * 
     * @param value
     */
    public JspFileType(String value) {
        super(value);
    }
}
