package br.com.syonet.exception;

public class IdNotExistException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public IdNotExistException( String mensagem ) {
		super(mensagem);
	}

}
