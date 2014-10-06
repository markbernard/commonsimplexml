package xml.web.valueobject;

import org.simpleframework.xml.Attribute;

/**
 * Provides attributes that are common to most or all elements.
 * 
 * @author Mark Bernard
 */
public abstract class CommonAttribute {
    @Attribute(name="id",required=false)
    private String id = null;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
    
}
