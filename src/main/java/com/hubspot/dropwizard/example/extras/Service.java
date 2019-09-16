package com.hubspot.dropwizard.example.extras;

import com.hubspot.dropwizard.example.ExampleConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Service {

    private static final Logger LOG = LoggerFactory.getLogger(Service.class);

    private final ExampleConfiguration exampleConfiguration;

    public Service(ExampleConfiguration exampleConfiguration) {
        this.exampleConfiguration = exampleConfiguration;
        LOG.info("Created service with config {}", exampleConfiguration);
    }
}
