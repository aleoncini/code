package org.acme.code.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.UUID;

@Path("uuid")
public class Code {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response doGet() {
        return Response.status(200).entity("{\"uuid\":\"" + UUID.randomUUID().toString() + "\"}" ).build();
    }
}
