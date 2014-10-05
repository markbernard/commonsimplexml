package xml.web.type;

/**
 * Used in xml.web.valueobject.ErrorPage to support a union with xml.web.type.ErrorCodeType
 * 
 * @author Mark Bernard
 */
public class ExceptionTypeType extends StringValueType {
    /**
     * 
     */
    public ExceptionTypeType() {}

    /**
     * 
     * @param value
     */
    public ExceptionTypeType(String value) {
        super(value);
    }

}
