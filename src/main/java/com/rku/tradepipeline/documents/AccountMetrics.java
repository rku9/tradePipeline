package com.rku.tradepipeline.documents;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.UUID;

/*
this documents holds the data about the user accounts.
important details about the interaction b/w the user and the server.
when the user interacts, they are placing orders. those orders get matched,
and the user either spends or receives the amount.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Document(collection = "account_metrics")
public class AccountMetrics extends BaseDocument {
    private UUID userId;
    private int totalOrders;
    private int completedOrders;
    private int pendingOrders;
    private int cancelledOrders;
    private BigDecimal totalOrderValue; //sum of all the txns.

}
