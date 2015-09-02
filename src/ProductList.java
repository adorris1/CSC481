import java.util.*;

import java.util.LinkedList;
import java.util.ListIterator;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class ProductList
{
	LinkedList<Product> publications = new LinkedList<Product>();
	ListIterator<Product> iterator = publications.listIterator();
	public ProductList(){
		publications = new LinkedList<Product>();
	}
	public void addProduct(Product newProduct){
		publications.add(newProduct);
	}
	public int size(){
		return publications.size();
	}
	public void remove(Product removeThis){
		iterator = publications.listIterator();
		while(iterator.hasNext()){
			Product t = iterator.next();
			if((t.name).equals(removeThis.name)){
				publications.remove(t);
			}
		}
		
	}
	public double getBillAmount(){
		double total = 0.0;
		iterator = publications.listIterator();
		while(iterator.hasNext()){
			Product t = iterator.next();
			total += t.price;
		}
		return total;
	}
	
	public String toString() {
		iterator = publications.listIterator();
		String returnString= "";
		while(iterator.hasNext()){
			Product t = iterator.next();
			returnString += t.toString();
	}
		return returnString;
	
	}
}

