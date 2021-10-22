package com.acme.sales.orderline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/orderlines")
public class OrderlinesController {

	@Autowired
	private OrderlineRepository ordlinerepo;
	
	@GetMapping
	private Iterable<Orderline> GetAll(){
		return ordlinerepo.findAll();
	}
}
