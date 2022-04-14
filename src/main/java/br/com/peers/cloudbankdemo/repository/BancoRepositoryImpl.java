package br.com.peers.cloudbankdemo.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.peers.cloudbankdemo.bean.Banco;

@Repository
public class BancoRepositoryImpl implements BancoRepository {
	
	private Map<String, Banco> bancos = new HashMap<>();

	public List<Banco> list() {	
		return new ArrayList<Banco>(this.bancos.values());
	}
	
	public Banco get(String id) {	
		return this.bancos.get(id);
	}
	
	public Banco add(Banco banco) {
		banco.setId(UUID.randomUUID().toString());
		bancos.put(banco.getId(), banco);
		return banco;
	}
	
	public Banco edit(Banco banco) {
		
		if (bancos.containsKey(banco.getId())) {
			bancos.put(banco.getId(), banco);
		}

		return banco;
	}
	
	public void remove(String id) {
		
		if (bancos.containsKey(id)) {
			bancos.remove(id);
		}
	}

}
