package com.example.hello.model;

import java.time.LocalDate;

public class StockDTO {
	
	private Long id;
	private String name;
	private Double price;
	private LocalDate date;
	private Double variacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Double getVariacao() {
		return variacao;
	}
	public void setVariacao(Double variacao) {
		this.variacao = variacao;
	}
	
}
