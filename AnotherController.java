package com.example.demo;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;

@Path("/exercicio2/{nos}")
@Singleton
public class AnotherController {


    @GET
    @Produces(MediaType.APPLICATION_JSON)

    public Auxiliar sayHello(@PathParam("nos") Double nos) {
        Double km = nos * 1.1852;
        Auxiliar u = new Auxiliar();
        u.setKm(km);
        return u;
    }
}
