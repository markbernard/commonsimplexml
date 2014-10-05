package xml.web.transform;

import org.simpleframework.xml.transform.Transform;

import xml.web.type.ExceptionTypeType;

/**
 * Transformation object to support SimpleXML for union elements
 * 
 * @author Mark Bernard
 */
public class ExceptionTypeTypeTransform implements Transform<ExceptionTypeType> {

    public ExceptionTypeType read(String arg0) throws Exception {
        return new ExceptionTypeType(arg0);
    }

    public String write(ExceptionTypeType arg0) throws Exception {
        return arg0.getValue();
    }

}
