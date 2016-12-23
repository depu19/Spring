package org.deepa.spring.security.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.deepa.spring.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements UserOrderService{
	
	private static final String FILE_PATH = "c:\\Users\\ds8\\study\\test.txt";

	public void placeUserOrder(Order order) {
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH,true));

			oos.writeObject(order);
			System.out.println("Done");

		} catch (Exception ex) {
			ex.getMessage();
		}
		
		
	}

	public List<Order> getAllOrders() {
		Order order = null;ObjectInputStream ois=null;
		 List<Order> orderList = new ArrayList<Order>();
		try{
			while(true){
				ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
				orderList.add((Order) ois.readObject());
			}
		

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			if(ois != null)
			{
				try {
					ois.close();
				} catch (IOException e) {
					e.getMessage();
				}
			}
	        
	    }
		return orderList;
	}

}
