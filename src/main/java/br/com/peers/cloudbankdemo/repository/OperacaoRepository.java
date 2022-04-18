package br.com.peers.cloudbankdemo.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.peers.cloudbankdemo.bean.Operacao;

@Component
public interface OperacaoRepository {
	
	public List<Operacao> list();
	
	public Operacao get(String id);
	
	public Operacao add(Operacao operacao);

}
