package org.example.microservice.application.adapter.out.dummy;

import static org.example.microservice.application.core.domain.test.Assertions.assertThat;

import org.example.microservice.application.core.domain.test.TestKlasse;
import org.junit.jupiter.api.Test;

public class TestFixturesTest {

    @Test
    void generatedAssertionsFromCoreShouldVisible() {
        assertThat(new TestKlasse("fooo")).hasFoo("fooo");
    }

}
