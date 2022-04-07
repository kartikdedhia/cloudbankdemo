package br.com.peers.cloudbankdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Bank API", version = "2.0", description = "Bank Information"))
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
