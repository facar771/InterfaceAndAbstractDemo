package _dorduncuGunOdev.Concrete;

import _dorduncuGunOdev.Entities.Customer;
import _dorduncuGunOdev.interfaces.CustomerCheckService;

public class robotUyguluması implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		System.out.println("robot doğrulaması uygulandı ");
		return false;
	}
	
}
