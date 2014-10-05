package xml.web.transform;

import org.simpleframework.xml.transform.Transform;

import xml.web.type.JspFileType;

/**
 * Transformation object to support SimpleXML for union elements
 * 
 * @author Mark Bernard
 */
public class JspFileTypeTransform implements Transform<JspFileType> {

    public JspFileType read(String arg0) throws Exception {
        return new JspFileType(arg0);
    }

    public String write(JspFileType arg0) throws Exception {
        return arg0.getValue();
    }

}
