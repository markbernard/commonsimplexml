package xml.web.valueobject;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * web.xml element listener
 * 
 * @author Mark Bernard
 */
@Root(name="listener")
public class Listener extends CommonAttribute {
    @Element(name="listener-class",required=true)
    private String listenerClass = "";

    /**
     * 
     */
    public Listener() {}

    /**
     * @param listenerClass
     */
    public Listener(String listenerClass) {
        this.listenerClass = listenerClass;
    }

    /**
     * @return the listenerClass
     */
    public String getListenerClass() {
        return listenerClass;
    }

    /**
     * @param listenerClass the listenerClass to set
     */
    public void setListenerClass(String listenerClass) {
        this.listenerClass = listenerClass;
    }

    public String toString() {
        return "[listenerClass: " + listenerClass + "]";
    }

    public boolean equals(Object obj) {
        if(obj instanceof Listener) {
            return listenerClass.equals(((Listener)obj).listenerClass);
        }
        
        return false;
    }
}
