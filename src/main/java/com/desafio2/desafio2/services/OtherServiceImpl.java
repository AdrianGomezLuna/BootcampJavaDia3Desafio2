package com.desafio2.desafio2.services;

import org.springframework.stereotype.Service;

import com.desafio2.desafio2.model.Order;

@Service
public class OtherServiceImpl implements OtherServiceI{

	@Override
	public Order obtenerOrder() {
	
		Order order = new Order();
		order.setIdentify(1L);
		order.setDestination("Huelva");
		order.setAddress("calle");
		order.setMelilla(false);
		
		return order;
	}

}
