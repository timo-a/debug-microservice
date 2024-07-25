package org.example.microservice.application.adapter.out.dummy;

import org.example.microservice.application.core.domain.Person;
import static org.example.microservice.application.core.domain.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void testPerson() {
        assertThat(new Person("a", "b")).hasFirstName("a");
    }

}
