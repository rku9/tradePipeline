package com.rku.tradepipeline.services;

import com.rku.tradepipeline.dtos.OrderSaveRequest;
import com.rku.tradepipeline.mappers.OrderMapper;
import com.rku.tradepipeline.models.Order;
import com.rku.tradepipeline.repositories.OrderRepository;
import com.rku.tradepipeline.repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;
    private final UserRepository userRepository;
    private final List<UUID> userIds = new ArrayList<>();

    public OrderService(OrderRepository orderRepository, OrderMapper orderMapper,
                        UserRepository userRepository) {
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void initiateUserIds(){
        //append all the ids to this list.
        userIds.addAll(userRepository.findAllIds());
    }
    public Order saveOrder(OrderSaveRequest orderSaveRequest) {
        Order order = orderMapper.toOrderFromOrderSaveRequest(orderSaveRequest);
        //fill the userId on random
        int totalUsers = userIds.size();
        order.setUserId(userIds.
                get(ThreadLocalRandom.current().nextInt(0, totalUsers)));
        return orderRepository.save(order);
    }
}
