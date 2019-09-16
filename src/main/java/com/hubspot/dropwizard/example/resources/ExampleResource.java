package com.hubspot.dropwizard.example.resources;

import com.hubspot.dropwizard.example.extras.Service;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.TEXT_PLAIN)
@Singleton
public class ExampleResource {

  private final Service service;

  @Inject
  public ExampleResource(Service service) {
    this.service = service;
  }

  @GET
  public String sayHello() {
    return "Hello, World! " + service;
  }
}
