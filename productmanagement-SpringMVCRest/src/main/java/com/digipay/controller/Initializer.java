package com.digipay.controller;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringRestConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {return null;}

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
