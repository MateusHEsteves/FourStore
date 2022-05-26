package br.com.fourstore.data;

import java.util.ArrayList;
import java.util.List;

import br.com.fourstore.model.Transaction;

public class TransactionData {
	
	List<Transaction> transactionsList = new ArrayList<>();

	public void save(Transaction transaction) {
		transactionsList.add(transaction);
	}

	public List<Transaction> findAll() {
		return transactionsList;
	}

	public int getIndexOfTransaction(Transaction transaction) {
		return transactionsList.indexOf(transaction);
	}

	public void update(Transaction transaction) {
		delete(transaction);
		save(transaction);
	}

	public void delete(Transaction transaction) {
		transactionsList.remove(getIndexOfTransaction(transaction));
	}

}
