package org.example.microservice.application.core.ports.out;

import org.example.microservice.application.core.domain.Pizza;

public interface FetchPizzaPort {

    Pizza fetchPizza(String order);
}
