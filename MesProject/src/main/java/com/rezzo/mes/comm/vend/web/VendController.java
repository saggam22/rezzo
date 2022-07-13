package com.rezzo.mes.comm.vend.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rezzo.mes.comm.ccds.service.CcdsService;

@Controller
public class VendController {
	
	@Autowired CcdsService ccdsService;
	
	@GetMapping("vend")
	public String vend(Model model) {
		model.addAttribute("ccds", ccdsService.getCodes("EQM"));
		return "comm/vend";
	}
}
