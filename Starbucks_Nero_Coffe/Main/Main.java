package Entities;

import java.time.LocalDate;


import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1, "Suleyman", "SEBA", LocalDate.of(1926, 4, 5), "1903190310"));
		
		System.out.println("---------");
		
	}
}
