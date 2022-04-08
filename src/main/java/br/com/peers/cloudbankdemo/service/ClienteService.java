package br.com.peers.cloudbankdemo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.peers.cloudbankdemo.bean.Cliente;

@RestController
public class ClienteService {

	private Map<String, Cliente> clientes = new HashMap<String, Cliente>();
	
	public ClienteService() {
		Cliente c = new Cliente("Anderson Fonseca");
		clientes.put(c.getId(), c);
	}
	
	@GetMapping("/clientes")
	public List<Cliente> list() {	
		return new ArrayList<Cliente>(this.clientes.values());
	}
	
	@GetMapping("/clientes/{id}")
	public Cliente get(@PathParam("id") String id) {	
		return this.clientes.get(id);
	}
	
	@PostMapping("/clientes")
	public Cliente add(@RequestBody Cliente cliente) {
		cliente.setId(UUID.randomUUID().toString());
		clientes.put(cliente.getId(), cliente);
		return cliente;
	}
	
}
