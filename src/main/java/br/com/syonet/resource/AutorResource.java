package br.com.syonet.resource;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.syonet.entidade.Autor;
import br.com.syonet.java.service.AutorService;

@Path( "/api/autor" )
public class AutorResource {
	
	@Inject
	AutorService service;

	@GET
	@javax.ws.rs.Produces( MediaType.APPLICATION_JSON )
		public Response getAllAutor() {
		List<Autor> autores = this.service.getAllAutors();
		return Response.ok( autores ).build();
	}
	
	@GET
	@Path( "/{id}" )
	@javax.ws.rs.Produces( MediaType.APPLICATION_JSON )
		public Response getAllAutor( @PathParam( value = "id" ) Integer id) {
		Autor autor = this.service.getByIdAutor(id);
		return Response.ok( autor ).build();
	}
	
	@POST
	@Produces( MediaType.APPLICATION_JSON )
	@Consumes( MediaType.APPLICATION_JSON )
	public Response saveAutor( Autor autor) {
		this.service.saveAutor(autor);
		return Response.accepted().build();
	}
}
