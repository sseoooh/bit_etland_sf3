package com.bit_etland.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.OrderDTO;



@Component
public interface OrderService {
	public void registOrder(OrderDTO emp);
	//R
	public List<OrderDTO> bringOrderList();
	public List<OrderDTO> retrieveOrderByName(String SearchWord);
	public OrderDTO retrieveOrder(String SearchWord);
	public int countOrder();
	public boolean existsOrder(String searchWord);
	//U
	public void modifyOrder(OrderDTO emp);
	//D
	public void removeOrder(OrderDTO emp);
}
