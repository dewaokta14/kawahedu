package id.kawahedu;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return "Hello World Get";
    }
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String post() {
        return "Hello World Post";
    }
    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    public String put() {
        return "Hello World Put";
    }
    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    public String delete() {
        return "Hello World Delete";
    }

}