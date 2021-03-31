package restwebservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("restwebservice")
@Consumes("application/json")
@Produces("application/json")
public class GenericResource {
    public GenericResource() {
    }

    @POST
    public Response postData(String data) {

        // Provide method implementation.
        // TODO

        throw new UnsupportedOperationException();
    }

    @GET
    public String getData() {

        // Provide method implementation.
        // TODO

        throw new UnsupportedOperationException();
    }
}
