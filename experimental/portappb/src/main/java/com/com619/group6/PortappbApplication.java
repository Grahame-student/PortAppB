package com.com619.group6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//CHECKSTYLE:OFF
// Annotation doesn't allow the class to be declared as final
@SpringBootApplication
//CHECKSTYLE:ON
public class PortappbApplication {
    private PortappbApplication() {
    }

    static void main(final String[] args) {
        SpringApplication.run(PortappbApplication.class, args);
    }
}
