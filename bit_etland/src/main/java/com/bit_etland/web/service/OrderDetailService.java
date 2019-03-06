package com.bit_etland.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.OrderDetailDTO;

@Component
public interface OrderDetailService {
	public void registOrderDetail(OrderDetailDTO emp);
	//R
	public List<OrderDetailDTO> bringOrderDetailList();
	public List<OrderDetailDTO> retrieveOrderDetailByName(String SearchWord);
	public OrderDetailDTO retrieveOrderDetail(String SearchWord);
	public int countOrderDetail();
	public boolean existsOrderDetail(String searchWord);
	//U
	public void modifyOrderDetail(OrderDetailDTO emp);
	//D
	public void removeOrderDetail(OrderDetailDTO emp);
}
