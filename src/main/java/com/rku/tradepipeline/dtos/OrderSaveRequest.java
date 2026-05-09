package com.rku.tradepipeline.dtos;

import com.rku.tradepipeline.enums.OrderSide;
import com.rku.tradepipeline.enums.OrderType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/*
this request is coming from the generator via http(for now).
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderSaveRequest {
    private OrderType orderType;
    private OrderSide orderSide;
    private String symbol;
    private BigDecimal priceRequested;
    private BigDecimal qtyRequested;
}
