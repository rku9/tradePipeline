package com.rku.tradepipeline.dtos;

import com.rku.tradepipeline.enums.OrderSide;
import com.rku.tradepipeline.enums.OrderType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderSaveRequest {
    private OrderType orderType;
    private OrderSide orderSide;
    private String symbol;
    private BigDecimal requestedPrice;
    private BigDecimal requestedQuantity;
}
