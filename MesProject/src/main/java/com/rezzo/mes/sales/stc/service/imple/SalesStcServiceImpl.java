package com.rezzo.mes.sales.stc.service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rezzo.mes.sales.stc.mapper.SalesStcMapper;
import com.rezzo.mes.sales.stc.service.SalesStcService;
import com.rezzo.mes.sales.stc.service.SalesStcVO;

@Service
public class SalesStcServiceImpl implements SalesStcService{

	@Autowired SalesStcMapper mapper;

	@Override
	public List<SalesStcVO> makeDtSearch(SalesStcVO vo) {
		return mapper.makeDtSearch(vo);
	}

	//제품명 조회 모달
	@Override
	public List<SalesStcVO> getPrdtNm(SalesStcVO vo) {
		return mapper.getPrdtNm(vo);
	}

	//완제품 입출고, 수량 조회
	@Override
	public List<SalesStcVO> getSalesRecord(SalesStcVO vo) {
		return mapper.getSalesRecord(vo);
	}
	
	
}
