package com.rezzo.mes.comm.bom.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rezzo.mes.comm.bom.service.BomService;
import com.rezzo.mes.comm.bom.service.BomVO;

@Controller
public class BomController {
	
	@Autowired BomService service;
	
	@RequestMapping("bom")
	public String bom() {
		return "comm/bom";
	}

	@RequestMapping("getBomList")
	@ResponseBody
	public List<BomVO> getBomList(BomVO bomVO) {
		return service.getBomList(bomVO);
	}
	
	@RequestMapping("saveBom/{edctsCd}")
	@ResponseBody
	public void saveBom(@PathVariable("edctsCd") String edctsCd, @RequestBody List<BomVO> bomList) {
		service.saveBom(edctsCd, bomList);
	}
	
	@RequestMapping("delBom")
	public void delBom(BomVO bomVO) {
		service.delBom(bomVO);
	}
}