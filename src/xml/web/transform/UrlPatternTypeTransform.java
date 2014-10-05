package xml.web.transform;

import org.simpleframework.xml.transform.Transform;

import xml.web.type.UrlPatternType;

/**
 * Transformation object to support SimpleXML for union elements
 * 
 * @author Mark Bernard
 */
public class UrlPatternTypeTransform implements Transform<UrlPatternType> {

    public UrlPatternType read(String arg0) throws Exception {
        return new UrlPatternType(arg0);
    }

    public String write(UrlPatternType arg0) throws Exception {
        return arg0.getValue();
    }

}
