package br.com.syonet.repository;

import java.util.List;

import br.com.syonet.entidade.Livro;

public interface ILivroRepository {
	
	void saveLivro( Livro livro );
	
	List< Livro > getAllLivros();
	
	Livro getByIdLivro ( Integer id );

}
