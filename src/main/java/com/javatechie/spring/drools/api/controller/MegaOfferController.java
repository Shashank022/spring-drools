package com.javatechie.spring.drools.api.controller;

import com.javatechie.spring.drools.api.model.Order;
import com.javatechie.spring.drools.api.service.MegaOfferService;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MegaOfferController {

	@Autowired
	MegaOfferService megaOfferService;

	@PostMapping("/order")
	public Order orderNow(@RequestBody Order order) {
		megaOfferService.getOfferDetails(order);
		return order;
	}

}
