package util;

import br.com.fourstore.data.ProductData;
import br.com.fourstore.enums.CategoryProduct;
import br.com.fourstore.enums.ColorsProduct;
import br.com.fourstore.enums.DepartmentEnum;
import br.com.fourstore.enums.Size;
import br.com.fourstore.enums.TypeProduct;
import br.com.fourstore.model.Product;

public class InicializeDb {
	
	public InicializeDb() {
		inicializeDB();
	}

	public static void inicializeDB() {
		
		ProductData db = new ProductData();
		
		Product product1 = new Product("Moletom", 100.00, Size.GG0, ColorsProduct.GREEN, 50, TypeProduct.WINTER,
				"Moletom com estampa do capitão américa", CategoryProduct.MALE, DepartmentEnum.CLOTHES);
		
		Product product2 = new Product("Bracelete", 100.00, Size.M00, ColorsProduct.WHITE, 30, TypeProduct.AUTUMN,
				"Calça Jogger social", CategoryProduct.FEMININE, DepartmentEnum.ACCESSORIES);
		
		Product product3 = new Product("Cueca", 20.00, Size.G00, ColorsProduct.WHITE, 20, TypeProduct.SUMMER,
				"Cueca de microfibra", CategoryProduct.MALE, DepartmentEnum.CLOTHES);
		
		Product product4 = new Product("Meia", 10.00, Size.P00, ColorsProduct.BLACK, 10, TypeProduct.SPRING,
				"Meia soquete", CategoryProduct.MALE, DepartmentEnum.CLOTHES);
		
		Product product5 = new Product("Blusa", 40.00, Size.M00, ColorsProduct.BLUE, 40, TypeProduct.AUTUMN,
				"Blusa com estampa de caveira", CategoryProduct.MALE, DepartmentEnum.CLOTHES);
		
		Product product6 = new Product("Blusa", 40.00, Size.P00, ColorsProduct.RED, 60, TypeProduct.SUMMER,
				"Blusa com estampa floral", CategoryProduct.FEMININE, DepartmentEnum.CLOTHES);

		Product product7 = new Product("Calça Moletom", 80.00, Size.G00, ColorsProduct.BLACK, 80, TypeProduct.WINTER,
				"Calça de moletom lisa", CategoryProduct.MALE, DepartmentEnum.CLOTHES);
		
		Product product8 = new Product("Camisa Social", 90.00, Size.M00, ColorsProduct.WHITE, 90, TypeProduct.SUMMER,
				"Camisa social para terno masculino", CategoryProduct.MALE, DepartmentEnum.CLOTHES);
		
		Product product9 = new Product("Camisa Social", 70.00, Size.P00, ColorsProduct.WHITE, 70, TypeProduct.SUMMER,
				"Camisa social para terno feminino", CategoryProduct.FEMININE, DepartmentEnum.CLOTHES);
		
		Product product10 = new Product("Bermuda", 50.00, Size.GG0, ColorsProduct.BLACK, 10, TypeProduct.SUMMER,
				"Moletom com estampa do capitão américa", CategoryProduct.MALE, DepartmentEnum.CLOTHES);
		
		Product product11 = new Product("Macacão", 75.00, Size.RN0, ColorsProduct.GRAY, 55, TypeProduct.SUMMER,
				"Moletom com estampa do capitão américa", CategoryProduct.BABY, DepartmentEnum.CLOTHES);
		
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
		db.save(product11);
	}

}
