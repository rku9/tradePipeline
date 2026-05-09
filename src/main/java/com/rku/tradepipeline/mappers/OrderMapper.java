package com.rku.tradepipeline.mappers;

import com.rku.tradepipeline.dtos.OrderSaveRequest;
import com.rku.tradepipeline.models.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    Order toOrderFromOrderSaveRequest(OrderSaveRequest orderSaveRequest);
}
