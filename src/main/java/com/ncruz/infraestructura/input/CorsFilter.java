package com.ncruz.infraestructura.input;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.ext.Provider;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Provider
public class CorsFilter implements ContainerResponseFilter {

    @ConfigProperty(name = "cors.allowed.origins", defaultValue = "http://localhost:4200")
    String allowedOrigins;

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) {
        // Agregar headers CORS a todas las respuestas
        responseContext.getHeaders().add("Access-Control-Allow-Origin", allowedOrigins);
        responseContext.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        responseContext.getHeaders().add("Access-Control-Allow-Headers", "accept, authorization, content-type, x-requested-with, origin");
        responseContext.getHeaders().add("Access-Control-Max-Age", "86400");
    }
}
