package br.com.peers.cloudbankdemo.bean;

public class Cliente extends Entity {
	
	private String nome;
	
	public Cliente() {}
	
	public Cliente(String nome) {
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
