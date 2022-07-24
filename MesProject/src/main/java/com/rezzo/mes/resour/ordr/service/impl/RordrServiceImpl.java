package com.rezzo.mes.resour.ordr.service.impl;

import com.rezzo.mes.resour.ordr.mapper.RscOrdrMapper;
import com.rezzo.mes.resour.ordr.service.RscOrdrService;
import com.rezzo.mes.resour.ordr.service.RscOrdrVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RordrServiceImpl implements RscOrdrService {

	@Autowired
	RscOrdrMapper mapper;

	@Override
	public List<RscOrdrVO> RscOrdrList(RscOrdrVO vo) {
		return mapper.RscOrdrList(vo);
	}

	@Override
	public List<RscOrdrVO> rscOrdrCd(RscOrdrVO vo) {
		return mapper.rscOrdrCd(vo);
	}

	@Override
	public List<RscOrdrVO> rscCOrdrList(RscOrdrVO vo) {
		return mapper.rscCOrdrList(vo);
	}

	@Override
	public List<RscOrdrVO> rscSOrdrList(RscOrdrVO vo) {
		return mapper.rscSOrdrList(vo);
	}

	@Override
	public List<RscOrdrVO> rscRowSelectList(RscOrdrVO vo) {
		return mapper.rscRowSelectList(vo);
	}

	@Override
	public void rscOrdrInsert(List<RscOrdrVO> ordrList) {
		for(int i=0; i<ordrList.size(); i++) {
			mapper.rscOrdrInsert(ordrList);
		}
	}

	@Override
	public void rscOrdrFInsert(List<RscOrdrVO> ordrFList) {
		System.out.println(ordrFList);
		mapper.rscOrdrFInsert(ordrFList);
	}
	
}
