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

import br.com.peers.cloudbankdemo.bean.Banco;
import br.com.peers.cloudbankdemo.repository.BancoRepository;

@RestController
@RequestMapping("/bancos")
public class BancoService {

	@Autowired
	private BancoRepository bancoRepository;
	
	@GetMapping
	public List<Banco> list() {	
		return bancoRepository.list();
	}
	
	@GetMapping("/{id}")
	public Banco get(@PathParam("id") String id) {	
		return bancoRepository.get(id);
	}
	
	@PostMapping
	public Banco add(@RequestBody Banco cliente) {
		return bancoRepository.add(cliente);
	}
	
	@PutMapping
	public Banco edit(@RequestBody Banco cliente) {
		return bancoRepository.edit(cliente);
	}
	
	@DeleteMapping("/{id}")
	public void remove(@PathParam("id") String id) {
		bancoRepository.remove(id);
	}
	
}
