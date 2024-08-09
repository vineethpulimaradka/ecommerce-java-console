package shop;

public class Product {
	private int id;
	private String name;
	private double price;
	private int quantity;
	private String category;
	private String subcategory;
	
	public Product(int id,String name,double price,int quantity,String category,String subcategory) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		this.category=category;
		this.subcategory=subcategory;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	public String getCategory() {
		return category;
	}
	
	public String getSubcategory() {
		return subcategory;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", category=" + category + ", subcategory=" + subcategory + "]";
		 
	}
   
}
