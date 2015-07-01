package xml.web.valueobject;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementUnion;
import org.simpleframework.xml.Root;

import xml.web.type.ErrorCodeType;
import xml.web.type.ExceptionTypeType;
import xml.web.type.StringValueType;

/**
 * web.xml error-page element
 * 
 * @author Mark Bernard
 */
@Root(name="error-page")
public class ErrorPage extends CommonAttribute {
    @ElementUnion({
        @Element(name="error-code",type=ErrorCodeType.class,required=true),
        @Element(name="exception-type",type=ExceptionTypeType.class,required=true)
    })
    private StringValueType errorCodeOrExceptionType;
    @Element(name="location",required=true)
    private String location;

    /**
     * 
     */
    public ErrorPage() {}

    /**
     * @param errorCodeOrExceptionType
     * @param location
     */
    public ErrorPage(StringValueType errorCodeOrExceptionType, String location) {
        this.errorCodeOrExceptionType = errorCodeOrExceptionType;
        this.location = location;
    }

    /**
     * @return the errorCodeOrExceptionType
     */
    public StringValueType getErrorCodeOrExceptionType() {
        return errorCodeOrExceptionType;
    }

    /**
     * @param errorCodeOrExceptionType the errorCodeOrExceptionType to set
     */
    public void setErrorCodeOrExceptionType(StringValueType errorCodeOrExceptionType) {
        this.errorCodeOrExceptionType = errorCodeOrExceptionType;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    public String toString() {
        return "{errorCodeOrExceptionType: " + errorCodeOrExceptionType +
                ", location: " + location +
                "}";
    }
}
