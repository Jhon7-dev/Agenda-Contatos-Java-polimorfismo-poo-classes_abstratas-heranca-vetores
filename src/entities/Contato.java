package entities;

public abstract class Contato {
	protected String tipo;
	
	public Contato() {
		// TODO Auto-generated constructor stub
	}

	public Contato(String tipo) {
		this.tipo = tipo;
	}
	
	public abstract void exibir();
	
}
