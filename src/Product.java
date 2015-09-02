
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Product {
	public String name;
	public String deliveryPeriod;
	public Calendar lastDeliveredOn;
	public double price;
	
	
	public Product(){
		
		name = "";
		deliveryPeriod = "";
		lastDeliveredOn = null;
		price = 0.0;
	}
	public Product(String str, String period, Calendar date, double cost){
		
		name = str;
		deliveryPeriod = period;
		lastDeliveredOn = date;
		price = cost;
	}
	public String getName(){
		return name;
	}
	public String getPeriod(){
		return deliveryPeriod;
	}
	public Calendar getLastDeliveredDate(){
		return lastDeliveredOn;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double number)
	{
		price = number;
	}
	public void setName(String aName){
		name = aName;
	}
	public void setDeliveryPeriod(String periodLength){
		deliveryPeriod = periodLength;
	}
	public void setLastDeliveredDate(Calendar aDate){
	  lastDeliveredOn = aDate;
	}
	public String toString(){
		return "Product Title: " + name + " Delivered: " + deliveryPeriod +
				" Last Delivered On: " + lastDeliveredOn + " Price: " + price;
	}
	
	
	
}
