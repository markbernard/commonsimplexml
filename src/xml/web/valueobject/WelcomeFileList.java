package xml.web.valueobject;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * web.xml element welcome-file-list
 * 
 * @author Mark Bernard
 */
@Root(name="welcome-file-list")
public class WelcomeFileList {
    @Element(name="welcome-file",required=true)
    private List<String> welcomeFiles = null;

    /**
     * 
     */
    public WelcomeFileList() {}

    /**
     * @param welcomeFiles
     */
    public WelcomeFileList(List<String> welcomeFiles) {
        this.welcomeFiles = welcomeFiles;
    }

    /**
     * @return the welcomeFiles
     */
    public List<String> getWelcomeFiles() {
        return welcomeFiles;
    }

    /**
     * @param welcomeFiles the welcomeFiles to set
     */
    public void setWelcomeFiles(List<String> welcomeFiles) {
        this.welcomeFiles = welcomeFiles;
    }

    public String toString() {
        return "[welcomeFiles: " + welcomeFiles + 
                "]";
    }
}
