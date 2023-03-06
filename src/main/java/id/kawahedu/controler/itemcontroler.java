package id.kawahedu.controler;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/item")
@Produces(MediaType.TEXT_PLAIN)
public class itemcontroler {
    @Path("/id")
    @GET
    public String getid() {
        return "ini id";
    }
    @Path("/name")
    @GET
    public String getname() {
        return "ini nama";
    }
    @Path("/count")
    @GET
    public String getcount() {
        return "ini count";
    }
    @Path("/price")
    @GET
    public String getprice() {
        return "ini price";
    }
    @Path("/type")
    @GET
    public String gettype() {
        return "ini type";
    }
    @Path("/description")
    @GET
    public String getdescription() {
        return "ini description";
    }
    @Path("/createdAt")
    @GET
    public String getcreatedAt() {
        return "ini createdAt";
    }
    @Path("/updatedAt")
    @GET
    public String getupdatedAt() {
        return "ini updatedAt";
    }
    
}
