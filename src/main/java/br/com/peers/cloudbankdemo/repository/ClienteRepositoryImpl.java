package br.com.peers.cloudbankdemo.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.peers.cloudbankdemo.bean.Cliente;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository {
	
	private Map<String, Cliente> clientes = new HashMap<String, Cliente>();

	public List<Cliente> list() {	
		return new ArrayList<Cliente>(this.clientes.values());
	}
	
	public Cliente get(String id) {	
		return this.clientes.get(id);
	}
	
	public Cliente add(Cliente cliente) {
		cliente.setId(UUID.randomUUID().toString());
		clientes.put(cliente.getId(), cliente);
		return cliente;
	}
	
	public Cliente edit(Cliente cliente) {
		
		if (clientes.containsKey(cliente.getId())) {
			clientes.put(cliente.getId(), cliente);
		}

		return cliente;
	}
	
	public void remove(String id) {
		
		if (clientes.containsKey(id)) {
			clientes.remove(id);
		}
	}

}
