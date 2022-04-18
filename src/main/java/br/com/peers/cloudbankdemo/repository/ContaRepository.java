package br.com.peers.cloudbankdemo.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.peers.cloudbankdemo.bean.Conta;

@Component
public interface ContaRepository {
	
	public List<Conta> list();
	
	public Conta get(String id);
	
	public Conta add(Conta conta);
	
	public Conta edit(Conta conta);
	
	public void remove(String id);

}
