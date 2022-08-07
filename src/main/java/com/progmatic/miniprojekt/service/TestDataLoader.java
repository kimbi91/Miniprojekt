package com.progmatic.miniprojekt.service;

import com.progmatic.miniprojekt.modell.OrderSummary;
import com.progmatic.miniprojekt.repository.OrderSRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class TestDataLoader {

    private OrderSRepository orderSService;

    public TestDataLoader(OrderSRepository orderSService) {
        this.orderSService = orderSService;
    }

    public void loadData() {

        OrderSummary o1 = new OrderSummary("test1, test2, test3", "est1, est2, est3", 50.99);
        OrderSummary o2 = new OrderSummary("test11, test12, test13", "est11, est12, est13", 50.99);
        OrderSummary o3 = new OrderSummary("test21, test22, test23", "est21, est22, est23", 50.99);
        OrderSummary o4 = new OrderSummary("test31, test32, test33", "est31, est32, est33", 50.99);
        OrderSummary o5 = new OrderSummary("test41, test42, test43", "est41, est42, est43", 50.99);
        OrderSummary o6 = new OrderSummary("test51, test52, test53", "est51, est52, est53", 50.99);

        orderSService.saveAll(Arrays.asList(o1, o2, o3, o4, o5, o6));
    }
}
