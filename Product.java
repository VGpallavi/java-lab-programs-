package javaact;

public class Product 
{
    String productName;
    double price;
    public void setProductName(String name) 
    {
        this.productName = name;
    }
    public String getProductName() 
    {
        return this.productName;
    }
    public void setPrice(double price) 
    {
        this.price = price;
    }
    public double getPrice() 
    {
        return this.price;
    }
    public static void main(String[] args) 
    {
    	Product product = new Product();
    	product.setProductName("Laptop");
    	product.setPrice(800);
    	System.out.println("Product Name: " + product.getProductName());
    	System.out.println("Price: $" + product.getPrice());
   	}
}
