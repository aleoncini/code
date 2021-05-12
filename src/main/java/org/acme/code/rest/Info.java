package org.acme.code.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.acme.code.model.User;
import org.jboss.resteasy.annotations.cache.NoCache;

import io.quarkus.security.identity.SecurityIdentity;

@Path("/info")
public class Info {

    @Inject
    SecurityIdentity identity;

    @GET
    @Path("/aboutme")
    @NoCache
    public User me() {
        return new User(identity);
    }

}
