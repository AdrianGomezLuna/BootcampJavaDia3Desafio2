package com.desafio2.desafio2.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio2.desafio2.model.Order;
import com.desafio2.desafio2.model.Product;

@Service
public class ServicesImpl implements ServicesI {
	
	@Autowired
	private OtherServiceI otherService;
	
	@Autowired 
	private PeninsuleServiceI peninsuleService;

	@Override
	public Double calcularTotal(Order order){
		
	
		if (order.getMelilla()) {
			// return otherService. 
		} else {
			//return peninsuleService;
		}
	return 0.0;
	}
	
	

}
