package br.com.peers.cloudbankdemo.bean;

public class Conta extends Entity {

	private Banco banco;
	
	private Cliente cliente;
	
	private Long numero;
	
	private Integer dv;
	
	public Conta() {
		super();
	}

	public Conta(Banco banco, Cliente cliente, Long numero, Integer dv) {
		super();
		this.banco = banco;
		this.cliente = cliente;
		this.numero = numero;
		this.dv = dv;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Integer getDv() {
		return dv;
	}

	public void setDv(Integer dv) {
		this.dv = dv;
	}
	
}
