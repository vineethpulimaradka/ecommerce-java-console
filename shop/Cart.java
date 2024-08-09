package shop;

import java.util.ArrayList;
import java.util.List;

public class Cart {
      private List<Product> products;
      
      public Cart() {
    	  products=new ArrayList<>();
      }
      
      public void addProduct(Product product) {
          products.add(product);
      }
      
      public void removeProduct(int productId) {
          products.removeIf(product -> product.getId() == productId);
      }
      
      public double calculateTotal() {
          double total = 0.0;
          for (Product product : products) {
              total += product.getPrice() * product.getQuantity();
          }
          return total;
      }
      
      public void showCart() {
          if (products.isEmpty()) {
              System.out.println("Cart is empty.");
          } else {
              for (Product product : products) {
                  System.out.println(product);
              }
          }
      }
      
      public void clear() {
          products.clear();
      }
      
      
      public void generateBill() {
          if (products.isEmpty()) {
              System.out.println("Cart is empty. No bill to generate.");
              return;
          }
          
          System.out.println("Generating Bill...");
          System.out.println("======================================");
          System.out.printf("%-20s %-10s %-10s\n", "Product", "Quantity", "Price");
          System.out.println("======================================");

          for (Product product : products) {
              System.out.printf("%-20s %-10d $%-10.2f\n", product.getName(), product.getQuantity(), product.getPrice() * product.getQuantity());
          }

          System.out.println("======================================");
          System.out.printf("%-20s %-10s $%-10.2f\n", "Total", "", calculateTotal());
          System.out.println("======================================");
      }
  }
      

