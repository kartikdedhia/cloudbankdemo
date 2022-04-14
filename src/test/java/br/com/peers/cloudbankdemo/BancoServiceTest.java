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
import br.com.peers.cloudbankdemo.service.BancoService;

@SpringBootTest
class BancoServiceTest {
	
	@Autowired
	BancoService bancoService;

	@DisplayName("Test Banco Service List()")
    @Test
    void testList() {
        assertFalse(bancoService.list().isEmpty());
    }

	@DisplayName("Test Banco Service testGet()")
    @Test
	void testGet() {
		
		Banco banco = new Banco("033", "Banco Santander");
		bancoService.add(banco);
		
        assertNotNull(bancoService.get(banco.getId()));
	}
	
	@DisplayName("Test Banco Service testAdd()")
    @Test
	void testAdd() {
		
		Banco banco = new Banco("033", "Banco Santander");
		bancoService.add(banco);
		
        assertFalse(bancoService.list().isEmpty());
	}
	
	@DisplayName("Test Banco Service testEdit()")
    @Test
	void testEdit() {
		
		Banco banco = new Banco("033", "Banco Santander");
		bancoService.add(banco);
		
        Banco bancoOld = bancoService.get(banco.getId());
        bancoOld.setCodigo("077");
        bancoOld.setNome("Banco Inter");
        
        bancoService.edit(bancoOld);
        
        Banco bancoUpdated = bancoService.get(bancoOld.getId());
        
        assertAll(
        	      "heading",
        	      () -> assertEquals("Banco Inter", bancoUpdated.getNome()),
        	      () -> assertEquals("077", bancoUpdated.getCodigo())
        	    );
	}
	
	@DisplayName("Test Banco Service testRemove()")
    @Test
	void testRemove() {
		
		Banco banco = new Banco("033", "Anderson Fonseca");
		bancoService.add(banco);
        
        bancoService.remove(banco.getId());
        
        assertFalse(bancoService.list().isEmpty());
	}

	
}
