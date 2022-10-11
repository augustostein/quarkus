package br.com.syonet.exception;


public class RecordNullException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public RecordNullException(String mensagem) {
		super(mensagem);
	}
}

