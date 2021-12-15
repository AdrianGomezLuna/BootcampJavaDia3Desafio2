package com.desafio2.desafio2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio2.desafio2.model.Order;

@Service
public class ServicesImpl implements ServicesI {
	
	@Autowired
	private OtherServiceI otherService;
	
	@Autowired 
	private PeninsuleServiceI peninsuleService;

	@Override
	public Double calcularTotal(Order order){
			
		if (order.getMelilla()) {
			return otherService.obtenerTotal(order); 
		} else {
			return peninsuleService.obtenerTotal(order);
		}	
	}
	
	

}
