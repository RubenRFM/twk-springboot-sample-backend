package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Product;
import com.example.demo.repositories.ProductRepository;

@SpringBootApplication
public class StoreBackendApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(StoreBackendApplication.class, args);
		
	}
	
	public void run(String... args) throws Exception {
		Product p = new Product();
		p.setCodeProduct("9803030");
		p.setDescription("Televisor");
		
		productRepository.save(new Product("ABC1", "Serrucho"));
		productRepository.save(new Product("XZAA", "Martillo"));
		productRepository.save(new Product("PEPE", "Alargador"));
		productRepository.save(new Product("POEE", "Destornillador"));
		productRepository.save(p);
		
	}

	
	
}
