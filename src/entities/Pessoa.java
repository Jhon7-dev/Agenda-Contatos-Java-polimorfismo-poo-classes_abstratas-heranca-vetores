package entities;

public class Pessoa  {
	private Contato contatos[];
	private String nome;
	private int max; // maximo de contatos (tamanho do vetor)
	private int cont; // contador de contatos inseridos
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	public Pessoa(String nome,int max) {
		this.max = max;
		this.nome = nome;
		this.contatos = new Contato[max];
		this.cont = 0;
	}
	public void adicionarContato(Contato c) {
		if(cont<max) {
			this.contatos[cont] = c;
			this.cont++;
		}else {
			System.out.println("Lista de contatos cheia!");
		}
	}
	
	
	
	
	
	
	public Contato[] getContato() {
		return this.contatos;
	}
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int[] max) {
		this.max = max;
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	
}
