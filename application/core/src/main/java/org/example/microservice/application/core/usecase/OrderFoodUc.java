package org.example.microservice.application.core.usecase;

import lombok.RequiredArgsConstructor;
import org.example.microservice.application.core.ports.in.QueryFoodPricePort;
import org.example.microservice.application.core.ports.out.FetchPastaPort;
import org.example.microservice.application.core.ports.out.FetchPizzaPort;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderFoodUc implements QueryFoodPricePort {

    private final FetchPastaPort fetchPastaPort;

    private final FetchPizzaPort fetchPizzaPort;

    @Override
    public int getPrice(String name) {

        if (name.startsWith("Pizza"))
            return fetchPizzaPort.fetchPizza(name).price();
        else
            return fetchPastaPort.fetchPasta(name).getPrice();
    }
}
