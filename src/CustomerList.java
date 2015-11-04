import java.util.*;

import java.util.LinkedList;
import java.util.ListIterator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class CustomerList {
	//i made achange
	
	LinkedList<Customer> customerList = new LinkedList<Customer>();
	ListIterator<Customer> iterator = customerList.listIterator();
	public CustomerList(){
		//customerList = new LinkedList<Customer>();
	}
	public void addCustomer(Customer newCustomer){
		//customerList.addFirst(newCustomer);
	}
	public int size(){///more comments
		return customerList.size();
	}
	public void remove(Customer removeThis){
		iterator = customerList.listIterator();
		while(iterator.hasNext()){
			Customer t = iterator.next();
			if((t.name).equals(removeThis.name)){
				customerList.remove(t);
			}
		}
		
	}
	public String toString(){
		iterator = customerList.listIterator();
		String returnString = "";
		while(iterator.hasNext()){
			Customer t = iterator.next();
			returnString += t.toString();
	}
		return returnString;
	
}
//	public void createDeliveryList(Calendar cal){
//		LinkedList<Customer> todaysList = new LinkedList<Customer>();
//
//		iterator = customerList.listIterator();
//		while(iterator.hasNext()){
//			Customer t = iterator.next();
//			t.prodList.
//		}
//	}
	}
