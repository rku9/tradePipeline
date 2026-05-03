package com.rku.tradepipeline.repositories;

import com.rku.tradepipeline.models.Order;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<Order, UUID> {

    public Order getById(@NonNull UUID id);
}
