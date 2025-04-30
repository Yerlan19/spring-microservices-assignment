package com.example.employeeservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "address-service", url = "http://localhost:8181")
public interface AddressClient {

    @GetMapping("/addresses/{employeeId}")
    Object getAddress(@PathVariable String employeeId);
}
