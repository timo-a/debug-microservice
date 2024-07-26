package org.example.microservice.application.core.domain;

import org.junit.jupiter.api.Test;

import static org.example.microservice.application.core.domain.Assertions.assertThat;

class PersonTest {

    @Test
    void testPersonInCore() {
        assertThat(new Person("a", "b")).hasFirstName("a");
    }

}
