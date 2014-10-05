package xml.web.transform;

import org.simpleframework.xml.transform.Transform;

import xml.web.type.ErrorCodeType;

/**
 * Transformation object to support SimpleXML for union elements
 * 
 * @author Mark Bernard
 */
public class ErrorCodeTypeTransform implements Transform<ErrorCodeType> {

    public ErrorCodeType read(String arg0) throws Exception {
        return new ErrorCodeType(arg0);
    }

    public String write(ErrorCodeType arg0) throws Exception {
        return arg0.getValue();
    }

}
