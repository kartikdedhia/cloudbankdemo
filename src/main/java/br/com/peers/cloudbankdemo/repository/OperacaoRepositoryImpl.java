package br.com.peers.cloudbankdemo.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.peers.cloudbankdemo.bean.Operacao;

@Repository
public class OperacaoRepositoryImpl implements OperacaoRepository {
	
	private Map<String, Operacao> operacaos = new HashMap<>();

	public List<Operacao> list() {	
		return new ArrayList<>(this.operacaos.values());
	}
	
	public Operacao get(String id) {	
		return this.operacaos.get(id);
	}
	
	public Operacao add(Operacao operacao) {
		operacao.setId(UUID.randomUUID().toString());
		operacaos.put(operacao.getId(), operacao);
		return operacao;
	}
	
	public Operacao edit(Operacao operacao) {
		
		if (operacaos.containsKey(operacao.getId())) {
			operacaos.put(operacao.getId(), operacao);
		}

		return operacao;
	}
	
	public void remove(String id) {
		
		if (operacaos.containsKey(id)) {
			operacaos.remove(id);
		}
	}

}
