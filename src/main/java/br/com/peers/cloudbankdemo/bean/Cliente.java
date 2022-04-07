package br.com.peers.cloudbankdemo.bean;

import java.util.UUID;

public class Cliente {
	
	private String id = UUID.randomUUID().toString();
	
	private String nome;
	
	public Cliente() {}
	
	public Cliente(String nome) {
		super();
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	
}
