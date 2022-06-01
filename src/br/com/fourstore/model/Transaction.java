package br.com.fourstore.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import br.com.fourstore.enums.PaymentMethod;

public class Transaction {
	
	Long id;
	
	PaymentMethod metodoDePagamento;
	
	LocalDate dataDeTransacao;
	
	
	Map<Product, Integer> shoppingCart = new HashMap<>();
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public PaymentMethod getMetodoDePagamento() {
		return metodoDePagamento;
	}
	public void setMetodoDePagamento(PaymentMethod metodoDePagamento) {
		this.metodoDePagamento = metodoDePagamento;
	}
	public LocalDate getDataDeTransacao() {
		return dataDeTransacao;
	}
	public void setDataDeTransacao(LocalDate dataDeTransacao) {
		this.dataDeTransacao = dataDeTransacao;
	}
	public Map<Product, Integer> getProduto() {
		return produto;
	}
	public void setProduto(Map<Product, Integer> produto) {
		this.produto = produto;
	}
	

}
