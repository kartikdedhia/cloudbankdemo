package br.com.peers.cloudbankdemo.bean;

public class Banco extends Entity {
	
	private String codigo;
	
	private String nome;
	
	public Banco() {}

	public Banco(String codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
