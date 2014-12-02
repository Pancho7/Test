package com.infosistema.test;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

@Path("/Test")
public class Test {

	

	@GET
	@Path("/a")
	@Produces(MediaType.APPLICATION_JSON)
	public Response PostPromotionByQRCode(@Context HttpServletRequest request, @Context UriInfo ui, @Context HttpHeaders hh) {
		try {	
			return Response.status(Status.OK).header("Access-Control-Allow-Origin", "*").entity("Rest").build();
		} 
		catch (Exception e) {
			return Response.status(Status.BAD_REQUEST).header("Access-Control-Allow-Origin", "*").entity("Rest").build();
		}
	}

}
