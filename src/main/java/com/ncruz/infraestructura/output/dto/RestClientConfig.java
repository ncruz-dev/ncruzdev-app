package com.ncruz.infraestructura.output.dto;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface RestClientConfig {

    @GET
    @Path("/api/characters/{id}")
    DragonBallApiResponse getCharacter(@PathParam("id") Long id);

    @GET
    @Path("/api/characters")
    DragonBallCharactersResponse getCharacters();

}
