package com.company;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/Sonnet")
public class Client {
    @GET
    @Path("/sonnet")
    @Produces(MediaType.APPLICATION_JSON)
    public List getInJSON() {
        List listSonnet = new ArrayList();
        Sonnet p1 = new Sonnet();
        p1.setId( 1 );
        p1.setName( "sonnet1" );
        Sonnet p2 = new Sonnet();
        p2.setId( 2 );
        p2.setName( "sonnet2" );
        listSonnet.add( p1 );
        listSonnet.add( p2 );
        return listSonnet;
    }
}
