
public class Customer {
	public String name;
	public String address;
	public String zip;
	public String city;
	public boolean currentlyActive;
	public ProductList prodList;
	public double billTotal;
	public int counter;
	//public double billAmount;
	
	public Customer(){
		name = "";
		address= "";
		zip = "";
		city= "";
		currentlyActive = false;
		prodList = null;
		billTotal = 0.0;
		counter = 0;
	}
	public Customer(String aName, String anAddress, String aZip, String aCity, boolean active, ProductList products, int ct){
		name= aName;
		address= anAddress;
		zip= aZip;
		city= aCity;
		currentlyActive = active;
		prodList= products;
		billTotal= products.getBillAmount();
		counter = ct;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String getZip(){
		return zip;
	}
	public String getCity(){
		return city;
		
	}
	public boolean getCustomerStatus(){
		return currentlyActive;
	}
	public ProductList getList(){
		return prodList;
	}
	public double getBill(){
		return billTotal;
	}
	public String toString(){
		return "Name: " + name + " Address: "+ address + " " + city + ", " +
				zip + "\nProduct: " + prodList;
	}
	

}
