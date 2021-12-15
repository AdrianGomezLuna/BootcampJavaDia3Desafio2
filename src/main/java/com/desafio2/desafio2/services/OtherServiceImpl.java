package com.desafio2.desafio2.services;

import org.springframework.stereotype.Service;

import com.desafio2.desafio2.model.Order;

@Service
public class OtherServiceImpl implements OtherServiceI{

	
	@Override
	public Double obtenerTotal(Order order) {
		Double total = 0D;
		
		for (int i = 0; i < order.getProduct().size(); i++) {
			total = total + order.getProduct().get(i).getPrice();
		}
				
		return total*1.04;
	}

}
