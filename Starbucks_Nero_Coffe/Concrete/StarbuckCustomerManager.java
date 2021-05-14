package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbuckCustomerManager extends BaseCustomerManager {

	private CustomerCheckService _customerCheckService;

	public StarbuckCustomerManager() {
		this._customerCheckService = _customerCheckService;
	}

	@Override
	public void save(Customer customer) {

		if (_customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("Not a valid person ");
		}
	}
}
