package com.rezzo.mes.sales.order.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.sales.order.mapper.OrderMapper;
import com.rezzo.mes.sales.order.service.OrderService;
import com.rezzo.mes.sales.order.service.OrderVO;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired OrderMapper mapper;

	//주문서 전체 조회
	@Override
	public List<OrderVO> searchOrdr(OrderVO vo) {
		return mapper.searchOrdr(vo);
	}

	//주문서 등록
	@Override
	public void addOrdr(List<OrderVO> list) {
		for(OrderVO vo : list) {			
			mapper.addOrdr(vo);
		}	
	}
	
	//거래처 목록 조회 모달창
	@Override
	public List<OrderVO> comSearch(OrderVO vo) {
		return mapper.comSearch(vo);
	}
	
	//제품명 목록 조회 모달창
	@Override
	public List<OrderVO> proSearch(OrderVO vo) {
		return mapper.proSearch(vo);
	}
	
	//조건별 주문서 조회
		@Override
	public List<OrderVO> findOrdr(OrderVO vo) {
		return mapper.findOrdr(vo);
	}
		
	//주문서 삭제

}
