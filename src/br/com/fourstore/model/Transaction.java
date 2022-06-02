package br.com.fourstore.model;

import java.time.LocalDate;

import br.com.fourstore.enums.PaymentMethod;

/**
 * 
 * @author mesteves
 *
 */
public class Transaction {
	
	/**
	 * 
	 */
	private Long id;
	private String cpf;
	private PaymentMethod metodoDePagamento;
	private LocalDate dataDeTransacao;
	private ShoppingCart shoppingCart;
	
	/**
	 * 
	 */
	public Transaction() {
		this.shoppingCart = new ShoppingCart();
	}
	
	/**
	 * 
	 * @return
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * 
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}
		
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * 
	 * @return
	 */
	public PaymentMethod getMetodoDePagamento() {
		return metodoDePagamento;
	}
	
	/**
	 * 
	 * @param metodoDePagamento
	 */
	public void setMetodoDePagamento(PaymentMethod metodoDePagamento) {
		this.metodoDePagamento = metodoDePagamento;
	}
	
	/**
	 * 
	 * @return
	 */
	public LocalDate getDataDeTransacao() {
		return dataDeTransacao;
	}

	/**
	 * 
	 * @param dataDeTransacao
	 */
	public void setDataDeTransacao(LocalDate dataDeTransacao) {
		this.dataDeTransacao = dataDeTransacao;
	}

	/**
	 * 
	 * @return
	 */
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	
	/**
	 * 
	 * @param shoppingCart
	 */
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
	@Override
	public String toString() {
		return "Transação id=" + id + ((cpf.isBlank())? "" : "cpf=" + cpf) + ", metodoDePagamento = " + metodoDePagamento + ", dataDeTransacao = "
				+ dataDeTransacao + ", valor Total = " + shoppingCart.subTotalValue() + "]";
	}

}
