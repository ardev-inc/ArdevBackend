package ar.org.config.core;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer
        extends
        AbstractAnnotationConfigDispatcherServletInitializer {

    private static final String REST_MAPPINGS = "/api/*";

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfiguracion.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{REST_MAPPINGS};
    }
}
