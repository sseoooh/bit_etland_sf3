package com.bit_etland.web.mapper;

import java.util.List;

import com.bit_etland.web.domain.OrderDetailDTO;



public interface OrderDetailMapper {
	public void insertOrderDetail(OrderDetailDTO emp);
	//R
	public List<OrderDetailDTO> selectOrderDetailList();
	public List<OrderDetailDTO> selectOrderDetailByName(String SearchWord);
	public OrderDetailDTO selectOrderDetail(String SearchWord);
	public int countOrderDetail();
	//U
	public void updateOrderDetail(OrderDetailDTO emp);
	//D
	public void deleteOrderDetail(OrderDetailDTO emp);
}
