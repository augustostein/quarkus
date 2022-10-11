package br.com.syonet.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.syonet.entidade.Autor;
import br.com.syonet.repository.IAutorRepository;

@ApplicationScoped
public class AutorService {
	
	@Inject
	IAutorRepository repository;
	
	public void saveAutor(Autor autor ) {
		this.repository.saveAutor( autor );
	}
	
	public List< Autor > getAllAutors() {
		return this.repository.getAllAutors();
	}
	
	public Autor getByIdAutor ( Integer id ) {
		return this.repository.getByIdAutor (id);
	}

}
