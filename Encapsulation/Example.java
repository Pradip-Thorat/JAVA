package Encapsulation;

public class Example {
	
	public static void main(String[] args) {
		
		Product p1=new Product();
		p1.setProductId(25);
		p1.setProductName("Laptop");
		
		Category category = new Category(1,"Electronics");
		p1.setCategory(category);
		
		if(p1.getProductId(123)!=-1)
			System.out.println("Product id is "+p1.getProductId(13));
		else
			System.out.println("Invalid code");
		
		System.out.println("Product Id is "+p1.getProductId(123));
		System.out.println("Product Name is "+p1.getProductName());
		System.out.println("Category for product is "+p1.getCategory().getCategoryId()+" and "+p1.getCategory().getCategoryName());
		
	}

}
