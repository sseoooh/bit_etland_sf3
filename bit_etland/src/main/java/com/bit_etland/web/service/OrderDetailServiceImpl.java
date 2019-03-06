package com.bit_etland.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bit_etland.web.domain.OrderDetailDTO;
@Service
public class OrderDetailServiceImpl implements OrderDetailService{

	@Override
	public void registOrderDetail(OrderDetailDTO emp) {
		
	}

	@Override
	public List<OrderDetailDTO> bringOrderDetailList() {
		return null;
	}

	@Override
	public List<OrderDetailDTO> retrieveOrderDetailByName(String SearchWord) {
		return null;
	}

	@Override
	public OrderDetailDTO retrieveOrderDetail(String SearchWord) {
		return null;
	}

	@Override
	public int countOrderDetail() {
		return 0;
	}

	@Override
	public boolean existsOrderDetail(String searchWord) {
		return false;
	}

	@Override
	public void modifyOrderDetail(OrderDetailDTO emp) {
		
	}

	@Override
	public void removeOrderDetail(OrderDetailDTO emp) {
		
	}

}
