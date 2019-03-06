package com.bit_etland.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.OrderDTO;



@Component
public interface OrderMapper {
	public void insertOrder(OrderDTO emp);
	//R
	public List<OrderDTO> selectOrderList();
	public List<OrderDTO> selectOrderByName(String SearchWord);
	public OrderDTO selectOrder(String SearchWord);
	public int countOrder();

	//U
	public void updateOrder(OrderDTO emp);
	//D
	public void deleteOrder(OrderDTO emp);
}
