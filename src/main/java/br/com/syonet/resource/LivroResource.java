package br.com.syonet.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.syonet.entidade.Livro;
import br.com.syonet.java.service.LivroService;

@Path( "/api/livro")
public class LivroResource {

	@Inject
	LivroService service;
	
	@GET
	@Produces( MediaType.APPLICATION_JSON)
	public Response getAllLivros() {
		List<Livro> livros = this.service.getAllLivros();
		return Response.ok( livros ).build();
	}
	
	@GET
	@Path( "/{id}" )
	@Produces( MediaType.APPLICATION_JSON)
	public Response getAllLivros( @PathParam( value="id" ) Integer id ) {
		Livro livro = this.service.getByIdLivro(id);
		return Response.ok( livro ).build();
	}
	
	@POST
	@Produces( MediaType.APPLICATION_JSON)
	@Consumes( MediaType.APPLICATION_JSON)
	public Response saveLivro( Livro livro ) {
		this.service.saveLivro(livro);
		return Response.accepted().build();
	}
	
}
