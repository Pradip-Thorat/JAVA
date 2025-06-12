package ClassesAndObjects;

import java.nio.channels.InterruptedByTimeoutException;

public class Product {
	
	int productId;
	String productName;
	int productPrice;
	
	Product(int productId,String productName,int productPrice ) 
// Constructor- immidiately call after object creation & name always same as class name. 
	{
//		System.out.println("Product object created");
		
		this.productId=productId;
		this.productName=productName;
		this.productPrice=productPrice;
	}
	
	Product()
	{
		
	} 
}
