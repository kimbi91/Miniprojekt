package com.progmatic.miniprojekt.repository;


import com.progmatic.miniprojekt.modell.OrderSummary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderSRepository extends CrudRepository<OrderSummary, Long> {
}
