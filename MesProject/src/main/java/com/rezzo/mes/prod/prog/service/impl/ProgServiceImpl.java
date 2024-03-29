package com.rezzo.mes.prod.prog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import com.rezzo.mes.prod.prog.mapper.ProgMapper;
import com.rezzo.mes.prod.prog.service.ProgService;
import com.rezzo.mes.prod.prog.service.ProgVO;

@Service
public class ProgServiceImpl implements ProgService {
	
	@Autowired ProgMapper mapper;
	
	@Override
	public List<ProgVO> indicaListModal(ProgVO vo) {
		return mapper.indicaListModal(vo);
	}

	@Override
	public List<ProgVO> getPrcsProg(ProgVO vo) {
		return mapper.getPrcsProg(vo);
	}

	@Override
	public void insertEqmCd(ProgVO vo) {
		mapper.insertEqmCd(vo);
	}

	@Override
	@Transactional
	public ProgVO selectEqm(ProgVO vo) {
		return mapper.selectEqm(vo);
	}

	@Override
	public void updateOrderStatus(ProgVO vo) {
		mapper.updateOrderStatus(vo);
	}

	@Override
	public void updateEqm1(ProgVO vo) {
		mapper.updateEqm1(vo);
	}

	@Override
	public void updateEqm2(ProgVO vo) {
		mapper.updateEqm2(vo);
	}

	@Override
	public void insertProgPrcs(List<ProgVO> list) {
		for(ProgVO vo : list) {
			mapper.insertProgPrcs(vo);
		}
	}

	@Override
	public void insertInfer(ProgVO vo) {
		mapper.insertInfer(vo);
	}

	@Override
	public void insertEdctsInfo(ProgVO vo) {
		mapper.insertEdctsInfo(vo);
	}

	@Override
	public void schedule(String eqmCd, String eqmCd2) {
		mapper.schedule(eqmCd, eqmCd2);
	}

	@Override
	public void updateIndica(ProgVO vo) {
		mapper.updateIndica(vo);
	}

	@Override
	public List<ProgVO> getHolding(ProgVO vo) {
		return mapper.getHolding(vo);
	}

	@Override
	public List<ProgVO> getProgPrcs(ProgVO vo) {
		return mapper.getProgPrcs(vo);
	}

	@Override
	public void updateYn() {
		mapper.updateYn();
	}

	@Override
	public void updateYn2() {
		mapper.updateYn2();
	}

	@Override
	public List<ProgVO> getNoOprEqm() {
		return mapper.getNoOprEqm();
	}

	@Override
	public void insertOprEqm(List<ProgVO> list) {
		for(ProgVO vo : list) {
			mapper.insertOprEqm(vo);
		}
	}

	@Override
	public List<ProgVO> getNoOprEqm2() {
		return mapper.getNoOprEqm2();
	}

	@Override
	public void updateOprEqm(List<ProgVO> list) {
		for(ProgVO vo : list) {
			mapper.updateOprEqm(vo);
		}
	}
	
	
	
	


}
