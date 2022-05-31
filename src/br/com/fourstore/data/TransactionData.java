package br.com.fourstore.data;

import java.util.ArrayList;
import java.util.List;

import br.com.fourstore.model.Transaction;

public class TransactionData implements DaoInterface<Transaction>{
	
	List<Transaction> transactionsList = new ArrayList<>();

	@Override
	public void save(Transaction transaction) {
		transactionsList.add(transaction);
	}
	
	@Override
	public List<Transaction> findAll() {
		return transactionsList;
	}

	public int getIndexOfTransaction(Transaction transaction) {
		return transactionsList.indexOf(transaction);
	}
	
	@Override
	public void update(Transaction transaction) {
		delete(transaction);
		save(transaction);
	}
		
	@Override
	public void delete(Transaction transaction) {
		transactionsList.remove(getIndexOfTransaction(transaction));
	}

}
