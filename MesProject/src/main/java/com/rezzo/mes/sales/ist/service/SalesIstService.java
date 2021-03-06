package com.rezzo.mes.sales.ist.service;

import java.util.List;

import com.rezzo.mes.qc.insp.service.PrdtInspVO;

public interface SalesIstService {
	
	//제품 입고 등록&수정 - 제품 입고번호 생성, 등록 시 출력
	public void saveIst(SalesIstVO vo);
	//제품 입고 조건별 조회 - 현재 날짜 기준으로
	public List<SalesIstVO> salesIstList(SalesIstVO vo);
	//완제품LOT번호 모달 조회
	public List<PrdtInspVO> getLotList(PrdtInspVO vo);
}
