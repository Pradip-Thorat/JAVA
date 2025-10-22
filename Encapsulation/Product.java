package Encapsulation;

public class Product {
	
	private int productId;
	private String productName;
	private Category category;
	
	//Setter and Getter for category
	public void setCategory(Category category)
	{
		this.category=category;
	}
	public Category getCategory()
	{
		return this.category;
	}
	
	//setProduct(1) Setter and Conditional Getter for productId
	public void setProductId(int productId)
	{
		this.productId=productId;
	}
	public int getProductId(int code)
	{
		if(code==123)
			return this.productId;
		else
			return -1;
	}
	
	//Setter and Getter for productName
	public void setProductName(String productName)
	{
		this.productName=productName;
	}
	public String getProductName()
	{
		return this.productName;
	}

}
