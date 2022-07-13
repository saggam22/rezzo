package com.rezzo.mes.sales.order.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.rezzo.mes.resour.insp.vo.OrdrVO;
import com.rezzo.mes.sales.order.service.OrderVO;

public interface OrderMapper {
	
	//전체주문서 조회
	public List<OrderVO> searchOrdr(OrderVO vo);
	//주문서 등록
	public void addOrdr(OrderVO vo);
	//거래처 목록 조회 모달창
	public List<OrderVO> comSearch(OrderVO vo);	
	//제품명 목록 조회 모달창
	public List<OrderVO> proSearch(OrderVO vo);
	//조건별 주문서 조회
	public List<OrderVO> findOrdr(OrderVO vo);
	//주문서 삭제
}
