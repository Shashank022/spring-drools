package com.javatechie.spring.drools.api.service;

import com.javatechie.spring.drools.api.model.Order;
import org.springframework.stereotype.Service;

public interface MegaOfferService {
    Order getOfferDetails(Order order);
}
