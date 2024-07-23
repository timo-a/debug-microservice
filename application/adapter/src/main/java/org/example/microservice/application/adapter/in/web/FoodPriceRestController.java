package org.example.microservice.application.adapter.in.web;

import lombok.RequiredArgsConstructor;
import org.example.microservice.application.core.ports.in.QueryFoodPricePort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prices")
@RequiredArgsConstructor
public class FoodPriceRestController {

    private final QueryFoodPricePort queryFoodPricePort;

    @GetMapping(value = "/{name}", produces = "application/json")
    public int getBook(@PathVariable String name) {
        return queryFoodPricePort.getPrice(name);
    }
}
