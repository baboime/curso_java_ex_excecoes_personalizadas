package model.excecoes;

// Exception - compilador obriga a tratar ou propagar a exce��o
// RuntimeException - compilador N�O obriga a tratar ou propagar a exce��o
public class DominioExcecao extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public DominioExcecao(String msg) {
		super(msg);
	}
}
