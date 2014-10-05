package xml.web.valueobject;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 * web.xml root element.
 * 
 * @author Mark Bernard
 */
@Root(name="web-app")
public class WebApp {
    @Element(name="icon",required=false)
    private Icon icon = null;
    @Element(name="display-name",required=false)
    private String displayName = null;
    @Element(name="description",required=false)
    private String description = null;
    @Element(name="distributable",required=false)
    private String distributable = null;
    @ElementList(name="context-param",inline=true,required=false)
    private List<ContextParam> contextParams = null;
    @ElementList(name="filter",inline=true,required=false)
    private List<Filter> filters = null;
    @ElementList(name="filter-mapping",inline=true,required=false)
    private List<FilterMapping> filterMappings = null;
    @ElementList(name="listener",inline=true,required=false)
    private List<Listener> listeners = null;
    @ElementList(name="servlet",inline=true,required=false)
    private List<Servlet> servlets = null;
    @ElementList(name="servlet-mapping",inline=true,required=false)
    private List<ServletMapping> servletMappings = null;
    @Element(name="session-config",required=false)
    private String sessionConfig = null;
    @ElementList(name="mime-mapping",inline=true,required=false)
    private List<MimeMapping> mimeMappings = null;
    @Element(name="welcome-file-list",required=false)
    private WelcomeFileList welcomeFileList = null;
    @ElementList(name="error-page",inline=true,required=false)
    private List<ErrorPage> errorPages = null;
    @ElementList(name="taglib",inline=true,required=false)
    private List<Taglib> taglibs = null;
    @ElementList(name="resource-env-ref",inline=true,required=false)
    private List<ResourceEnvRef> resourceEnvRefs = null;
    @ElementList(name="resource-ref",inline=true,required=false)
    private List<ResourceRef> resourceRefs = null;
    @ElementList(name="security-constraint",inline=true,required=false)
    private List<SecurityConstraint> securityConstraints = null;
    @Element(name="login-config",required=false)
    private String loginConfig = null;
    @ElementList(name="security-role",inline=true,required=false)
    private List<SecurityRole> securityRoles = null;
    @ElementList(name="env-entry",inline=true,required=false)
    private List<EnvEntry> envEntrys = null;
    @ElementList(name="ejb-ref",inline=true,required=false)
    private List<EjbRef> ejbRefs = null;
    @ElementList(name="ejb-local-ref",inline=true,required=false)
    private List<EjbLocalRef> ejbLocalRefs = null;
    
    /**
     * 
     */
    public WebApp() {}

    /**
     * @param icon
     * @param displayName
     * @param description
     * @param distributable
     * @param contextParams
     * @param filters
     * @param filterMappings
     * @param listeners
     * @param servlets
     * @param servletMappings
     * @param sessionConfig
     * @param mimeMappings
     * @param welcomeFileList
     * @param errorPages
     * @param taglibs
     * @param resourceEnvRefs
     * @param resourceRefs
     * @param securityConstraints
     * @param loginConfig
     * @param securityRoles
     * @param envEntrys
     * @param ejbRefs
     * @param ejbLocalRefs
     */
    public WebApp(Icon icon, String displayName, String description, String distributable,
            List<ContextParam> contextParams, List<Filter> filters, List<FilterMapping> filterMappings,
            List<Listener> listeners, List<Servlet> servlets, List<ServletMapping> servletMappings,
            String sessionConfig, List<MimeMapping> mimeMappings, WelcomeFileList welcomeFileList,
            List<ErrorPage> errorPages, List<Taglib> taglibs, List<ResourceEnvRef> resourceEnvRefs,
            List<ResourceRef> resourceRefs, List<SecurityConstraint> securityConstraints, String loginConfig,
            List<SecurityRole> securityRoles, List<EnvEntry> envEntrys, List<EjbRef> ejbRefs,
            List<EjbLocalRef> ejbLocalRefs) {
        this.icon = icon;
        this.displayName = displayName;
        this.description = description;
        this.distributable = distributable;
        this.contextParams = contextParams;
        this.filters = filters;
        this.filterMappings = filterMappings;
        this.listeners = listeners;
        this.servlets = servlets;
        this.servletMappings = servletMappings;
        this.sessionConfig = sessionConfig;
        this.mimeMappings = mimeMappings;
        this.welcomeFileList = welcomeFileList;
        this.errorPages = errorPages;
        this.taglibs = taglibs;
        this.resourceEnvRefs = resourceEnvRefs;
        this.resourceRefs = resourceRefs;
        this.securityConstraints = securityConstraints;
        this.loginConfig = loginConfig;
        this.securityRoles = securityRoles;
        this.envEntrys = envEntrys;
        this.ejbRefs = ejbRefs;
        this.ejbLocalRefs = ejbLocalRefs;
    }

    /**
     * @return the icon
     */
    public Icon getIcon() {
        return icon;
    }

    /**
     * @param icon the icons to set
     */
    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    /**
     * @return the displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * @param displayName the displayName to set
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the distributable
     */
    public String getDistributable() {
        return distributable;
    }

    /**
     * @param distributable the distributable to set
     */
    public void setDistributable(String distributable) {
        this.distributable = distributable;
    }

    /**
     * @return the contextParams
     */
    public List<ContextParam> getContextParams() {
        return contextParams;
    }

    /**
     * @param contextParams the contextParams to set
     */
    public void setContextParams(List<ContextParam> contextParams) {
        this.contextParams = contextParams;
    }

    /**
     * @return the filters
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * @param filters the filters to set
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * @return the filterMappings
     */
    public List<FilterMapping> getFilterMappings() {
        return filterMappings;
    }

    /**
     * @param filterMappings the filterMappings to set
     */
    public void setFilterMappings(List<FilterMapping> filterMappings) {
        this.filterMappings = filterMappings;
    }

    /**
     * @return the listeners
     */
    public List<Listener> getListeners() {
        return listeners;
    }

    /**
     * @param listeners the listeners to set
     */
    public void setListeners(List<Listener> listeners) {
        this.listeners = listeners;
    }

    /**
     * @return the servlets
     */
    public List<Servlet> getServlets() {
        return servlets;
    }

    /**
     * @param servlets the servlets to set
     */
    public void setServlets(List<Servlet> servlets) {
        this.servlets = servlets;
    }

    /**
     * @return the servletMappings
     */
    public List<ServletMapping> getServletMappings() {
        return servletMappings;
    }

    /**
     * @param servletMappings the servletMappings to set
     */
    public void setServletMappings(List<ServletMapping> servletMappings) {
        this.servletMappings = servletMappings;
    }

    /**
     * @return the sessionConfig
     */
    public String getSessionConfig() {
        return sessionConfig;
    }

    /**
     * @param sessionConfig the sessionConfig to set
     */
    public void setSessionConfig(String sessionConfig) {
        this.sessionConfig = sessionConfig;
    }

    /**
     * @return the mimeMappings
     */
    public List<MimeMapping> getMimeMappings() {
        return mimeMappings;
    }

    /**
     * @param mimeMappings the mimeMappings to set
     */
    public void setMimeMappings(List<MimeMapping> mimeMappings) {
        this.mimeMappings = mimeMappings;
    }

    /**
     * @return the welcomeFileList
     */
    public WelcomeFileList getWelcomeFileList() {
        return welcomeFileList;
    }

    /**
     * @param welcomeFileList the welcomeFileList to set
     */
    public void setWelcomeFileList(WelcomeFileList welcomeFileList) {
        this.welcomeFileList = welcomeFileList;
    }

    /**
     * @return the errorPages
     */
    public List<ErrorPage> getErrorPages() {
        return errorPages;
    }

    /**
     * @param errorPages the errorPages to set
     */
    public void setErrorPages(List<ErrorPage> errorPages) {
        this.errorPages = errorPages;
    }

    /**
     * @return the taglibs
     */
    public List<Taglib> getTaglibs() {
        return taglibs;
    }

    /**
     * @param taglibs the taglibs to set
     */
    public void setTaglibs(List<Taglib> taglibs) {
        this.taglibs = taglibs;
    }

    /**
     * @return the resourceEnvRefs
     */
    public List<ResourceEnvRef> getResourceEnvRefs() {
        return resourceEnvRefs;
    }

    /**
     * @param resourceEnvRefs the resourceEnvRefs to set
     */
    public void setResourceEnvRefs(List<ResourceEnvRef> resourceEnvRefs) {
        this.resourceEnvRefs = resourceEnvRefs;
    }

    /**
     * @return the resourceRefs
     */
    public List<ResourceRef> getResourceRefs() {
        return resourceRefs;
    }

    /**
     * @param resourceRefs the resourceRefs to set
     */
    public void setResourceRefs(List<ResourceRef> resourceRefs) {
        this.resourceRefs = resourceRefs;
    }

    /**
     * @return the securityConstraints
     */
    public List<SecurityConstraint> getSecurityConstraints() {
        return securityConstraints;
    }

    /**
     * @param securityConstraints the securityConstraints to set
     */
    public void setSecurityConstraints(List<SecurityConstraint> securityConstraints) {
        this.securityConstraints = securityConstraints;
    }

    /**
     * @return the loginConfig
     */
    public String getLoginConfig() {
        return loginConfig;
    }

    /**
     * @param loginConfig the loginConfig to set
     */
    public void setLoginConfig(String loginConfig) {
        this.loginConfig = loginConfig;
    }

    /**
     * @return the securityRoles
     */
    public List<SecurityRole> getSecurityRoles() {
        return securityRoles;
    }

    /**
     * @param securityRoles the securityRoles to set
     */
    public void setSecurityRoles(List<SecurityRole> securityRoles) {
        this.securityRoles = securityRoles;
    }

    /**
     * @return the envEntrys
     */
    public List<EnvEntry> getEnvEntrys() {
        return envEntrys;
    }

    /**
     * @param envEntrys the envEntrys to set
     */
    public void setEnvEntrys(List<EnvEntry> envEntrys) {
        this.envEntrys = envEntrys;
    }

    /**
     * @return the ejbRefs
     */
    public List<EjbRef> getEjbRefs() {
        return ejbRefs;
    }

    /**
     * @param ejbRefs the ejbRefs to set
     */
    public void setEjbRefs(List<EjbRef> ejbRefs) {
        this.ejbRefs = ejbRefs;
    }

    /**
     * @return the ejbLocalRefs
     */
    public List<EjbLocalRef> getEjbLocalRefs() {
        return ejbLocalRefs;
    }

    /**
     * @param ejbLocalRefs the ejbLocalRefs to set
     */
    public void setEjbLocalRefs(List<EjbLocalRef> ejbLocalRefs) {
        this.ejbLocalRefs = ejbLocalRefs;
    }

    public String toString() {
        return "[icon: " + icon +
                ", displayName: " + displayName +
                ", description: " + description +
                ", distributable: " + distributable +
                ", contextParam: " + contextParams +
                ", filter: " + filters +
                ", filterMapping: " + filterMappings +
                ", listener: " + listeners +
                ", servlet: " + servlets +
                ", servletMapping: " + servletMappings +
                ", sessionConfig: " + sessionConfig +
                ", mimeMappings: " + mimeMappings +
                ", welcomeFileList: " + welcomeFileList +
                ", errorPages: " + errorPages +
                ", taglibs: " + taglibs +
                ", resourceEnvRefs: " + resourceEnvRefs +
                ", resourceRefs: " + resourceRefs +
                ", securityConstraints: " + securityConstraints +
                ", loginConfig: " + loginConfig +
                ", securityRoles: " + securityRoles +
                ", envEntrys: " + envEntrys +
                ", ejbRefs: " + ejbRefs +
                ", ejbLocalRefs: " + ejbLocalRefs +
                "]";
    }
}
