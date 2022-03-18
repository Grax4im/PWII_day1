package com.example.demo;

import javax.inject.Singleton;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 */

@Path("/exercicio/{km}")
@Singleton
public class HelloController {

    @POST
    public Double sayHello(@PathParam("km") Double km) {
        return km * 0.621371;
    }
}
