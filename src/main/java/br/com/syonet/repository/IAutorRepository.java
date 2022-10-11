package br.com.syonet.repository;

import java.util.List;

import br.com.syonet.entidade.Autor;

public interface IAutorRepository {
	
	void saveAutor( Autor autor );
	
	List< Autor > getAllAutors();
	
	Autor getByIdAutor ( Integer id );
	

}

