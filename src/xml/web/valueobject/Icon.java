package xml.web.valueobject;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * web.xml element icon
 * 
 * @author Mark Bernard
 */
@Root(name="icon")
public class Icon {
    @Element(name="small-icon",required=false)
    private String smallIcon = null;
    @Element(name="large-icon",required=false)
    private String largeIcon = null;

    /**
     * 
     */
    public Icon() {}

    /**
     * @param smallIcon
     * @param largeIcon
     */
    public Icon(String smallIcon, String largeIcon) {
        this.smallIcon = smallIcon;
        this.largeIcon = largeIcon;
    }

    /**
     * @return the largeIcon
     */
    public String getLargeIcon() {
        return largeIcon;
    }
    /**
     * @param largeIcon the largeIcon to set
     */
    public void setLargeIcon(String largeIcon) {
        this.largeIcon = largeIcon;
    }
    /**
     * @return the smallIcon
     */
    public String getSmallIcon() {
        return smallIcon;
    }
    /**
     * @param smallIcon the smallIcon to set
     */
    public void setSmallIcon(String smallIcon) {
        this.smallIcon = smallIcon;
    }

    public String toString() {
        return "[smallIcon: " + smallIcon +
                ", largeIcon: " + largeIcon +
                "]";
    }
}
