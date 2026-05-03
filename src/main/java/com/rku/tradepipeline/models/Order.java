package com.rku.tradepipeline.models;

import com.rku.tradepipeline.enums.OrderSide;
import com.rku.tradepipeline.enums.OrderStatus;
import com.rku.tradepipeline.enums.OrderType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "orders")
@Data
@EqualsAndHashCode(callSuper = true)
public class Order extends BaseModel{
    private UUID userId;
    private String symbol;

    @Enumerated(EnumType.STRING)
    @Column(name = "side")
    private OrderSide orderSide;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private OrderType orderType;
    private BigDecimal priceRequested;
    private BigDecimal priceMatched;
    private BigDecimal qtyRequested;
    private BigDecimal qtyMatched;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private OrderStatus orderStatus;

    private String rejectedReason;
}
