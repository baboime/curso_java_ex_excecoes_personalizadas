package model.excecoes;

// Exception - compilador obriga a tratar ou propagar a exceção
// RuntimeException - compilador NÃO obriga a tratar ou propagar a exceção
public class DominioExcecao extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public DominioExcecao(String msg) {
		super(msg);
	}
}
