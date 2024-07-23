package org.example.microservice.application.adapter.out.dummy;

import org.example.microservice.application.core.domain.Pizza;
import org.example.microservice.application.core.ports.out.FetchPizzaPort;
import org.springframework.stereotype.Component;

@Component
public class PizzaStorageAdaper implements FetchPizzaPort {

    @Override
    public Pizza fetchPizza(String order) {
        return new Pizza(order, order.length());
    }
}
