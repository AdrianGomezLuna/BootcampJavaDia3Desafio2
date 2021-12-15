package com.desafio2.desafio2.model;

import java.util.List;

public class Order {
	
	private Long identify;
	
	private List<Product> product;
	
	private String destination;
	
	private String address;
	
	private Boolean melilla;

	public Long getIdentify() {
		return identify;
	}

	public void setIdentify(Long identify) {
		this.identify = identify;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getMelilla() {
		return melilla;
	}

	public void setMelilla(Boolean melilla) {
		this.melilla = melilla;
	}
	
	

}
