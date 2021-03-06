package br.com.fourstore.data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.com.fourstore.model.Transaction;
	/**
	 * 
	 * @author mesteves
	 *
	 */
public class TransactionData implements DaoInterface<Transaction>{
	
	/**
	 * 
	 */
	static List<Transaction> transactionsList = new ArrayList<>();
	
	/**
	 * 
	 */
	@Override
	public void save(Transaction transaction) {
		transactionsList.add(transaction);
	}
	
	/**
	 * 
	 */
	@Override
	public List<Transaction> findAll() {
		return transactionsList;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public List<Transaction> findById(UUID id) {
		return transactionsList.stream().filter(tr -> tr.getId() == id).toList();
	}
	
	/**
	 * 
	 * @param transaction
	 * @return
	 */
	public int getIndexOfTransaction(Transaction transaction) {
		return transactionsList.indexOf(transaction);
	}
	
	/**
	 * 
	 */
	@Override
	public void update(Transaction transaction) {
		delete(transaction);
		save(transaction);
	}
	
	/**
	 * 
	 */
	@Override
	public void delete(Transaction transaction) {
		transactionsList.remove(getIndexOfTransaction(transaction));
	}

}
