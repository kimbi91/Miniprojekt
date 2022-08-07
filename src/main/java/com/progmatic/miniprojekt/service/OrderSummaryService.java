package com.progmatic.miniprojekt.service;


import com.progmatic.miniprojekt.modell.OrderSummary;
import com.progmatic.miniprojekt.repository.OrderSRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class OrderSummaryService {

    private OrderSRepository orderSRepository;

    public OrderSummaryService(OrderSRepository orderSRepository) {
        this.orderSRepository = orderSRepository;
    }

    public List<OrderSummary> getAll() {
        return new ArrayList<>((Collection) orderSRepository.findAll());
    }

    public OrderSummary saveOrder(OrderSummary order) {
        orderSRepository.save(order);

        return order;
    }
}
