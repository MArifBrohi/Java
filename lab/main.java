class Product{
	private String name;
	private int quantity;
	private double price;
	
	public product(String name , int quantity , double price)
	{
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public String getName()
	{
		return name;
	}
}
class Store{
	private String name;
	private String location;
	

	public Store(String name , String location)
	{
		this.name = name;
		this.location = location;
	}
	public String getName()
	{
		return name;
	}
	private Product productList[] = new Product[100];
	private nbproduct = 0;
	void addProduct (Product p){
	productList[nbproduct++] = p;
	}
	Boolean searchProduct(String name)
	{
		ifproductList[i].getName()==name)
		return true;
		else 
		return false;
	}
	productList[nbproduct] = null;
	return productList[nbproduct];
	

	
}
