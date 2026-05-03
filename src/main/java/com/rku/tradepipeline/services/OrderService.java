package com.rku.tradepipeline.services;

import com.rku.tradepipeline.dtos.OrderSaveRequest;
import com.rku.tradepipeline.enums.OrderSide;
import com.rku.tradepipeline.enums.OrderType;
import com.rku.tradepipeline.models.Order;
import com.rku.tradepipeline.repositories.OrderRepository;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public boolean saveOrder(OrderSaveRequest orderSaveRequest) {
        Order order = new Order();
        order.setOrderSide(orderSaveRequest.getOrderType(), orderSaveRequest.getOrderSide(),
                orderSaveRequest.getSymbol(), orderSaveRequest.getRequestedPrice(),
                orderSaveRequest.getRequestedQuantity());
        return orderRepository.save(orderSaveRequest);
    }
}
private OrderType orderType;
private OrderSide orderSide;
private String symbol;
private BigDecimal requestedPrice;
private BigDecimal requestedQuantity;