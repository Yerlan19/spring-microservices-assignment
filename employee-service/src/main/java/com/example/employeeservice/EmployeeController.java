package com.example.employeeservice;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final AddressClient addressClient;

    public EmployeeController(AddressClient addressClient) {
        this.addressClient = addressClient;
    }

    @GetMapping("/{id}")
    public Map<String, Object> getEmployee(@PathVariable String id) {
        Map<String, Object> result = new HashMap<>();
        result.put("id", id);
        result.put("name", "Zhakyp");
        result.put("position", "Developer");
        result.put("address", addressClient.getAddress(id));
        return result;
    }

    @GetMapping("/by-hobby/{hobby}")
    public Map<String, String> getByHobby(@PathVariable String hobby) {
        return Map.of(
            "hobby", hobby,
            "favoriteSnack", "Chips",
            "employee", "Zhakyp"
        );
    }
}
