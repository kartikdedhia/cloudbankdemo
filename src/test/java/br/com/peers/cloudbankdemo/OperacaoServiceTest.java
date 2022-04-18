package br.com.peers.cloudbankdemo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.peers.cloudbankdemo.bean.Banco;
import br.com.peers.cloudbankdemo.bean.Cliente;
import br.com.peers.cloudbankdemo.bean.Conta;
import br.com.peers.cloudbankdemo.bean.Operacao;
import br.com.peers.cloudbankdemo.service.BancoService;
import br.com.peers.cloudbankdemo.service.ClienteService;
import br.com.peers.cloudbankdemo.service.ContaService;
import br.com.peers.cloudbankdemo.service.OperacaoService;

@SpringBootTest
class OperacaoServiceTest {
	
	Logger logger = LoggerFactory.getLogger(OperacaoServiceTest.class);
	
	@Autowired
	ContaService contaService;
	
	@Autowired
	ClienteService clienteService;
	
	@Autowired
	BancoService bancoService;
	
	@Autowired
	OperacaoService operacaoService;
	

	@DisplayName("Test Operacao Service List()")
    @Test
    void testList() {
        assertFalse(operacaoService.list().isEmpty());
    }

	@DisplayName("Test Conta Service testGet()")
    @Test
	void testGet() {
		
		Cliente cliente = new Cliente("Anderson Fonseca");
		cliente = clienteService.add(cliente);
		
		Banco banco = new Banco("033", "Banco Santander");
		banco = bancoService.add(banco);
		
		Conta conta = new Conta(banco, cliente, 123456789L, 0);
		conta = contaService.add(conta);
		
		Operacao operacao = new Operacao(conta, new Date(), 100.00, "C");
		operacaoService.add(operacao);
		
		logger.debug(operacao.toString());
		
        assertNotNull(operacaoService.get(operacao.getId()));
	}
	
	@DisplayName("Test Conta Service testAdd()")
    @Test
	void testAdd() {
		
		Cliente cliente = new Cliente("Anderson Fonseca");
		cliente = clienteService.add(cliente);
		
		Banco banco = new Banco("033", "Banco Santander");
		banco = bancoService.add(banco);
		
		Conta conta = new Conta(banco, cliente, 123456789L, 0);
		conta = contaService.add(conta);
		
		Operacao operacao = new Operacao(conta, new Date(), 100.00, "C");
		operacaoService.add(operacao);
		
        assertFalse(operacaoService.list().isEmpty());
	}

	
}
