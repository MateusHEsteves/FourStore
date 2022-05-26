package br.com.fourstore.service;

import java.util.List;

import br.com.fourstore.data.TransactionData;
import br.com.fourstore.model.Transaction;

public class TransactionService {

	TransactionData db = new TransactionData();

	public void create(Transaction transaction) {
		db.save(transaction);
	}

	public List<Transaction> readAll() {
		return db.findAll();
	}

	public void update(Transaction transaction) {
	}

	public void delete(Transaction transaction) {
	}

}
