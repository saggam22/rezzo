package com.rezzo.mes.order.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

	@RequestMapping("/order.do")
	public String order() {
		return "order/order";
	}
}