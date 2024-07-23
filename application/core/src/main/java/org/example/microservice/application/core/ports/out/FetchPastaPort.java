package org.example.microservice.application.core.ports.out;

import org.example.microservice.application.core.domain.Pasta;

public interface FetchPastaPort {

    Pasta fetchPasta(String order);
}
