package com.bit_etland.web.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bit_etland.web.domain.OrderDTO;
@Repository
public class OrderMapperImpl implements OrderMapper{

	@Override
	public void insertOrder(OrderDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<OrderDTO> selectOrderList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDTO> selectOrderByName(String SearchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDTO selectOrder(String SearchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateOrder(OrderDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrder(OrderDTO emp) {
		// TODO Auto-generated method stub
		
	}

}
