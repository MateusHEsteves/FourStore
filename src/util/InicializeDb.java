package util;

import br.com.fourstore.data.ProductData;
import br.com.fourstore.model.Product;

public class InicializeDb {
	
	
	
	public InicializeDb() {
		inicializeDB();
	}

	public static void inicializeDB() {
		
		ProductData db = new ProductData();
		
		Product product1 = new Product("Moletom", 100.00, "GG", "Verde", 50, "Inverno", null, "Masculino",
				"Vestuário");
		
		
		Product product2 = new Product("Calça", 30.00, "G", "Jeans", 30, "Verão", null, "Feminino",
				"Vestuário");
		
		Product product3 = new Product("Cueca/Calcinha", 20.00, "G", "Branco", 20, "Verão", null, "Unissex",
				"Vestuário");
		
		Product product4 = new Product("Meia", 10.00, "P", "Preta", 10, "Verão", null, "Unissex",
				"Vestuário");
		
		Product product5 = new Product("Blusa", 40.00, "M", "Azul", 40, "Verão", null, "Masculino",
				"Vestuário");
		
		Product product6 = new Product("Blusa", 60.00, "P", "Vermelho", 60, "Verão", null, "Feminino",
				"Vestuário");
		
		Product product7 = new Product("Calça Moletom", 80.00, "G", "Preta", 80, "Inverno", null, "Unissex",
				"Vestuário");
		
		Product product8 = new Product("Camisa Social", 90.00, "M", "Branca", 90, "Verão", null, "Masculino",
				"Vestuário");
		
		Product product9 = new Product("Camisa Social", 70.00, "P", "Branca", 70, "Verão", null, "Feminino",
				"Vestuário");
		
		Product product10 = new Product("Bermuda", 50.00, "GG", "Preta", 100, "Verão", null, "Masculino",
				"Vestuário");
		
		db.save(product1);
		db.save(product2);
		db.save(product3);
		db.save(product4);
		db.save(product5);
		db.save(product6);
		db.save(product7);
		db.save(product8);
		db.save(product9);
		db.save(product10);
		
	}

}
