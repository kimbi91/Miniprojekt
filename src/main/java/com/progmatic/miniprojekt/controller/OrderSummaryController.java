package com.progmatic.miniprojekt.controller;

import com.progmatic.miniprojekt.modell.OrderSummary;
import com.progmatic.miniprojekt.service.OrderSummaryService;
import com.progmatic.miniprojekt.service.TestDataLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class OrderSummaryController {

    private OrderSummaryService orderSummaryService;

    private TestDataLoader testDataLoader;

    public OrderSummaryController(OrderSummaryService orderSummaryService, TestDataLoader testDataLoader) {
        this.orderSummaryService = orderSummaryService;
        this.testDataLoader = testDataLoader;
    }

    @GetMapping("/home")
    public String getHome(Model model) {
        List<OrderSummary> orderSummaries = orderSummaryService.getAll();
        model.addAttribute("orders", orderSummaries);

        return "orders";
    }

    @GetMapping("/load")
    public String loadTestData() {
        testDataLoader.loadData();
        return "redirect:/home";
    }
}
