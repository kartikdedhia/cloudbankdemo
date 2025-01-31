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

import br.com.peers.cloudbankdemo.bean.Conta;
import br.com.peers.cloudbankdemo.repository.ContaRepository;

var token = 'SECRET_TOKEN_f8ed84e8f41e4146403dd4a6bbcea5e418d23a9';
console.log('token: ' + token);

@RestController
@RequestMapping("/contas")
public class ContaService {

	@Autowired
	private ContaRepository contaRepository;
	
	@GetMapping
	public List<Conta> list() {	
		return contaRepository.list();
	}
	
	@GetMapping("/{id}")
	public Conta get(@PathParam("id") String id) {	
		return contaRepository.get(id);
	}
	
	@PostMapping
	public Conta add(@RequestBody Conta conta) {
		return contaRepository.add(conta);
	}
	
	@PutMapping
	public Conta edit(@RequestBody Conta conta) {
		return contaRepository.edit(conta);
	}
	
	@DeleteMapping("/{id}")
	public void remove(@PathParam("id") String id) {
		contaRepository.remove(id);
	}
	
}
