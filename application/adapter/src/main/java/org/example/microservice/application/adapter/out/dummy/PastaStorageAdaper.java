package org.example.microservice.application.adapter.out.dummy;

import org.example.microservice.application.core.domain.Pasta;
import org.example.microservice.application.core.ports.out.FetchPastaPort;
import org.springframework.stereotype.Component;

@Component
public class PastaStorageAdaper implements FetchPastaPort {

    @Override
    public Pasta fetchPasta(String order) {
        return new Pasta("Spaghetti", 50 + ((int)(20 * Math.random())));
    }
}
