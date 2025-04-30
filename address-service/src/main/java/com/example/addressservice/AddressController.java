package com.example.addressservice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @GetMapping("/{employeeId}")
    public Address getAddressByEmployeeId(@PathVariable String employeeId) {
        return new Address(employeeId, "Almaty", "Kazakhstan");
    }

    public record Address(String employeeId, String city, String country) {}
}
