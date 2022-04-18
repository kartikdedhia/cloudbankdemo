package br.com.peers.cloudbankdemo.bean;

import java.util.Date;

public class Operacao extends Entity {
	
	private Conta conta;
	
	private Date dataOperacao;
	
	private Double valor;
	
	private String tipoOperacao;

	public Operacao(Conta conta, Date dataOperacao, Double valor, String tipoOperacao) {
		super();
		this.conta = conta;
		this.dataOperacao = dataOperacao;
		this.valor = valor;
		this.tipoOperacao = tipoOperacao;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Date getDataOperacao() {
		return dataOperacao;
	}

	public void setDataOperacao(Date dataOperacao) {
		this.dataOperacao = dataOperacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(String tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}
	
}
