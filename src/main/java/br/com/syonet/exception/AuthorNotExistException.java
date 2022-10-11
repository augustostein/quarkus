package br.com.syonet.exception;

public class AuthorNotExistException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public AuthorNotExistException( String mensagem ) {
		super( mensagem );
	}
}
