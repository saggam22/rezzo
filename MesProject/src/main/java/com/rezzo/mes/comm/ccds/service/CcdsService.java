package com.rezzo.mes.comm.ccds.service;

import java.util.List;
import java.util.Map;

public interface CcdsService {
	
	public List<CcdsVO> ccdsList(CcdsVO ccdsVO);
	
	public List<CcdsVO> ccdsDtlList(String keyword);

	public List<CcdsVO> ccdsSelect(String keyword);

	public void ccdsInsert(CcdsVO ccdsVO);

	public void ccdsUpdate(CcdsVO ccdsVO);

	public void ccdsDelete(CcdsVO ccdsVO);
	
	public Map<String, List<CcdsVO>> getCcds(String ... ccdDtlNmList);

}
