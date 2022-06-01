package br.com.fourstore.model;

public class Product {
	
	Integer sku;
	String name;
	Double price;
	String size;
	String color;
	Integer quantity;
	String type;
	String description;
	String category;
	String department;
	
	
	/**
	 * 
	 * @param sku é o stock keeping unit que recebe o valor imputado pelo usu�rio para verificar no estoque 
	 * @param name recebe o nome do produto imputado pelo usuario
	 * @param preco o valor produto que ser� imputado no estoque
	 * @param tamanho o tamanho do produto que ser� imputado no estoque
	 * @param cor imputa a caro do produto a ser imputado no estoque
	 * @param quantidade o tanto de produtos a ser imputado no estoque
	 * @param tipo qual o produto a ser imputado no estoque
	 * @param descricao do produto a ser imputado no estoque
	 * @param categoria do produto a ser imputado no estoque
	 * @param departamento do produto a ser imputado no estoque
	 */
	public Product(String name, Double preco, String tamanho, String cor, Integer quantidade, String tipo,
			String descricao, String categoria, String departamento) {
		
		//TODO refatorar código para gerar SKU automático
		
		this.sku = 0;
		this.name = name;
		this.price = preco;
		this.size = tamanho;
		this.color = cor;
		this.quantity = quantidade;
		this.type = tipo;
		this.description = descricao;
		this.category = categoria;
		this.department = departamento;
	}
	
	public String getNome() {
		return name;
	}
	public void setNome(String name) {
		this.name = name;
	}
	public String getDescricao() {
		return description;
	}
	public void setDescricao(String descricao) {
		this.description = descricao;
	}
	public String getTipo() {
		return type;
	}
	public void setTipo(String tipo) {
		this.type = tipo;
	}
	public String getTamanho() {
		return size;
	}
	public void setTamanho(String tamanho) {
		this.size = tamanho;
	}
	public String getCor() {
		return color;
	}
	public void setCor(String cor) {
		this.color = cor;
	}
	public String getCategoria() {
		return category;
	}
	public void setCategoria(String categoria) {
		this.category = categoria;
	}
	public String getDepartamento() {
		return department;
	}
	public void setDepartamento(String departamento) {
		this.department = departamento;
	}
	public Integer getSku() {
		return sku;
	}
	public void setSku(Integer sku) {
		this.sku = sku;
	}
	public Integer getQuantidade() {
		return quantity;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantity = quantidade;
	}
	public Double getPreco() {
		return price;
	}
	public void setPreco(Double preco) {
		this.price = preco;
	}

	@Override
	public String toString() {
		return "Produto [sku=" + sku + ", name=" + name + ", preco=" + price + ", tamanho=" + size + ", cor=" + color
				+ ", quantidade=" + quantity + ", tipo=" + type + ", descricao=" + description + ", categoria="
				+ category + ", departamento=" + department + "]";
	}
	

}
