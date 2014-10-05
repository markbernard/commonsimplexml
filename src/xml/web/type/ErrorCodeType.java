package xml.web.type;

/**
 * Used in xml.web.valueobject.ErrorPage to support a union with xml.web.type.ExceptionTypeType
 * 
 * @author Mark Bernard
 */
public class ErrorCodeType extends StringValueType {
    /**
     * 
     */
    public ErrorCodeType() {}

    /**
     * 
     * @param value
     */
    public ErrorCodeType(String value) {
        super(value);
    }

}
