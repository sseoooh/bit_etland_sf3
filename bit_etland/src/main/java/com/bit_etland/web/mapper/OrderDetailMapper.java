package com.bit_etland.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.OrderDetailDTO;


@Component
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
