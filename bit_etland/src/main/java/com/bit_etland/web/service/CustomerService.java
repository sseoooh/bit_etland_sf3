package com.bit_etland.web.service;

import java.util.List;
import java.util.Map;

import com.bit_etland.web.domain.CustomerDTO;
import com.bit_etland.web.proxy.Proxy;




public interface CustomerService {
	//C
	public void registCustomer(CustomerDTO cus);
	//R
	public List<CustomerDTO> bringCustomerList(Proxy pxy);
	public List<CustomerDTO> retrieveCustomerByName(Proxy pxy);
	public CustomerDTO retrieveCustomer(CustomerDTO cus);
	public int countCustomer(Proxy pxy);
	public boolean existsCustomer(Proxy pxy);
	//U
	public void modifyCustomer(CustomerDTO cus);
	public Map<String,Object> fileUpload(Proxy pxy);
	//D
	public void removeCustomer(CustomerDTO cus);
	public Map<String, Object> retrievePhone(Proxy pxy);
	
}
