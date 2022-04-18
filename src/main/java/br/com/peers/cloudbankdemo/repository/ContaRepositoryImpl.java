package br.com.peers.cloudbankdemo.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.peers.cloudbankdemo.bean.Conta;

@Repository
public class ContaRepositoryImpl implements ContaRepository {
	
	private Map<String, Conta> contas = new HashMap<>();

	public List<Conta> list() {	
		return new ArrayList<>(this.contas.values());
	}
	
	public Conta get(String id) {	
		return this.contas.get(id);
	}
	
	public Conta add(Conta conta) {
		conta.setId(UUID.randomUUID().toString());
		contas.put(conta.getId(), conta);
		return conta;
	}
	
	public Conta edit(Conta conta) {
		
		if (contas.containsKey(conta.getId())) {
			contas.put(conta.getId(), conta);
		}

		return conta;
	}
	
	public void remove(String id) {
		
		if (contas.containsKey(id)) {
			contas.remove(id);
		}
	}

}
