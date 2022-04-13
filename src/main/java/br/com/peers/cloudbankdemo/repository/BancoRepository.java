package br.com.peers.cloudbankdemo.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.peers.cloudbankdemo.bean.Banco;

@Component
public interface BancoRepository {
	
	public List<Banco> list();
	
	public Banco get(String id);
	
	public Banco add(Banco Banco);
	
	public Banco edit(Banco Banco);
	
	public void remove(String id);

}
