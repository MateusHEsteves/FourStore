package br.com.fourstore.model;

import br.com.fourstore.enums.CategoryProduct;
import br.com.fourstore.enums.ColorsProduct;
import br.com.fourstore.enums.DepartmentEnum;
import br.com.fourstore.enums.Size;
import br.com.fourstore.enums.TypeProduct;

public class Product {

	private String sku;
	private String name;
	private Double price;
	private Size size;
	private ColorsProduct color;
	private Integer quantity;
	private TypeProduct type;
	private String description;
	private CategoryProduct category;
	private DepartmentEnum department;

	/**
	 * 
	 * @param sku          é o stock keeping unit que recebe o valor imputado pelo
	 *                     usu�rio para verificar no estoque
	 * @param name         recebe o nome do produto imputado pelo usuario
	 * @param preco        o valor produto que ser� imputado no estoque
	 * @param tamanho      o tamanho do produto que ser� imputado no estoque
	 * @param cor          imputa a caro do produto a ser imputado no estoque
	 * @param quantidade   o tanto de produtos a ser imputado no estoque
	 * @param tipo         qual o produto a ser imputado no estoque
	 * @param descricao    do produto a ser imputado no estoque
	 * @param categoria    do produto a ser imputado no estoque
	 * @param departamento do produto a ser imputado no estoque
	 */
	public Product(String name, Double price, Size size, ColorsProduct color, Integer quantity, TypeProduct type,
			String description, CategoryProduct category, DepartmentEnum department) {

		this.sku = department.getSKUCode() + category.getSKUCode() + type.getSKUCode() + size.getSKUCode()
				+ color.getSKUCode();
		this.name = name;
		this.price = price;
		this.size = size;
		this.color = color;
		this.quantity = quantity;
		this.type = type;
		this.description = description;
		this.category = category;
		this.department = department;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public ColorsProduct getColor() {
		return color;
	}

	public void setColor(ColorsProduct color) {
		this.color = color;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public TypeProduct getType() {
		return type;
	}

	public void setType(TypeProduct type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CategoryProduct getCategory() {
		return category;
	}

	public void setCategory(CategoryProduct category) {
		this.category = category;
	}

	public DepartmentEnum getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentEnum department) {
		this.department = department;
	}

//	@Override
//	public String toString() {
//		return "Produto [sku=" + sku + ", name=" + name + ", preco=" + price + ", tamanho=" + size.getDescription() + ", cor=" + color.getDescription()
//				+ ", quantidade=" + quantity + ", tipo=" + type.getDescription() + ", descricao=" + description + ", categoria="
//				+ category.getDescription() + ", departamento=" + department.getDescription() + "]";
//	}

	public String toString() {
		return "  » SKU: " + sku + "\n" 
			+  "  » NOME: " + name + "\n" 
			+  "  » PREÇO: " + price + "\n" 
			+  "  » TAMANHO: "+ size.getDescription() +  "\n"
	  		+  "  » COR: " + color.getDescription()+  "\n"
			+  "  » QUANTIDADE: " + quantity+  "\n"
			+  "  » TIPO: " + type.getDescription()+  "\n"
			+  "  » DESCRIÇÃO: "+ description+  "\n"
			+  "  » CATEGORIA: "+ category.getDescription()+  "\n"
			+  "  » DEPARTAMENTO "+ department.getDescription()+  "\n";
	}

}
