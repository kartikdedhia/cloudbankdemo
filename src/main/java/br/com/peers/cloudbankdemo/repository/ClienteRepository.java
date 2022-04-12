package br.com.peers.cloudbankdemo.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.peers.cloudbankdemo.bean.Cliente;

@Component
public interface ClienteRepository {
	
	public List<Cliente> list();
	
	public Cliente get(String id);
	
	public Cliente add(Cliente cliente);
	
	public Cliente edit(Cliente cliente);
	
	public void remove(String id);

}
