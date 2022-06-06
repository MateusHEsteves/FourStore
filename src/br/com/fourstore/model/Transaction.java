package br.com.fourstore.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

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
	private UUID id;
	private String cpf;
	private PaymentMethod metodoDePagamento;
	private LocalDate dataDeTransacao;
	private ShoppingCart shoppingCart;
	
	/**
	 * 
	 */
	public Transaction() {
		this.id = UUID.randomUUID();
		this.dataDeTransacao =  LocalDate.now();
		this.shoppingCart = new ShoppingCart();
	}
	
	/**
	 * 
	 * @return
	 */
	public UUID getId() {
		return id;
	}
	
	/**
	 * 
	 * @param id
	 */
	public void setId(UUID id) {
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
		return 	"\n  » ID DA TRANSAÇÃO: " + id + "\n" 
			+   ((cpf.isBlank())? "" : "  » CPF/CNPJ: " + cpf + "\n") 
			+   "  » MÉTODO DE PAGAMENTO: " + metodoDePagamento.getName() + "\n" 
			+   "  » DATA DA TRANSAÇÃO: "+ dataDeTransacao.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")) +  "\n"
		  	+   "  » VALOR TOTAL: R$" + shoppingCart.subTotalValue();
	}

}

	