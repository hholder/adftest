package ky.gov;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("gov")
@Consumes("application/json")
@Produces("application/json")
public class Person {
    public Person() {
    }

    @javax.ws.rs.DELETE
    public void deleteData(String content) {

        // Provide method implementation.

    }

    @javax.ws.rs.POST
    public Response postData(String content) {

        // Provide method implementation.
        // TODO

        throw new UnsupportedOperationException();
    }

    @javax.ws.rs.GET
    public String getData() {

        // Provide method implementation.
        // TODO

        throw new UnsupportedOperationException();
    }

    @javax.ws.rs.PUT
    public String putData(String content) {

        // Provide method implementation.
        // TODO

        throw new UnsupportedOperationException();
    }
}
