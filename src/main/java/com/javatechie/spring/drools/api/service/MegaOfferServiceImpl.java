package com.javatechie.spring.drools.api.service;

import com.javatechie.spring.drools.api.model.Order;
import com.javatechie.spring.drools.api.service.MegaOfferService;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MegaOfferServiceImpl implements MegaOfferService {

    @Autowired
    private KieSession session;

    @Override
    public Order getOfferDetails(Order order){
        session.insert(order);
        session.fireAllRules();
        return order;
    }
}
