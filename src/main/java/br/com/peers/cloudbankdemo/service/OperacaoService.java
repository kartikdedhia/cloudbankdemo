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

import br.com.peers.cloudbankdemo.bean.Operacao;
import br.com.peers.cloudbankdemo.repository.OperacaoRepository;

@RestController
@RequestMapping("/operacoes")
public class OperacaoService {

	@Autowired
	private OperacaoRepository operacaoRepository;
	
	@GetMapping
	public List<Operacao> list() {	
		return operacaoRepository.list();
	}
	
	@GetMapping("/{id}")
	public Operacao get(@PathParam("id") String id) {	
		return operacaoRepository.get(id);
	}
	
	@PostMapping
	public Operacao add(@RequestBody Operacao operacao) {
		return operacaoRepository.add(operacao);
	}

}
