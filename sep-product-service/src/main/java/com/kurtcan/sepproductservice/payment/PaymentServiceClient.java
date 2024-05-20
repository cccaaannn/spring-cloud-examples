package com.kurtcan.sepproductservice.payment;

import com.kurtcan.sepproductservice.shared.constant.ServiceName;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;
import java.util.UUID;

@FeignClient(ServiceName.PAYMENT)
public interface PaymentServiceClient {
    @GetMapping("/payments/{paymentId}")
    Optional<Payment> getPaymentById(@PathVariable("paymentId") UUID paymentId);
}

