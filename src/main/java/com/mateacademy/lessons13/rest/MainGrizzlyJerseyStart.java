package com.mateacademy.lessons13.rest;

import com.sun.jersey.api.container.grizzly.GrizzlyWebContainerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MainGrizzlyJerseyStart  {
    public static void main(String[] args) throws IOException {
        final String baseUri = "http://localhost:9998/";
        final Map<String, String> initParams = new HashMap<String, String>();

        initParams.put("com.sun.jersey.config.property.packages", "com.mateacademy.lessons13.rest");
        initParams.put("com.sun.jersey.api.json.POJOMappingFeature", "true");

        System.out.println("Starting grizzly...");
        GrizzlyWebContainerFactory.create(baseUri, initParams);
        System.out
                .println(String.format("Jersey started with WADL available at %sapplication.wadl.", baseUri, baseUri));
    }
}


