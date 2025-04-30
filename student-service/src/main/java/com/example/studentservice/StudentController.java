package com.example.studentservice;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping("/{id}")
    public Map<String, String> getStudentById(@PathVariable String id) {
        return Map.of("id", id, "name", "Zhakyp", "major", "Software Engineering");
    }

    @GetMapping("/by-hobby/{hobby}")
    public Map<String, String> getByHobby(@PathVariable String hobby) {
        return Map.of("hobby", hobby, "favoriteDrink", "Tea", "name", "Zhakyp");
    }
}
