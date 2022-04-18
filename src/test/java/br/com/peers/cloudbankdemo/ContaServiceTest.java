package br.com.peers.cloudbankdemo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.peers.cloudbankdemo.bean.Banco;
import br.com.peers.cloudbankdemo.bean.Cliente;
import br.com.peers.cloudbankdemo.bean.Conta;
import br.com.peers.cloudbankdemo.service.BancoService;
import br.com.peers.cloudbankdemo.service.ClienteService;
import br.com.peers.cloudbankdemo.service.ContaService;

@SpringBootTest
class ContaServiceTest {
	
	@Autowired
	ContaService contaService;
	
	@Autowired
	ClienteService clienteService;
	
	@Autowired
	BancoService bancoService;

	@DisplayName("Test Conta Service List()")
    @Test
    void testList() {
        assertFalse(clienteService.list().isEmpty());
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
		
        assertNotNull(contaService.get(conta.getId()));
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
		
        assertFalse(contaService.list().isEmpty());
	}
	
	@DisplayName("Test Conta Service testEdit()")
    @Test
	void testEdit() {

		Cliente cliente = new Cliente("Anderson Fonseca");
		cliente = clienteService.add(cliente);
		
		Banco banco = new Banco("033", "Banco Santander");
		banco = bancoService.add(banco);

		Banco banco1 = new Banco("341", "Banco Itau");
		banco1 = bancoService.add(banco1);
		
		Conta conta = new Conta();
		conta.setBanco(banco);
		conta.setCliente(cliente);
		conta.setNumero(123456789L);
		conta.setDv(0);
		conta = contaService.add(conta);

		Conta contaUpd = contaService.get(conta.getId());
		contaUpd.setBanco(banco1);
        
        Conta contaUpdated = contaService.edit(contaUpd);
        
        assertAll(
      	      "heading",
      	      () -> assertEquals("Banco Itau", contaUpdated.getBanco().getNome()),
      	      () -> assertEquals("Anderson Fonseca", contaUpdated.getCliente().getNome())
      	    );
        
	}
	
	@DisplayName("Test Conta Service testRemove()")
    @Test
	void testRemove() {
		
		Cliente cliente = new Cliente("Anderson Fonseca");
		cliente = clienteService.add(cliente);
		
		Banco banco = new Banco("033", "Banco Santander");
		banco = bancoService.add(banco);
		
		Conta conta = new Conta(banco, cliente, 123456789L, 0);
		conta = contaService.add(conta);

        
		contaService.remove(conta.getId());
        
        assertFalse(contaService.list().isEmpty());
	}

	
}
