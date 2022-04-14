package br.com.peers.cloudbankdemo.service;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.peers.cloudbankdemo.bean.Cliente;
import br.com.peers.cloudbankdemo.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> list() {	
		return clienteRepository.list();
	}
	
	@GetMapping("/{id}")
	public Cliente get(@PathParam("id") String id) {	
		return clienteRepository.get(id);
	}
	
	@PostMapping
	public Cliente add(@RequestBody Cliente cliente) {
		return clienteRepository.add(cliente);
	}
	
	@PutMapping
	public Cliente edit(@RequestBody Cliente cliente) {
		return clienteRepository.edit(cliente);
	}
	
	@DeleteMapping("/{id}")
	public void remove(@PathParam("id") String id) {
		clienteRepository.remove(id);
	}
	
}
