package br.com.peers.cloudbankdemo.bean;

import java.util.UUID;

public class Entity {
	
	private String id = UUID.randomUUID().toString();
	
	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

}
