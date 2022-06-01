package br.com.fourstore.model;

import java.time.LocalDate;

import br.com.fourstore.enums.PaymentMethod;

public class Transaction {
	
	Long id;
	
	PaymentMethod metodoDePagamento;
	
	LocalDate dataDeTransacao;
	
	ShoppingCart shoppingCart = new ShoppingCart();
	
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
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

}
