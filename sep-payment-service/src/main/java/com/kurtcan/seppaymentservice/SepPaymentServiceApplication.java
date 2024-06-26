package com.kurtcan.seppaymentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class SepPaymentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SepPaymentServiceApplication.class, args);
    }

}
