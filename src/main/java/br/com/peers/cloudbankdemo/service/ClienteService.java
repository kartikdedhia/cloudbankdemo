package br.com.peers.cloudbankdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.peers.cloudbankdemo.bean.Cliente;

@RestController
public class ClienteService {

	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public ClienteService() {
		clientes.add(new Cliente("Anderson Fonseca"));
		
	}
	
	@GetMapping("/clientes")
	public List<Cliente> list() {	
		return this.clientes;
	}
	
	@PostMapping("/clientes")
	public Cliente add(@RequestBody Cliente cliente) {
		this.clientes.add(cliente);
		return cliente;
	}
	
}
