package br.com.syonet.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import br.com.syonet.entidade.Livro;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class LivroRepository implements ILivroRepository, PanacheRepositoryBase<Livro, Integer>{
	
	@Override
	@Transactional
	public void saveLivro( Livro livro ) {
		this.persist( livro );
	}
	
	@Override
	public List< Livro > getAllLivros() {
		return this.findAll().list();
	}

	@Override
	public Livro getByIdLivro ( Integer id ) {
		return this.findById(id);
	}
}
