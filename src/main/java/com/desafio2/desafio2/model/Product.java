package com.desafio2.desafio2.model;

public class Product {
	
	private Long identify;
	
	private String name;

	private double price;
	
	private double priceSinIva;

	public Long getIdentify() {
		return identify;
	}

	public void setIdentify(Long identify) {
		this.identify = identify;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public double getPriceSinIva() {
		return priceSinIva;
	}

	public void setPriceSinIva(double priceSinIva) {
		this.priceSinIva = priceSinIva;
	}
	
	
}
