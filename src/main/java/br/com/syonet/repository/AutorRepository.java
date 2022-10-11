package br.com.syonet.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import br.com.syonet.entidade.Autor;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class AutorRepository implements IAutorRepository, PanacheRepositoryBase<Autor, Integer> {

	@Override
	@Transactional
	public void saveAutor( Autor autor ) {
		this.persist(autor);
    	}
	
	@Override
	public List< Autor > getAllAutors() {
		return this.findAll().list();
	}
	
	@Override
	public Autor getByIdAutor ( Integer id ) {
		return this.findById(id);
	}
	
}
