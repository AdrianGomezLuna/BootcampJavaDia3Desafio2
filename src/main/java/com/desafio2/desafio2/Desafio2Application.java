package com.desafio2.desafio2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafio2.desafio2.model.Order;
import com.desafio2.desafio2.model.Product;
import com.desafio2.desafio2.services.ServicesI;

@SpringBootApplication
public class Desafio2Application implements CommandLineRunner{
	
	@Autowired
	private ServicesI servicios;

    public static void main(String[] args) {
            SpringApplication.run(Desafio2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    	
    	//Creación de productos
		List<Product> productos = new ArrayList<>();
		Product producto1 = new Product();
		producto1.setIdentify(1L);
		producto1.setName("Raton");
		producto1.setPrice(20.50);
		productos.add(producto1);
		
		Product producto2 = new Product();
		producto2.setIdentify(2L);
		producto2.setName("Teclado");
		producto2.setPrice(23.50);
		productos.add(producto2);
		
		//Creación de pedidos
		List<Order> orders = new ArrayList<>();
		Order order1 = new Order();
        
    	System.err.println("Total " + servicios.calcularTotal());
    }

}
