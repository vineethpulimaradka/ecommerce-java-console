package shop;

import java.util.Scanner;

public class Shop {
      public static void main(String[] args) {
	      Scanner scanner=new Scanner(System.in);
	      Product[] products= {
	    		  new Product(1, "Men's T-Shirt", 19.99, 10, "Fashion", "Men"),
	              new Product(2, "Men's Jeans", 39.99, 20, "Fashion", "Men"),
	              
	              new Product(3, "Women's Dress", 29.99, 15, "Fashion", "Women"),
	              new Product(4, "Women's T-Shirt", 19.99, 25, "Fashion", "Women"),
	              // Fashion: Children
	              new Product(5, "Children's T-Shirt", 9.99, 30, "Fashion", "Children"),
	              new Product(6, "Children's Jeans", 19.99, 20, "Fashion", "Children"),
	              // Electronics
	              new Product(7, "Smartphone", 299.99, 50, "Electronics", ""),
	              new Product(8, "Laptop", 999.99, 15, "Electronics", ""),
	              // Groceries
	              new Product(9, "Apple", 0.99, 100, "Groceries", ""),
	              new Product(10, "Banana", 0.59, 150, "Groceries", ""),
	      };
	      
	      
	      Cart cart=new Cart();
	      
	      boolean running=true;
	      
	      while(running) {
	    	  System.out.println("Welcome to the Shopping Console!");
	            System.out.println("1. View Products");
	            System.out.println("2. Add Product to Cart");
	            System.out.println("3. View Cart");
	            System.out.println("4. Checkout");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();
	            
	            switch(choice) {
	            case 1:
	            	System.out.println("Choose a category:");
                    System.out.println("1. Fashion");
                    System.out.println("2. Electronics");
                    System.out.println("3. Groceries");
                    System.out.print("Choose an option: ");
                    int categoryChoice = scanner.nextInt();
	            
                    switch(categoryChoice) {
                    case 1:
                    	System.out.println("Choose a subcategory:");
                        System.out.println("1. Men");
                        System.out.println("2. Women");
                        System.out.println("3. Children");
                        System.out.print("Choose an option: ");
                        int subcategoryChoice = scanner.nextInt();
                        String subcategory = "";
                        if (subcategoryChoice == 1) subcategory = "Men";
                        else if (subcategoryChoice == 2) subcategory = "Women";
                        else if (subcategoryChoice == 3) subcategory = "Children";
                        System.out.println("Available Products (Fashion - " + subcategory + "):");
                        for (Product product : products) {
                            if (product.getCategory().equalsIgnoreCase("Fashion") && product.getSubcategory().equalsIgnoreCase(subcategory)) {
                                System.out.println(product);
                            }
                        }
                        break;
                        
                        
                    case 2:
                        System.out.println("Available Products (Electronics):");
                        for (Product product : products) {
                            if (product.getCategory().equalsIgnoreCase("Electronics")) {
                                System.out.println(product);
                            }
                        }
                        
                        break;
                        
                        
                    case 3:
                        System.out.println("Available Products (Groceries):");
                        for (Product product : products) {
                            if (product.getCategory().equalsIgnoreCase("Groceries")) {
                                System.out.println(product);
                            }
                        }
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
                break;
                
                
                
	            case 2:
                    System.out.print("Enter the product ID to add to cart: ");
                    int productId = scanner.nextInt();
                    Product productToAdd = null;
                    for (Product product : products) {
                        if (product.getId() == productId) {
                            productToAdd = product;
                            break;
                        }
                    }
                    if (productToAdd != null) {
                        System.out.print("Enter the quantity: ");
                        int quantity = scanner.nextInt();
                        if (quantity <= productToAdd.getQuantity()) {
                            productToAdd.setQuantity(quantity);
                            cart.addProduct(productToAdd);
                            System.out.println("Product added to cart.");
                        } else {
                            System.out.println("Insufficient stock.");
                        }
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 3:
                    System.out.println("Your Cart:");
                    cart.showCart();
                    break;
                case 4:
                    System.out.println("Checkout:");
                    cart.generateBill();
                    cart.clear();
                    System.out.println("Thank you for your purchase!");
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
	      scanner.close();           
                        
                    }
	            }
	    	  
	      
	
            
          
