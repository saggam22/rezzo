package com.rezzo.mes.prod.prog.service;

import java.util.List;

public interface ProgService {
	public List<ProgVO> indicaListModal(ProgVO vo);
	public List<ProgVO> getPrcsProg(ProgVO vo);
	public void insertEqmCd(ProgVO vo);
	public ProgVO selectEqm(ProgVO vo);
}