package br.com.peers.cloudbankdemo.bean;

public class Banco extends Entity {
	
	private String nome;
	
	public Banco() {}
	
	public Banco(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
