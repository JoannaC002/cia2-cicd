
package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoApplicationTest {

    @Test
    void homeReturnsExpectedVersion() {
        DemoApplication app = new DemoApplication();
        assertEquals(
            "CIA 2 CI/CD Pipeline - Version 2? to check final flow",
            app.home()
        );
    }

    @Test
    void healthReturnsUp() {
        DemoApplication app = new DemoApplication();
        assertEquals("UP", app.health());
    }
}
