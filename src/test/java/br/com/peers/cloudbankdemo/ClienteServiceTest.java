package br.com.peers.cloudbankdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.peers.cloudbankdemo.bean.Cliente;
import br.com.peers.cloudbankdemo.service.ClienteService;

@SpringBootTest
public class ClienteServiceTest {
	
	@Autowired
	ClienteService clienteService;

	@DisplayName("Test Cliente Service List()")
    @Test
    void testList() {
        assertFalse(clienteService.list().isEmpty());
    }

	@DisplayName("Test Cliente Service testGet()")
    @Test
	void testGet() {
		
		Cliente cliente = new Cliente("Anderson Fonseca");
		clienteService.add(cliente);
		
        assertNotNull(clienteService.get(cliente.getId()));
	}
	
	@DisplayName("Test Cliente Service testAdd()")
    @Test
	void testAdd() {
		
		Cliente cliente = new Cliente("Anderson Fonseca");
		clienteService.add(cliente);
		
        assertFalse(clienteService.list().isEmpty());
	}
	
	@DisplayName("Test Cliente Service testEdit()")
    @Test
	void testEdit() {
		
		Cliente cliente = new Cliente("Anderson Fonseca");
		clienteService.add(cliente);
		
        Cliente clienteOld = clienteService.get(cliente.getId());
        clienteOld.setNome("Sandra Fonseca");
        
        clienteService.edit(clienteOld);
        
        Cliente clienteUpdated = clienteService.get(clienteOld.getId());
        
        assertEquals("Sandra Fonseca", clienteUpdated.getNome());
        
	}
	
	@DisplayName("Test Cliente Service testRemove()")
    @Test
	void testRemove() {
		
		Cliente cliente = new Cliente("Anderson Fonseca");
		clienteService.add(cliente);
        
        clienteService.remove(cliente.getId());
        
        assertFalse(clienteService.list().isEmpty());
	}

	
}
