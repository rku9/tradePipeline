package com.rku.tradepipeline.controllers;


import com.rku.tradepipeline.dtos.OrderSaveRequest;
import com.rku.tradepipeline.dtos.OrderSaveResponse;
import com.rku.tradepipeline.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class OrderController {

    private final OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    //endpoint for receiving an order
    @PostMapping("/orders")
    public ResponseEntity<OrderSaveResponse> createOrder(
            @RequestBody OrderSaveRequest orderSaveRequest) {
        //we get the order from the generator, and then we save it in the db.
        boolean result = orderService.saveOrder(orderSaveRequest);
        return result ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }

}
