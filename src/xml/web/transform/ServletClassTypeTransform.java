package xml.web.transform;

import org.simpleframework.xml.transform.Transform;

import xml.web.type.ServletClassType;

/**
 * Transformation object to support SimpleXML for union elements
 * 
 * @author Mark Bernard
 */
public class ServletClassTypeTransform implements Transform<ServletClassType> {

    public ServletClassType read(String arg0) throws Exception {
        return new ServletClassType(arg0);
    }

    public String write(ServletClassType arg0) throws Exception {
        return arg0.getValue();
    }

}
