package xml.web.valueobject.test;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;
import org.simpleframework.xml.transform.RegistryMatcher;

import xml.web.transform.ErrorCodeTypeTransform;
import xml.web.transform.ExceptionTypeTypeTransform;
import xml.web.transform.JspFileTypeTransform;
import xml.web.transform.ServletClassTypeTransform;
import xml.web.transform.ServletNameTypeTransform;
import xml.web.transform.UrlPatternTypeTransform;
import xml.web.type.ErrorCodeType;
import xml.web.type.ExceptionTypeType;
import xml.web.type.JspFileType;
import xml.web.type.ServletClassType;
import xml.web.type.ServletNameType;
import xml.web.type.UrlPatternType;
import xml.web.valueobject.ContextParam;
import xml.web.valueobject.EjbLocalRef;
import xml.web.valueobject.EjbRef;
import xml.web.valueobject.EnvEntry;
import xml.web.valueobject.ErrorPage;
import xml.web.valueobject.Filter;
import xml.web.valueobject.FilterMapping;
import xml.web.valueobject.Icon;
import xml.web.valueobject.Listener;
import xml.web.valueobject.MimeMapping;
import xml.web.valueobject.ResourceEnvRef;
import xml.web.valueobject.ResourceRef;
import xml.web.valueobject.SecurityConstraint;
import xml.web.valueobject.SecurityRole;
import xml.web.valueobject.Servlet;
import xml.web.valueobject.ServletMapping;
import xml.web.valueobject.Taglib;
import xml.web.valueobject.WebApp;
import xml.web.valueobject.WelcomeFileList;

/**
 * Test objects for use with SimpleXML to read/write web.xml
 * 
 * @author Mark Bernard
 */
public class WebAppTest {
    /**
     * Test starting point
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String args[]) throws Exception {
        System.out.println("Start: " + new Date());
        
        String filePath = System.getProperty("user.home") + "/SimpleObjectTest/web.xml";
        if(args.length > 0) {
            filePath = args[0];
        }
        RegistryMatcher matcher = new RegistryMatcher();
        matcher.bind(ErrorCodeType.class, ErrorCodeTypeTransform.class);
        matcher.bind(ExceptionTypeType.class, ExceptionTypeTypeTransform.class);
        matcher.bind(ServletClassType.class, ServletClassTypeTransform.class);
        matcher.bind(JspFileType.class, JspFileTypeTransform.class);
        matcher.bind(UrlPatternType.class, UrlPatternTypeTransform.class);
        matcher.bind(ServletNameType.class, ServletNameTypeTransform.class);
        Serializer serializer = new Persister(matcher, new Format(4, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"));

        WebApp webApp = new WebApp(getIcon(), getDisplayName(), getDescription(), getDistributable(), 
                getContextParams(), getFilters(), getFilterMappings(), getListeners(), getServlets(), 
                getServletMappings(), getSessionConfig(), getMimeMappings(), getWelcomeFileList(), 
                getErrorPages(), getTaglibs(), getResourceEnvRefs(), getResourceRefs(), 
                getSecurityConstraints(), getLoginConfig(), getSecurityRoles(), getEnvEntrys(), 
                getEjbRefs(), getEjbLocalRefs());
        
        serializer.write(webApp, new OutputStreamWriter(new FileOutputStream(filePath), "UTF-8"));

        System.out.println("  End: " + new Date());
    }
    
    /**
     * @return the icons
     */
    public static Icon getIcon() {
        return null;
    }

    /**
     * @return the displayName
     */
    public static String getDisplayName() {
        return "Test File";
    }

    /**
     * @return the description
     */
    public static String getDescription() {
        return "Test SimpleXML object tree";
    }

    /**
     * @return the distributable
     */
    public static String getDistributable() {
        return null;
    }

    /**
     * @return the contextParams
     */
    public static List<ContextParam> getContextParams() {
        return null;
    }

    /**
     * @return the filters
     */
    public static List<Filter> getFilters() {
        List<Filter> filters = new ArrayList<Filter>();
        filters.add(new Filter(null, "Test Filter 1", null, null, "com.testdomain.package.filter.Class", null));
        return filters;
    }

    /**
     * @return the filterMappings
     */
    public static List<FilterMapping> getFilterMappings() {
        List<FilterMapping> filterMappings = new ArrayList<FilterMapping>();
        filterMappings.add(new FilterMapping("Test Filter 1", new UrlPatternType("/filter1")));
        return filterMappings;
    }

    /**
     * @return the listeners
     */
    public static List<Listener> getListeners() {
        List<Listener> listeners = new ArrayList<Listener>();
        listeners.add(new Listener("com.testdomain.package.listener.Class"));
        return listeners;
    }

    /**
     * @return the servlets
     */
    public static List<Servlet> getServlets() {
        List<Servlet> servlets = new ArrayList<Servlet>();
        servlets.add(new Servlet("Test Servlet 1", null, null, new ServletClassType("com.testdomain.package.servlet.Class"), null));
        return servlets;
    }

    /**
     * @return the servletMappings
     */
    public static List<ServletMapping> getServletMappings() {
        List<ServletMapping> servletMappings = new ArrayList<ServletMapping>();
        servletMappings.add(new ServletMapping("Test Servlet 1", "/testservlet"));
        return servletMappings;
    }

    /**
     * @return the sessionConfig
     */
    public static String getSessionConfig() {
        return null;
    }

    /**
     * @return the mimeMappings
     */
    public static List<MimeMapping> getMimeMappings() {
        return null;
    }

    /**
     * @return the welcomeFileList
     */
    public static WelcomeFileList getWelcomeFileList() {
        return null;
    }

    /**
     * @return the errorPages
     */
    public static List<ErrorPage> getErrorPages() {
        return null;
    }

    /**
     * @return the taglibs
     */
    public static List<Taglib> getTaglibs() {
        return null;
    }

    /**
     * @return the resourceEnvRefs
     */
    public static List<ResourceEnvRef> getResourceEnvRefs() {
        return null;
    }

    /**
     * @return the resourceRefs
     */
    public static List<ResourceRef> getResourceRefs() {
        return null;
    }
    /**
     * @return the securityConstraints
     */
    public static List<SecurityConstraint> getSecurityConstraints() {
        return null;
    }

    /**
     * @return the loginConfig
     */
    public static String getLoginConfig() {
        return null;
    }

    /**
     * @return the securityRoles
     */
    public static List<SecurityRole> getSecurityRoles() {
        return null;
    }

    /**
     * @return the envEntrys
     */
    public static List<EnvEntry> getEnvEntrys() {
        return null;
    }

    /**
     * @return the ejbRefs
     */
    public static List<EjbRef> getEjbRefs() {
        return null;
    }

    /**
     * @return the ejbLocalRefs
     */
    public static List<EjbLocalRef> getEjbLocalRefs() {
        return null;
    }
}
