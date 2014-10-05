package xml.web.transform;

import org.simpleframework.xml.transform.Transform;

import xml.web.type.ServletNameType;

/**
 * Transformation object to support SimpleXML for union elements
 * 
 * @author Mark Bernard
 */
public class ServletNameTypeTransform implements Transform<ServletNameType> {

    public ServletNameType read(String arg0) throws Exception {
        return new ServletNameType(arg0);
    }

    public String write(ServletNameType arg0) throws Exception {
        return arg0.getValue();
    }

}
