package com.bit_etland.web.service;

import java.util.List;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bit_etland.web.domain.CustomerDTO;
import com.bit_etland.web.proxy.Proxy;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Override
	public void registCustomer(CustomerDTO cus) {
		
	}

	@Override
	public List<CustomerDTO> bringCustomerList(Proxy pxy) {
		return null;
	}

	@Override
	public List<CustomerDTO> retrieveCustomerByName(Proxy pxy) {
		return null;
	}

	@Override
	public CustomerDTO retrieveCustomer(CustomerDTO cus) {
		return null;
	}

	@Override
	public int countCustomer(Proxy pxy) {
		return 0;
	}

	@Override
	public boolean existsCustomer(Proxy pxy) {
		return false;
	}

	@Override
	public void modifyCustomer(CustomerDTO cus) {
		
	}

	@Override
	public Map<String, Object> fileUpload(Proxy pxy) {
		return null;
	}

	@Override
	public void removeCustomer(CustomerDTO cus) {
		
	}

	@Override
	public Map<String, Object> retrievePhone(Proxy pxy) {
		return null;
	}

}
