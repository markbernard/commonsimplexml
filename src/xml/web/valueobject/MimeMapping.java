package xml.web.valueobject;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * web.xml element mime-mapping
 * 
 * @author Mark Bernard
 */
@Root(name="mime-mapping")
public class MimeMapping extends CommonAttribute {
    @Element(name="extension",required=true)
    private String extension = "";
    @Element(name="mime-type",required=true)
    private String mimeType = "";

    /**
     * 
     */
    public MimeMapping() {}

    /**
     * @param extension
     * @param mimeType
     */
    public MimeMapping(String extension, String mimeType) {
        this.extension = extension;
        this.mimeType = mimeType;
    }

    /**
     * @return the extension
     */
    public String getExtension() {
        return extension;
    }
    /**
     * @param extension the extension to set
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }
    /**
     * @return the mimeType
     */
    public String getMimeType() {
        return mimeType;
    }
    /**
     * @param mimeType the mimeType to set
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String toString() {
        return "[extension: " + extension +
                ", mimeType: " + mimeType +
                "]";
    }
}
