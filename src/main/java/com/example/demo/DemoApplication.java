
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    public void testIssue() {
    int number = 10;
   }

    @GetMapping("/")
    public String home() {
        return "CIA 2 CI/CD Pipeline - Version 4? to check final flow";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}
