package Encapsulation;

public class Category {
	
	private int categoryId;
	private String categoryName;
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
//	The parameterized constructor initializes both fields directly.
	public Category(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
	
//	The default constructor allows you to create an empty Category object first, and then use setters later.	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
}
