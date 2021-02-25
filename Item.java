package Ecommerce;

public class Item {
	private int productId;
	private int count;
	private double price;
	
	public Item(Product product,int count) {
		 this.productId = product.getId();
	     this.count = count;
	     this.price = product.getprice() * count;
	}
	
	  public double getPrice() {
	        return price;
	    }
	  
	  public String toString() {
		  return "Item{" +
	                "productId=" + productId +
	                ", count=" + count +
	                ", price=" + price +
	                '}';
	  }
	  
	  public void updateCount(int newCount) {
		  price = (price/count)*newCount;
		  count=newCount;
	  }

}
