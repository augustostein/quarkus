package br.com.syonet.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.Id;

import br.com.syonet.business.NullPointerException;
import br.com.syonet.entidade.Livro;
import br.com.syonet.repository.ILivroRepository;

@ApplicationScoped
public class LivroService {

	@Inject
	ILivroRepository repository;
	
	public void saveLivro( Livro livro ) {
		this.repository.saveLivro( livro );
	}
	
	public List< Livro > getAllLivros() {
		return this.repository.getAllLivros();
	}
	
	public Livro getByIdLivro ( Integer id ) {
		return this.repository.getByIdLivro(id);
	}
	
}

//public void salva( Livro registro ) {
//	if ( Objects.isNull( registro.getTitulo() ) ) {
//		throw new NullPointerException ( "Titulo não pode ser nulo!");
//		
//	}
//
//	if (Objects.isNull(registro.getAutor())) {
//		throw new NullPointerException("Nome do autor não pode ser nulo!");