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

        OrderSummary o1 = new OrderSummary("Cézár Saláta, Borsos tokány, Palacsinta", "Kóla, Sör, Almalé", 30.99);
        OrderSummary o2 = new OrderSummary("Húsleves, Rizseshús, Palacsinta", "Kóla, Bor, Pálinka", 45.99);
        OrderSummary o3 = new OrderSummary("Húsleves, Cézár Saláta, Palacsinta", "Bor, Pálinka, Fanta", 22.99);
        OrderSummary o4 = new OrderSummary("Húsleves, Pörkölt, Rizseshús", "Sör, Kóla, Almalé", 60.99);
        OrderSummary o5 = new OrderSummary("Borsos tokány, Rizseshús, Pörkölt", "Pálinka, Sör, Bor", 70.99);
        OrderSummary o6 = new OrderSummary("Borsos tokány, Palacsinta, Cézár Saláta", "Almalé, Kóla, Pálinka", 33.99);

        orderSService.saveAll(Arrays.asList(o1, o2, o3, o4, o5, o6));
    }
}
